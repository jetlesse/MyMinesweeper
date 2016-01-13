package com.example.jordan.myminesweeper.util;

import android.os.Handler;
import android.widget.TextView;

import com.example.jordan.myminesweeper.R;

/**
 * Created by Jordan on 22/12/2015.
 */
public class Timing {
    static TextView time;
    int theTime;
    public Timing() {
        theTime = 0;
    }
    Handler h = new Handler();
    Runnable runner = new Runnable() {
        public void run() {
            System.out.println ("gameState = " + Btn.gameState);
            if (Btn.gameState == 1) {
                time.setText(Integer.toString (++theTime));
                h.postDelayed (runner, 1000);
            }
        }
    };


    public void stopTimer() {
        h.removeCallbacks (null);
    }
    public void startTimer() {
        h.post (runner);
    }
}
