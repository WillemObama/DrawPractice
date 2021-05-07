package com.example.drawpractice.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class DrawPointView extends View {

    Paint mPaint;
    float[] points = {50,50,50,100,100,50,100,100};

    {
        mPaint = new Paint();
        mPaint.setStrokeWidth(20);
        mPaint.setStrokeCap(Paint.Cap.ROUND);
    }
    public DrawPointView(Context context) {
        super(context);
    }

    public DrawPointView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPoints(points,mPaint);
    }
}
