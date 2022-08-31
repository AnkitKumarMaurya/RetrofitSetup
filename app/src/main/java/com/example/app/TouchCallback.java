package com.example.app;

import android.view.MotionEvent;
import android.view.View;

public interface TouchCallback {

    void onResetList();
    void onUpdateList(boolean isEnable, View view, MotionEvent event);
}
