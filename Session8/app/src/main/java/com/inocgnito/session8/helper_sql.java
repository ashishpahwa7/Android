package com.inocgnito.session8;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Desmond on 16-02-2016.
 */

public class helper_sql extends SQLiteOpenHelper
{

    public static SQLiteDatabase SQL_data;

    public helper_sql(Context context)
    {
        super(context, "imagine_data.sqlite", null, 3);
        SQL_data = getWritableDatabase();
    }


    @Override
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL("CREATE TABLE imagine(UserName varchar(25) Primary Key, Password varchar(100) " +
                "not null");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
