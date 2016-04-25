package trs.com.trstoast.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

/**
 * 侧滑删除
 * Created by zhuguohui on 2016/4/25.
 */
public class SlideDeleteLayout extends FrameLayout {
    public SlideDeleteLayout(Context context) {
        this(context, null);
    }

    public SlideDeleteLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        return super.onTouchEvent(event);
    }
}
