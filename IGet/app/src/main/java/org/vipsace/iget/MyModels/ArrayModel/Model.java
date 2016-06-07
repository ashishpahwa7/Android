package org.vipsace.iget.MyModels.ArrayModel;

import java.util.ArrayList;

/**
 * Created by ash on 19/2/16.
 */
public class Model {

    private String error;
    private ArrayList<DataModel> data;


    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public ArrayList<DataModel> getData() {
        return data;
    }

    public void setData(ArrayList<DataModel> data) {
        this.data = data;
    }
}
