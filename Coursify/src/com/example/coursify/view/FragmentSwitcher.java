package com.example.coursify.view;

import android.support.v4.widget.DrawerLayout;

public class FragmentSwitcher {

	public static void switchToFragment(
			MainActivityHoldingFragment destination, MainActivity main) {
		DrawerLayout drawer = main.getDrawerLayout();
		drawer.removeViewAt(0);
		destination.setMain(main);
		drawer.addView(
				destination.onCreateView(main.getLayoutInflater(),
						main.getDrawerLayout(), null), 0);
	}
}
