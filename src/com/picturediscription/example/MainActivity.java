package com.picturediscription.example;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.view.View.OnClickListener;

public class MainActivity extends Activity{
	private ImageButton imgbtn1;
	private ImageView imgbtn2;
	private ImageView imgbtn3;
	private ImageView imgbtn4;
	private ImageView imgbtn5;
	private ImageView imgbtn6;
	private ImageView imgbtn7;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		imgbtn1 = (ImageButton) findViewById(R.id.imageButton1);
		imgbtn1.setOnClickListener(new ImageClickListener());
		imgbtn2 = (ImageView) findViewById(R.id.imageButton2);
		imgbtn2.setOnClickListener(new ImageClickListener());
		imgbtn3 = (ImageView) findViewById(R.id.imageButton3);
		imgbtn3.setOnClickListener(new ImageClickListener());
		imgbtn4 = (ImageView) findViewById(R.id.imageButton4);
		imgbtn4.setOnClickListener(new ImageClickListener());
		imgbtn5 = (ImageView) findViewById(R.id.imageButton5);
		imgbtn5.setOnClickListener(new ImageClickListener());
		imgbtn6 = (ImageView) findViewById(R.id.imageButton6);
		imgbtn6.setOnClickListener(new ImageClickListener());
		imgbtn7 = (ImageView) findViewById(R.id.imageButton7);
		imgbtn7.setOnClickListener(new ImageClickListener());
		
	}
	
	class ImageClickListener implements OnClickListener{
		@Override
		public void onClick(View v) {
			Intent intent = new Intent(MainActivity.this, ImageDiscription.class);
			if(v == imgbtn1){
				intent.putExtra("SELECTED_PICT", "p1");
			}else if(v == imgbtn2){
				intent.putExtra("SELECTED_PICT", "p2");
			}else if(v == imgbtn3){
				intent.putExtra("SELECTED_PICT", "p3");
			}else if(v == imgbtn4){
				intent.putExtra("SELECTED_PICT", "p4");
			}else if(v == imgbtn5){
				intent.putExtra("SELECTED_PICT", "aburana");
			}else if(v == imgbtn6){
				intent.putExtra("SELECTED_PICT", "sakura");
			}else if(v == imgbtn7){
				intent.putExtra("SELECTED_PICT", "p5");
			}
			
			startActivity(intent);

		}		
		
	}
}
