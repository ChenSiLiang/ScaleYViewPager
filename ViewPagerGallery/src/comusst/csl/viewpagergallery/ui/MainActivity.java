package comusst.csl.viewpagergallery.ui;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class MainActivity extends Activity {

	private ViewPager mPager;

	private MyViewPagerAdapter mAdapter;

	private List<Integer> mList;

	private static final int PAGER_DIS = -350;

	private static final int HALF_PAGER_DIS = 130;

	private static final int PAGER_LIMIT = 3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mPager = (ViewPager) findViewById(R.id.view_pager);
		mPager.setOffscreenPageLimit(PAGER_LIMIT);
		mPager.setPageMargin(PAGER_DIS);
		mList = new ArrayList<Integer>();
		mList.add(R.drawable.one);
		mList.add(R.drawable.two);
		mList.add(R.drawable.three);
		mList.add(R.drawable.four);
		mList.add(R.drawable.five);
		mList.add(R.drawable.six);
		mAdapter = new MyViewPagerAdapter(mList);
		mPager.setAdapter(mAdapter);
		mPager.setPageTransformer(true, new ScaleYPageTransformer());
	}

	private class MyViewPagerAdapter extends PagerAdapter {

		private List<Integer> mList;

		public MyViewPagerAdapter(List<Integer> list) {
			this.mList = list;
		}

		@Override
		public int getCount() {
			return mList.size();
		}

		@Override
		public boolean isViewFromObject(View arg0, Object arg1) {
			return arg0 == arg1;
		}

		@Override
		public Object instantiateItem(ViewGroup container, int position) {
			ImageView img = new ImageView(MainActivity.this);
			img.setImageResource(mList.get(position));
			img.setPadding(HALF_PAGER_DIS, 16, HALF_PAGER_DIS, 16);
			((ViewPager) container).addView(img, position);
			return img;
		}

		@Override
		public void destroyItem(ViewGroup container, int position, Object object) {
			((ViewPager) container).removeView((ImageView) object);
		}

	}
}
