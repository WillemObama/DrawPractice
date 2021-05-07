package com.example.drawpractice.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class DrawHistogramView extends View {

    Paint mPaint;
    Path path;

    public DrawHistogramView(Context context) {
        super(context);
    }

    public DrawHistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        mPaint = new Paint();
        mPaint.setColor(Color.BLACK);
        mPaint.setStrokeWidth(5);
        canvas.drawLine(100,300,100,1200,mPaint);
        canvas.drawLine(100,1200,1000,1200,mPaint);
        mPaint.setTextSize(38);
        canvas.drawText("Frcyo",160,1250,mPaint);
        canvas.drawText("GB",300,1250,mPaint);
        canvas.drawText("ICS",420,1250,mPaint);
        canvas.drawText("JB",530,1250,mPaint);
        canvas.drawText("KITKAT",600,1250,mPaint);
        canvas.drawText("L",780,1250,mPaint);
        canvas.drawText("M",900,1250,mPaint);
        canvas.drawText("直方图",500,1300,mPaint);

        mPaint.setStrokeWidth(85);
        mPaint.setColor(Color.GREEN);
        canvas.drawLine(200,1198,200,1180,mPaint);
        canvas.drawLine(320,1198,320,1100,mPaint);
        canvas.drawLine(440,1198,440,1100,mPaint);
        canvas.drawLine(550,1198,550,800,mPaint);
        canvas.drawLine(650,1198,650,600,mPaint);
        canvas.drawLine(800,1198,800,600,mPaint);
        canvas.drawLine(920,1198,920,800,mPaint);
    }
}
