package com.example.coursify.view;

import android.support.v4.app.Fragment;

public abstract class MainActivityHoldingFragment extends Fragment {
	private MainActivity main;

	public void setMain(MainActivity main) {
		this.main = main;
	}

	public MainActivity getMain() {
		return this.main;
	}
}