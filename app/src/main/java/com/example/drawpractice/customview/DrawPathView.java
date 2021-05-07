package com.example.drawpractice.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class DrawPathView extends View {

    Paint mPaint;
    Path path;

    {
        mPaint = new Paint();
        path = new Path();
        path.addArc(200,200,400,400,-225,225);
        path.arcTo(400,200,600,400,-180,225,false);
        path.lineTo(400,542);
    }

    public DrawPathView(Context context) {
        super(context);
    }

    public DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(path,mPaint);
    }
}
