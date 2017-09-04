package com.bwie.text.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Love_you on 2017/9/4 0004.
 */
public class CustomViews extends View{

    private Paint paint;

    public CustomViews(Context context) {
        super(context);
        init();
    }

    public CustomViews(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomViews(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        //设置画笔
        paint = new Paint();
        paint.setAntiAlias(true);
        //设置颜色
        paint.setColor(Color.RED);
        //画笔描边
        paint.setStyle(Paint.Style.STROKE);
        //设置画笔的粗细
        paint.setStrokeWidth(2);
    }

    @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
        canvas.drawCircle(200, 200, 60, paint);
    }
}
