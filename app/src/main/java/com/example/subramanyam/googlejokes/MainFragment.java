package com.example.subramanyam.googlejokes;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;


public class MainFragment extends Fragment {
private  static final String TAG=MainFragment.class.getSimpleName();
private ProgressBar mProgressBar;
private boolean mShownAd=false;

public MainFragment()
{

}
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mProgressBar=(ProgressBar)getActivity().findViewById(R.id.progressBar2);
        mProgressBar.setProgress(View.GONE);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

    View rootView=inflater.inflate(R.layout.fragment_main, container, false);
        // Inflate the layout for this fragment
        Button button=(Button) rootView.findViewById(R.id.jokebutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sayJoke();

            }
        });

        LoadApp.getAdView(rootView);
        LoadApp.getInterstitialAd(getActivity());
        return rootView;
    }

    // TODO: Rename method, update argument and hook method into UI event


    @Override
    public void onResume() {
        super.onResume();
        mProgressBar.setVisibility(View.GONE);
    }

    protected void sayJoke(){
    if(LoadApp.isAdAvailable() && !mShownAd)
    {
        LoadApp.showInterstitialAd();
        mShownAd=true;
    }else {
        mProgressBar.setVisibility(View.VISIBLE);
        JokeFetching jokeFetching=new JokeFetching();
        jokeFetching.execute( getActivity());
    }
    }
}
