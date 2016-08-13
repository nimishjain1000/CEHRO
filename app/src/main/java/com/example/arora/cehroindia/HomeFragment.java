package com.example.arora.cehroindia;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerSupportFragment;

import java.net.URL;

/**
 * Created by mac on 12/08/16.
 */

public class HomeFragment extends Fragment implements YouTubePlayer.OnInitializedListener  {


    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public static final String youtubeKey = "AIzaSyDjCVwJxTQk1a04ukQnletWNxnqiLYZq_w";
    private YouTubePlayerSupportFragment mYouTubePlayerSupportFragment;
    public static final String VIDEO_ID = "HVH0WUwZNns";





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);

    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("onActivityCreated","onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        mYouTubePlayerSupportFragment = new YouTubePlayerSupportFragment();
        mYouTubePlayerSupportFragment.initialize(youtubeKey,this);
        FragmentManager fragmentManager = getChildFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.youtubeVideo, mYouTubePlayerSupportFragment);
        fragmentTransaction.commit();
        Log.d("onStart","onStart");


    }


    @Override
    public void onResume() {
        super.onResume();
        Log.d("onResume","onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("onPause", "onPause: ");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("onstop", "onStop: ");
    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("onDestroyView", "onDestroyView: ");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("onDestroy", "onDestroy: ");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("onDetach", "onDetach: ");
    }
    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
        if(!b){
            youTubePlayer.cueVideo(VIDEO_ID);
            youTubePlayer.setShowFullscreenButton(false);
        }
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

    }


}
