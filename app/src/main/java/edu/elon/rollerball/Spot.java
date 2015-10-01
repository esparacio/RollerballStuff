package edu.elon.rollerball;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.WindowManager;

/**
 * Created by Elena on 10/1/15.
 */
public class Spot {

    protected float x, y;
    private float width, height;
    private Bitmap bitmap;

    private int screenWidth, screenHeight;

    private final float SCALE = 0.2f;

    public Spot(Context context){
        bitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.spot);

        width = bitmap.getWidth()*SCALE;
        height = bitmap.getHeight()*SCALE;

        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        screenWidth = size.x;
        screenHeight = size.y;

        x = screenWidth/2;
        y = screenWidth/3;


    }

    public doDraw(Canvas canvas){
        canvas.drawBitmap(bitmap,null,new Rect((int) (x - width/1.75), (int) (y- height/1.75),
                        (int) (x + width/1.75), (int) (y + height/1.75)),
                null);
    }



}