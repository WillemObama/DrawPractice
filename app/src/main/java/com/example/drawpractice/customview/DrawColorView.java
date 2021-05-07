package com.example.drawpractice.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class DrawColorView extends View {

//    Paint mPaint;

    public DrawColorView(Context context) {
        super(context);
    }

    public DrawColorView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        mPaint = new Paint();
//        mPaint.setColor(Color.YELLOW);
        canvas.drawColor(Color.YELLOW);
    }
}
