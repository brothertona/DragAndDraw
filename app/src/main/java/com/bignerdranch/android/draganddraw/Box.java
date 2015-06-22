package com.bignerdranch.android.draganddraw;

import android.graphics.PointF;

/**
 * Created by andrew on 6/22/2015.
 */
public class Box {
    private PointF mOrigin;
    private PointF mCurrent;

    public Box(PointF origin){
        mOrigin = mCurrent = origin;
    }
    public void setCurrent(PointF current){
        mCurrent = current;
    }
    public PointF getOrigin(){
        return mOrigin;
    }
    public PointF getCurrent() {
        return mCurrent;
    }
}
