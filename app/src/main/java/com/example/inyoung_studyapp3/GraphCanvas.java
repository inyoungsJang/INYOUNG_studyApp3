package com.example.inyoung_studyapp3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

public class GraphCanvas extends View {

    public GraphCanvas(Context context) {
        super(context);
        //this.setBackgroundColor(Color.BLACK);//캔버스 배경색
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.BLACK); //
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5); //굵기

        Path path = new Path(); //진행도
        path.moveTo(20, 20); //y=page쪽수
        path.lineTo(120, 37);
        path.lineTo(220, 40);
        path.lineTo(320, 61);
        path.lineTo(420, 101);
// TODO: 2020-04-05 나중에는 메서드에 page값을 받아서 path.lineTo(20+(100),page);로 구현해야함

        path.offset(50, 100); //
        canvas.drawPath(path, paint);
    }
}
