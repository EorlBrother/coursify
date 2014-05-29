package com.example.coursify.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.example.coursify.R;

public class MainMenuFragment extends MainActivityHoldingFragment {
	private View view;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		view = inflater.inflate(R.layout.fragment_main_menu, container, false);

		// Für Testzwecke erstmal ohne Absicherung
		// try {
		ListView menuItemsList = (ListView) view
				.findViewById(R.id.menu_items_list);
		initializeMenuItemsList(menuItemsList);
		// } finally {
		return view;
		// }
	}

	private void initializeMenuItemsList(ListView menuItemsList) {
		menuItemsList.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// Da diese Liste statisch ist, werden hier bekannte Positonen
				// verwendet
				switch (position) {
				case 0:
					FragmentSwitcher.switchToFragment(new MyLecturesFragment(),
							getMain());
					break;
				case 1:
					FragmentSwitcher.switchToFragment(new LectureFragment(),
							getMain());
					break;
				case 2:

					break;
				default:

					break;
				}
			}

		});

	}
}
