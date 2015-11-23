package org.training.android.td1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.listview_layout);
	
		String[] oArtisteArray = getResources().getStringArray(R.array.artistes_array); 
		
		final ListView oUiListView1=(ListView)this.findViewById(R.id.listview1);
		final ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_single_choice,oArtisteArray);
		oUiListView1.setAdapter(adapter);

		oUiListView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
				Toast.makeText(getApplicationContext(), adapter.getItem(oUiListView1.getCheckedItemPosition()), Toast.LENGTH_SHORT).show();
			}
		});
	}
}
