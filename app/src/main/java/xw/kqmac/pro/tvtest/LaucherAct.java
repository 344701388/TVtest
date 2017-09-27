package xw.kqmac.pro.tvtest;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;

/**
 * Created by user on 17/9/24.
 */


    import android.os.Bundle;
    import android.app.Activity;
    import android.view.Menu;

    /**
     * 程序主入口
     * @author liuyazhuang
     *
     */
    public class LaucherAct extends Activity {

        private GalleryFlow gallery_flow;
        //存放图片id的数组
        private int[] imageIds;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_laucher);
            //构造存放图片id的数组
            imageIds = new int[]{
                    R.drawable.timg1,
                    R.drawable.timg2,
                    R.drawable.timg3,
                    R.drawable.timg4,
                    R.drawable.timg5,
                    R.drawable.timg6,
                    R.drawable.timg7,
                    R.drawable.timg9
            };
            gallery_flow = (GalleryFlow) findViewById(R.id.gallery_flow);
            //实例化ImageAdapter对象
            ImageAdapter adapter = new ImageAdapter(this, imageIds);
            //向图片数组中加载图片
            adapter.createRefectedBitmap();
            gallery_flow.setAdapter(adapter);
        }



    }
