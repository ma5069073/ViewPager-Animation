package com.mkk.viewpager_animation;

import com.nineoldandroids.view.ViewHelper;

import android.support.v4.view.ViewPager.PageTransformer;
import android.view.View;

public class RotateDownPageTransformer implements PageTransformer {

	private static final float MAX_ROTATE = 20f;
	float mat;

	@Override
	public void transformPage(View page, float position) {

		int pageWidth = page.getWidth();

		// A页0~-20 B页20~0
		if (position < -1) {
			ViewHelper.setRotation(page, 0);
		} else if (position <= 0) {
			mat = position*MAX_ROTATE;
			ViewHelper.setPivotX(page, pageWidth);
			ViewHelper.setPivotY(page, page.getMeasuredHeight());
			ViewHelper.setRotation(page, mat);

		} else if (position <= 1) {
			mat = position*MAX_ROTATE;
			ViewHelper.setPivotX(page, pageWidth);
			ViewHelper.setPivotY(page, page.getMeasuredHeight());
			ViewHelper.setRotation(page, mat);
		} else {
			ViewHelper.setRotation(page, 0);
		}
	}

}
