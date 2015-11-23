package com.adeuza.formation.android.tp1.db;

import java.util.ArrayList;
import java.util.List;

import com.adeuza.formation.android.tp1.Artiste;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class ArtisteDao {

	public static final String TABLE_ARTISTE = "T_ARTISTE";
	public static final String COL_ID = "ID";
	public static final String COL_NOM = "NOM";
	
	private static final int VERSION_BDD = 1;
	private static final String NOM_BDD = "artistes.db";
	
	private SQLiteDatabase bdd;
	
	private MyDBOpenHelper openHelper ;
	
	public ArtisteDao(Context context){
		//On créer la BDD et sa table
		openHelper = new MyDBOpenHelper(context, NOM_BDD, null, VERSION_BDD);
	}
	
	public void open(){
		bdd = openHelper.getWritableDatabase();
	}
 
	public void close(){
		bdd.close();
	}
	
	public SQLiteDatabase getBDD(){
		return bdd;
	}
	
	public List<Artiste> getListArtiste() {
		List<Artiste> r_oListArtiste = new ArrayList<Artiste>();
		Cursor oCursor = null ; //TODO
		if ( oCursor != null ) {
			try {
				while( oCursor.moveToNext()) {
					r_oListArtiste.add( bindRowToArtiste(oCursor));
				}
			} finally {
				oCursor.close();
			}
		}
		return r_oListArtiste;
	}
	
	private Artiste bindRowToArtiste(Cursor p_oCursor){ 
		Artiste Artiste = new Artiste();
		//TODO
		return Artiste;
	}
}
