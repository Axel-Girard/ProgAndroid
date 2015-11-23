package com.adeuza;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class PhotoAdapter extends ArrayAdapter<Photo> {

	private List<Photo> photos;

	private LayoutInflater inflater;

	public PhotoAdapter(Context context, int textViewResourceId,
			List<Photo> p_listPhotos) {
		super(context, textViewResourceId, p_listPhotos);
		this.inflater = LayoutInflater.from(context);
		this.photos = p_listPhotos;
	}

	@Override
	public View getView(int position, View p_oConvertView, ViewGroup parent) {

		if (p_oConvertView == null) {
			p_oConvertView = inflater.inflate(R.layout.photo_listitem, null);
		}

		TextView oTitleView = (TextView) p_oConvertView.findViewById(R.id.photoTitle);
		oTitleView.setText(photos.get(position).getTitle());

		return p_oConvertView;
	}
	
	@Override
	public long getItemId(int position) {
		return this.photos.get(position).getId();
	}
}
