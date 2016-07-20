package com.example.arora.cehroindia;

import android.widget.TextView;

/**
 * Created by mac on 20/07/16.
 */

public class Program {

    private int mImageResourceId  = NO_IMAGE_AVAILABLE;
    private String mTitle;
    private String mDescription;

    public static final int NO_IMAGE_AVAILABLE = -1;

    public Program(int imageResourceId, String title, String description){
        mImageResourceId = imageResourceId;
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

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_AVAILABLE;
    }
}
