package com.picturediscription.example;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.*;


public class ImageDiscription extends Activity{
	private ImageView image1;
	private TextView text1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.image_item);

		image1 = (ImageView) findViewById(R.id.image_view);
		text1 = (TextView) findViewById(R.id.textView1);		
		
		Intent data = getIntent();
		Bundle extras = data.getExtras();
		String disp_pict = extras != null ? extras.getString("SELECTED_PICT") : "";
		if(disp_pict.equals("p1")){
			image1.setImageResource(R.drawable.p1);
			text1.setText(getString(R.string.p1_str));
		}else if(disp_pict.equals("p2")){
			image1.setImageResource(R.drawable.p2);
			text1.setText(getString(R.string.p2_str));
		}else if(disp_pict.equals("p3")){
			image1.setImageResource(R.drawable.p3);
			text1.setText(getString(R.string.p3_str));
		}else if(disp_pict.equals("p4")){
			image1.setImageResource(R.drawable.p4);				
			text1.setText(getString(R.string.p4_str));
		}else if(disp_pict.equals("p5")){
			image1.setImageResource(R.drawable.p5);		
			text1.setText(getString(R.string.p5_str));
		}else if(disp_pict.equals("aburana")){
			image1.setImageResource(R.drawable.aburana);
			text1.setText(getString(R.string.p6_str));
		}else if(disp_pict.equals("sakura")){
			image1.setImageResource(R.drawable.sakura);
			text1.setText(getString(R.string.p7_str));
		}

		
	}
}

