package com.mkk.viewpager_animation;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

public class MainActivity extends Activity {

	ViewPager mViewPager;
	int[] imgs = { R.drawable.guide_image1, R.drawable.guide_image2,
			R.drawable.guide_image3 };
	List<ImageView> list = new ArrayList<ImageView>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mViewPager = (ViewPager) findViewById(R.id.vp);
		//为ViewPager添加动画效果
		mViewPager.setPageTransformer(true, new RotateDownPageTransformer());
		mViewPager.setAdapter(new PagerAdapter() {
			
			
			@Override
			public Object instantiateItem(ViewGroup container, int position) {
				ImageView iv = new ImageView(MainActivity.this);
				iv.setImageResource(imgs[position]);
				iv.setScaleType(ScaleType.CENTER_CROP);
				container.addView(iv);
				list.add(iv);
				
				return iv;
			}
			
			@Override
			public void destroyItem(ViewGroup container, int position,
					Object object) {
				container.removeView(list.get(position));
			}

			@Override
			public boolean isViewFromObject(View arg0, Object arg1) {
				// TODO Auto-generated method stub
				return arg0 == arg1;
			}

			@Override
			public int getCount() {
				// TODO Auto-generated method stub
				return imgs.length;
			}
		});
	}
}
