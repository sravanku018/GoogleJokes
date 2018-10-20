package com.example.subramanyam.gjokes;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class JFragment extends Fragment {
public String mJoke;
private static final String TAG=JFragment.class.getSimpleName();
private TextView mJTextView;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View rootView=inflater.inflate(R.layout.fragment_j,container,false);
        // Inflate the layout for this fragment
        mJTextView=rootView.findViewById(R.id.JTextView);
        return rootView;
    }


    public JFragment(){

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        JActivity parentActivity=(JActivity) getActivity();
        mJoke=parentActivity.getmJokeFromIntent();
        mJTextView.setText(mJoke);
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */

}
