package kz.kazntu.lessons.fragment;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private final String TEST_FRAGMENT = "FRAGMENT_TEST" ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TEST_FRAGMENT, "onCreate() Activity") ;
        getSupportFragmentManager().beginTransaction()
                .add(R.id.container, new Fragment1(), "fragment1")
                .commit();
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        Log.e(TEST_FRAGMENT, "onAtachedFragment() Activity") ;
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TEST_FRAGMENT, "onStart() Activity") ;
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TEST_FRAGMENT, "onResume() Activity") ;
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e(TEST_FRAGMENT, "onSaveInstanceState() Activity") ;
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TEST_FRAGMENT, "onStop() Activity") ;
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TEST_FRAGMENT, "onPause() Activity") ;
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TEST_FRAGMENT, "onRestart() Activity") ;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TEST_FRAGMENT, "onDestroy() Activity") ;
    }
}
