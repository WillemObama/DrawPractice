package com.example.drawpractice.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class DrawRectView extends View {

    Paint mPaint;

    public DrawRectView(Context context) {
        super(context);
    }

    public DrawRectView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint = new Paint();
        mPaint.setARGB(255,0,0,0);
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawRect(300,300,900,900,mPaint);
    }
}
