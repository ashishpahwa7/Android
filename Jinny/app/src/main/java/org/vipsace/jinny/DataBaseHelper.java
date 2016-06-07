package org.vipsace.jinny;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by ash on 20/2/16.
 */
public class DataBaseHelper extends SQLiteOpenHelper {



    public static SQLiteDatabase abc;

    public DataBaseHelper(Context context) {


        super(context, "jinny.sqlite", null, 3);

        abc = getWritableDatabase();
    }

    @Override


    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table Jinny(\n" +
                "fname varchar(30),\n" +
                "lname varchar(30),\n" +
                "username varchar(30),\n" +
                "gender varchar(20),\n" +
                "dob varchar(30),\n" +
                "password varchar(30)\n" +
                ");");

        db.execSQL("create table Wishes( username varchar(20),wish varchar(100) ); ");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }



}
