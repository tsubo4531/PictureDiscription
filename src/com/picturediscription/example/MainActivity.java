package com.picturediscription.example;

import android.app.Activity;
import android.graphics.Bitmap;
//import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.*;
import android.widget.AdapterView.OnItemClickListener;
import android.view.*;

public class MainActivity extends Activity {
    private ImageView mImageView;
    private Integer[] mThumbIds = { R.drawable.p1, R.drawable.p2,R.drawable.p3, R.drawable.p4, R.drawable.p5,
    		R.drawable.p9, R.drawable.aburana,R.drawable.sakura};


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
        mImageView = (ImageView) findViewById(R.id.imageView1);
        // サムネイルのギャラリーを作成
        setGallery();
	}
	
    public void setGallery() {
        Gallery g = (Gallery) findViewById(R.id.gallery1);
        g.setAdapter(new ImageAdapter(this, mThumbIds));

        g.setOnItemClickListener(new OnItemClickListener() {
                public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                        Toast.makeText(MainActivity.this, "" + position, Toast.LENGTH_SHORT).show();
                }
        });
    }

    public void setImageBitmap(Bitmap bmp) {
        mImageView.setImageBitmap(bmp);
    }

	
	

//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.main, menu);
//		return true;
//	}
//
//	@Override
//	public boolean onOptionsItemSelected(MenuItem item) {
//		// Handle action bar item clicks here. The action bar will
//		// automatically handle clicks on the Home/Up button, so long
//		// as you specify a parent activity in AndroidManifest.xml.
//		int id = item.getItemId();
//		if (id == R.id.action_settings) {
//			return true;
//		}
//		return super.onOptionsItemSelected(item);
//	}
}
