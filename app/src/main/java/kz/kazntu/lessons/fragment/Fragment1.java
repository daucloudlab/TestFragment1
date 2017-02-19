package kz.kazntu.lessons.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment1 extends Fragment{
    private final String FRAGMENT_TAG = "FRAGMENT_TEST" ;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d(FRAGMENT_TAG, "onAtach() Fragment") ;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(FRAGMENT_TAG, "onCreate() Fragment") ;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d(FRAGMENT_TAG, "onCreateView() Fragment") ;
        return inflater.inflate(R.layout.fragment1_layout, null) ;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(FRAGMENT_TAG, "onActivityCreated() Fragment") ;
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(FRAGMENT_TAG, "onStart() Fragment") ;
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(FRAGMENT_TAG, "onResume() Fragment") ;
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(FRAGMENT_TAG, "onPause() Fragment") ;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(FRAGMENT_TAG, "onSaveInstanceState() Fragment") ;
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(FRAGMENT_TAG, "onStop() Fragment") ;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(FRAGMENT_TAG, "onDestroyView() Fragment") ;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(FRAGMENT_TAG, "onDestroy() Fragment") ;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(FRAGMENT_TAG, "onDetach() Fragment") ;
    }
}
