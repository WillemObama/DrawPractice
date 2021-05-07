package com.example.drawpractice.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class DrawArcView extends View {

    Paint mPaint;

    public DrawArcView(Context context) {
        super(context);
    }

    public DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint = new Paint();
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawArc(200,100,800,500,-110,100,true,mPaint);
        canvas.drawArc(200,100,800,500,20,140,false,mPaint);
        mPaint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(200,100,800,500,180,60,false,mPaint);
    }
}
