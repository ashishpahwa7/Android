package com.example.desmond.genie;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Desmond on 19-02-2016.
 */
public class helper_sql extends SQLiteOpenHelper
{
    public static SQLiteDatabase SQL_data;

    public helper_sql(Context context)
    {
        super(context, "genie.sqlite", null, 3);
        SQL_data = getWritableDatabase();
    }


    @Override
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL("CREATE TABLE genieData(FName varchar(30) Not Null,LName varchar(30) Not " +
                "Null," +
                " " +
                " userName varchar(30) Primary Key, Gender varchar(10) Not Null, DOB varchar(30)," +
                "Password varchar(30) Not Null");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
