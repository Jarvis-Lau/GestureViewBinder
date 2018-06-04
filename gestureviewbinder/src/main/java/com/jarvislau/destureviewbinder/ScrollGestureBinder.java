package com.jarvislau.destureviewbinder;

import android.content.Context;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by JarvisLau on 2018/5/30.
 * Description :
 */

class ScrollGestureBinder extends GestureDetector {

    ScrollGestureBinder(Context context, ScrollGestureListener scrollGestureListener) {
        super(context, scrollGestureListener);
    }

}