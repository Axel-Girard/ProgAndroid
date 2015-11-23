package com.adeuza.formation.android.tp1.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;

public class MyDBOpenHelper extends SQLiteOpenHelper {

	private static final String CREATE_BDD = "CREATE TABLE " + ArtisteDao.TABLE_ARTISTE + " ("
			+ ArtisteDao.COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + ArtisteDao.COL_NOM + " TEXT NOT NULL);";
	
	private static final String[] INIT_SQL = {
		"INSERT INTO " + ArtisteDao.TABLE_ARTISTE + "(" + ArtisteDao.COL_ID + "," + ArtisteDao.COL_NOM + ") VALUES (1, \"Messi\");",
		"INSERT INTO " + ArtisteDao.TABLE_ARTISTE + "(" + ArtisteDao.COL_ID + "," + ArtisteDao.COL_NOM + ") VALUES (2, \"Benzema\");",
	};
	
	public MyDBOpenHelper(Context context, String name, CursorFactory factory,
			int version) {
		super(context, name, factory, version);
	}

	@Override
	public void onCreate(SQLiteDatabase p_oDatabase) {
		p_oDatabase.execSQL(CREATE_BDD);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		db.execSQL("DROP TABLE " + ArtisteDao.TABLE_ARTISTE + ";");
		onCreate(db);
	}
}
