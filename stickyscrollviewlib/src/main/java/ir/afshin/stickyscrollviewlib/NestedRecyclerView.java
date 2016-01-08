package ir.afshin.stickyscrollviewlib;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;

/**
 * Created by afshinhoseini on 1/8/16.
 */
public class NestedRecyclerView extends RecyclerView {

// ____________________________________________________________________
    public NestedRecyclerView(Context context) {
        super(context);
    }

    public NestedRecyclerView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public NestedRecyclerView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
// ____________________________________________________________________

    private boolean canScrollDown() {

        boolean canScrollDown = false;



        return canScrollDown;
    }

// ____________________________________________________________________


//    @Override
//    public boolean dispatchNestedPreScroll(int dx, int dy, int[] consumed, int[] offsetInWindow) {
//
//        boolean didConsumed = false;
//
//
//        if(getBottom() <= ((ViewGroup) getParent()).getBottom()) {
//
//            //didConsumed = super.dispatchNestedPreScroll(dx, dy, consumed, offsetInWindow);
//
//            Log.e("PRE-NESTED", "TRUE");
//        }
//        else {
//            Log.e("PRE-NESTED", "FALSE");
//        }
//
//        return false;
//    }

//    @Override
//    public boolean dispatchNestedScroll(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow) {
//        boolean didConsumed = false;
//
//
//        if(getBottom() <= ((ViewGroup) ((ViewGroup) ((ViewGroup) getParent()).getParent()).getParent()).getBottom()) {
//
//            //didConsumed = super.dispatchNestedPreScroll(dx, dy, consumed, offsetInWindow);
//
//            Log.e("PRE-NESTED", "" + getBottom() + " - " + ((ViewGroup) getParent()).getBottom());
//        }
//        else {
//            Log.e("PRE-NESTED", "FALSE");
//        }
//
//        return false;
//    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {

        boolean didConsumed = false;
        View parent = ((ViewGroup) ((ViewGroup) ((ViewGroup) getParent()).getParent()).getParent());

        if(getBottom() <= parent.getHeight() + parent.getScrollY()) {

            didConsumed = super.dispatchTouchEvent(ev);


        }
        else {

        }

        Log.e("PRE-NESTED", "" + parent.getHeight());
        return didConsumed;
    }


    // ____________________________________________________________________

}
