package com.example.drawpractice.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class DrawPieChartView extends View {

    Paint mPaint;

    public DrawPieChartView(Context context) {
        super(context);
    }

    public DrawPieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        mPaint = new Paint();
        mPaint.setColor(Color.RED);
        canvas.drawArc(180,80,780,480,-180,100,true,mPaint);
        mPaint.setColor(Color.parseColor("#FFA000"));
        canvas.drawArc(200,100,800,500,-80,45,true,mPaint);

        mPaint.setColor(Color.parseColor("#4A148C"));
        canvas.drawArc(200,100,800,500,-33,10,true,mPaint);

        mPaint.setColor(Color.parseColor("#EEEEEE"));
        canvas.drawArc(200,100,800,500,-10,10,true,mPaint);

        mPaint.setColor(Color.parseColor("#388E3C"));
        canvas.drawArc(200,100,800,500,0,70,true,mPaint);

        mPaint.setColor(Color.parseColor("#29B6F6"));
        canvas.drawArc(200,100,800,500,70,110,true,mPaint);

    }
}
