package org.training.android.td1;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

public class HelloTabedWorld extends TabActivity {

	TabHost tabHost;
	Intent intent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tabhost);
		tabHost = this.getTabHost(); // Le TabHost
		TabHost.TabSpec spec; // l'Objet TabSpec pour construire les onglets

		Intent tabIntent = null;

		// Initialisation du premier tabspec et ajout au tabHost
		tabIntent = new Intent(this, ListViewActivity.class);
		spec = tabHost
				.newTabSpec("list")
				.setIndicator("List",
						this.getResources().getDrawable(android.R.drawable.ic_menu_sort_by_size))
				.setContent(tabIntent);
		tabHost.addTab(spec);
 
		
		// Initialisation du premier tabspec et ajout au tabHost
		tabIntent = new Intent(this, LinearLayoutActivity.class);
		spec = tabHost
				.newTabSpec("linear")
				.setIndicator("Linear",
						this.getResources().getDrawable(android.R.drawable.ic_media_next))
				.setContent(tabIntent);
		tabHost.addTab(spec);

		// Bis...
		tabIntent = new Intent(this, TableLayoutActivity.class);
		spec = tabHost
				.newTabSpec("table")
				.setIndicator("Table",
						this.getResources().getDrawable(android.R.drawable.ic_menu_camera))
				.setContent(tabIntent);
		tabHost.addTab(spec);

		// Ter
		tabIntent = new Intent(this, RelativeLayoutActivity.class);
		spec = tabHost
				.newTabSpec("relatif")
				.setIndicator("Relatif",
						this.getResources().getDrawable(android.R.drawable.ic_media_play))
				.setContent(tabIntent);
		tabHost.addTab(spec);


		// Initialisation du premier tabspec et ajout au tabHost
		tabIntent = new Intent(this, ArtisteActivity.class);
		spec = tabHost
				.newTabSpec("Artiste")
				.setIndicator("Artiste",
						this.getResources().getDrawable(android.R.drawable.ic_menu_sort_by_size))
				.setContent(tabIntent);
		tabHost.addTab(spec);

		// Quel onglet afficher à l'init ?
		tabHost.setCurrentTab(0);

	}
}
