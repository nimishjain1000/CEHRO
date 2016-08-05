package com.example.arora.cehroindia;

import android.widget.TextView;

/**
 * Created by mac on 20/07/16.
 */

public class Program {

    private int mImageResourceId  = NO_IMAGE_AVAILABLE;
    private String mTitle;
    private String mDescription;
    private String mName;

    public static final int NO_IMAGE_AVAILABLE = -1;
    public static final String NO_NAME_AVAILABLE = "NO NAME";

    //for a program item
    public Program(int imageResourceId, String title, String description){
        mImageResourceId = imageResourceId;
        mTitle = title;
        mDescription = description;
    }

    //for a team member
    public Program(int imageResourceId, String name, String title, String description){
        mImageResourceId = imageResourceId;
        mName = name;
        mTitle = title;
        mDescription = description;

    }

    public int getimageResourceId(){
       return mImageResourceId;
    }

    public String getTitle(){
        return mTitle;
    }

    public String getDescription(){
        return mDescription;
    }

    public String getName(){
        return mName;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_AVAILABLE;
    }

    public boolean hasName(){
        return mName != NO_NAME_AVAILABLE;
    }
}
