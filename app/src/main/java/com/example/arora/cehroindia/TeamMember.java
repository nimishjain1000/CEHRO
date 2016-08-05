package com.example.arora.cehroindia;

/**
 * Created by mac on 05/08/16.
 */

public class TeamMember {

    private int mImageResourceId;
    private String mTitle;
    private String mDescription;

    public TeamMember(int imageResourceId, String title, String description){
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
}
