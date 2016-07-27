package com.nico.lifecycle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
  public static final String tag = "MainActivity";

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Log.d(tag, "1 *     onCreate");
  }

  @Override protected void onStart() {
    super.onStart();
    Log.d(tag, "2   *   onStart");
  }

  @Override protected void onResume() {
    super.onResume();
    Log.d(tag, "3     * onResume");
  }

  @Override protected void onPause() {
    super.onPause();
    Log.d(tag, "4     * onPause");
  }

  @Override protected void onStop() {
    super.onStop();
    Log.d(tag, "5    *  onStop");
  }

  @Override protected void onDestroy() {
    super.onDestroy();
    Log.d(tag, "6  *    onDestroy");
  }
}
