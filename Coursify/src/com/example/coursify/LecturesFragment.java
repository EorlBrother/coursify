package com.example.coursify;

import java.util.ArrayList;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.coursify.model.Lecture;
import com.example.coursify.view.MainActivityHoldingFragment;

public class LecturesFragment extends MainActivityHoldingFragment {

	private final ArrayList<Lecture> lectures = getLectures();

	private ArrayList<Lecture> getLectures() {
		return new ArrayList<Lecture>();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		return inflater.inflate(R.layout.fragment_lectures, container, false);
	}
}
