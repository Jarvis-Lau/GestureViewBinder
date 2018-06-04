package com.jarvislau.destureviewbinder;

import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by JarvisLau on 2018/5/29.
 * Description :
 */

public class ScaleGestureListener implements ScaleGestureDetector.OnScaleGestureListener/*, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener */ {

    private View targetView;
    private float scale = 1;
    private float scaleTemp = 1;

    private boolean isFullGroup = false;

    ScaleGestureListener(View targetView, ViewGroup viewGroup) {
        this.targetView = targetView;
    }

    @Override
    public boolean onScale(ScaleGestureDetector detector) {
        scale = scaleTemp * detector.getScaleFactor();
        targetView.setScaleX(scale);
        targetView.setScaleY(scale);
        return false;
    }

    @Override
    public boolean onScaleBegin(ScaleGestureDetector detector) {
        return true;
    }

    @Override
    public void onScaleEnd(ScaleGestureDetector detector) {
        scaleTemp = scale;
    }



    float getScale() {
        return scale;
    }

    public boolean isFullGroup() {
        return isFullGroup;
    }

    void setFullGroup(boolean fullGroup) {
        isFullGroup = fullGroup;
    }

    void onActionUp() {
        if (isFullGroup && scaleTemp < 1) {
            scale = 1;
            targetView.setScaleX(scale);
            targetView.setScaleY(scale);
            scaleTemp = scale;
        }
    }
}