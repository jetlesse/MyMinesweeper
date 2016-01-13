package com.example.jordan.myminesweeper.util;

import com.example.jordan.myminesweeper.R;
import com.example.jordan.myminesweeper.util.SystemUiHider;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.TextView;


/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 *
 * @see SystemUiHider
 */
public class FullscreenActivity extends Activity {
    /**
     * Whether or not the system UI should be auto-hidden after
     * {@link #AUTO_HIDE_DELAY_MILLIS} milliseconds.
     */
    private static final boolean AUTO_HIDE = true;

    /**
     * If {@link #AUTO_HIDE} is set, the number of milliseconds to wait after
     * user interaction before hiding the system UI.
     */
    private static final int AUTO_HIDE_DELAY_MILLIS = 3000;

    /**
     * If set, will toggle the system UI visibility upon interaction. Otherwise,
     * will show the system UI visibility upon interaction.
     */
    private static final boolean TOGGLE_ON_CLICK = true;

    /**
     * The flags to pass to {@link SystemUiHider#getInstance}.
     */
    private static final int HIDER_FLAGS = SystemUiHider.FLAG_HIDE_NAVIGATION;

    /**
     * The instance of the {@link SystemUiHider} for this activity.
     */
    private SystemUiHider mSystemUiHider;
    TextView time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_fullscreen);

        final View controlsView = findViewById(R.id.fullscreen_content_controls);
        final View contentView = findViewById(R.id.fullscreen_content);

        // Set up an instance of SystemUiHider to control the system UI for
        // this activity.
        mSystemUiHider = SystemUiHider.getInstance(this, contentView, HIDER_FLAGS);
        mSystemUiHider.setup();
        mSystemUiHider
                .setOnVisibilityChangeListener(new SystemUiHider.OnVisibilityChangeListener() {
                    // Cached values.
                    int mControlsHeight;
                    int mShortAnimTime;

                    @Override
                    @TargetApi(Build.VERSION_CODES.HONEYCOMB_MR2)
                    public void onVisibilityChange(boolean visible) {
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB_MR2) {
                            // If the ViewPropertyAnimator API is available
                            // (Honeycomb MR2 and later), use it to animate the
                            // in-layout UI controls at the bottom of the
                            // screen.
                            if (mControlsHeight == 0) {
                                mControlsHeight = controlsView.getHeight();
                            }
                            if (mShortAnimTime == 0) {
                                mShortAnimTime = getResources().getInteger(
                                        android.R.integer.config_shortAnimTime);
                            }
                            controlsView.animate()
                                    .translationY(visible ? 0 : mControlsHeight)
                                    .setDuration(mShortAnimTime);
                        } else {
                            // If the ViewPropertyAnimator APIs aren't
                            // available, simply show or hide the in-layout UI
                            // controls.
                            controlsView.setVisibility(visible ? View.VISIBLE : View.GONE);
                        }

                        /*if (visible && AUTO_HIDE) {
                            // Schedule a hide().
                            delayedHide(AUTO_HIDE_DELAY_MILLIS);
                        }*/
                    }
                });

        /*// Set up the user interaction to manually show or hide the system UI.
        contentView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TOGGLE_ON_CLICK) {
                    mSystemUiHider.toggle();
               } else {
                    mSystemUiHider.show();
                }
            }
        });*/

        // Upon interacting with UI controls, delay any scheduled hide()
        // operations to prevent the jarring behavior of controls going away
        // while interacting with the UI.
        //findViewById(R.id.dummy_button).setOnTouchListener(mDelayHideTouchListener);
        Btn.t = (TextView)findViewById (R.id.mainText);
        Timing.time = (TextView)findViewById (R.id.timeCounter);
        for (int i = 0 ; i < 81 ; i++) {
            Btn.minePlacements.add (new Btn (i));
        }

        //creating array of buttons to hold the buttons on screen.
        Btn.buttonNums.add ((Button) findViewById(R.id.button));
        Btn.buttonNums.add ((Button) findViewById(R.id.button2));
        Btn.buttonNums.add ((Button) findViewById(R.id.button3));
        Btn.buttonNums.add ((Button) findViewById(R.id.button4));
        Btn.buttonNums.add ((Button) findViewById(R.id.button5));
        Btn.buttonNums.add ((Button) findViewById(R.id.button6));
        Btn.buttonNums.add ((Button) findViewById(R.id.button7));
        Btn.buttonNums.add ((Button) findViewById(R.id.button8));
        Btn.buttonNums.add ((Button) findViewById(R.id.button9));
        Btn.buttonNums.add ((Button) findViewById(R.id.button10));
        Btn.buttonNums.add ((Button) findViewById(R.id.button11));
        Btn.buttonNums.add ((Button) findViewById(R.id.button12));
        Btn.buttonNums.add ((Button) findViewById(R.id.button13));
        Btn.buttonNums.add ((Button) findViewById(R.id.button14));
        Btn.buttonNums.add ((Button) findViewById(R.id.button15));
        Btn.buttonNums.add ((Button) findViewById(R.id.button16));
        Btn.buttonNums.add ((Button) findViewById(R.id.button17));
        Btn.buttonNums.add ((Button) findViewById(R.id.button18));
        Btn.buttonNums.add ((Button) findViewById(R.id.button19));
        Btn.buttonNums.add ((Button) findViewById(R.id.button20));
        Btn.buttonNums.add ((Button) findViewById(R.id.button21));
        Btn.buttonNums.add ((Button) findViewById(R.id.button22));
        Btn.buttonNums.add ((Button) findViewById(R.id.button23));
        Btn.buttonNums.add ((Button) findViewById(R.id.button24));
        Btn.buttonNums.add ((Button) findViewById(R.id.button25));
        Btn.buttonNums.add ((Button) findViewById(R.id.button26));
        Btn.buttonNums.add ((Button) findViewById(R.id.button27));
        Btn.buttonNums.add ((Button) findViewById(R.id.button28));
        Btn.buttonNums.add ((Button) findViewById(R.id.button29));
        Btn.buttonNums.add ((Button) findViewById(R.id.button30));
        Btn.buttonNums.add ((Button) findViewById(R.id.button31));
        Btn.buttonNums.add ((Button) findViewById(R.id.button32));
        Btn.buttonNums.add ((Button) findViewById(R.id.button33));
        Btn.buttonNums.add ((Button) findViewById(R.id.button34));
        Btn.buttonNums.add ((Button) findViewById(R.id.button35));
        Btn.buttonNums.add ((Button) findViewById(R.id.button36));
        Btn.buttonNums.add ((Button) findViewById(R.id.button37));
        Btn.buttonNums.add ((Button) findViewById(R.id.button38));
        Btn.buttonNums.add ((Button) findViewById(R.id.button39));
        Btn.buttonNums.add ((Button) findViewById(R.id.button40));
        Btn.buttonNums.add ((Button) findViewById(R.id.button41));
        Btn.buttonNums.add ((Button) findViewById(R.id.button42));
        Btn.buttonNums.add ((Button) findViewById(R.id.button43));
        Btn.buttonNums.add ((Button) findViewById(R.id.button44));
        Btn.buttonNums.add ((Button) findViewById(R.id.button45));
        Btn.buttonNums.add ((Button) findViewById(R.id.button46));
        Btn.buttonNums.add ((Button) findViewById(R.id.button47));
        Btn.buttonNums.add ((Button) findViewById(R.id.button48));
        Btn.buttonNums.add ((Button) findViewById(R.id.button49));
        Btn.buttonNums.add ((Button) findViewById(R.id.button50));
        Btn.buttonNums.add ((Button) findViewById(R.id.button51));
        Btn.buttonNums.add ((Button) findViewById(R.id.button52));
        Btn.buttonNums.add ((Button) findViewById(R.id.button53));
        Btn.buttonNums.add ((Button) findViewById(R.id.button54));
        Btn.buttonNums.add ((Button) findViewById(R.id.button55));
        Btn.buttonNums.add ((Button) findViewById(R.id.button56));
        Btn.buttonNums.add ((Button) findViewById(R.id.button57));
        Btn.buttonNums.add ((Button) findViewById(R.id.button58));
        Btn.buttonNums.add ((Button) findViewById(R.id.button59));
        Btn.buttonNums.add ((Button) findViewById(R.id.button60));
        Btn.buttonNums.add ((Button) findViewById(R.id.button61));
        Btn.buttonNums.add ((Button) findViewById(R.id.button62));
        Btn.buttonNums.add ((Button) findViewById(R.id.button63));
        Btn.buttonNums.add ((Button) findViewById(R.id.button64));
        Btn.buttonNums.add ((Button) findViewById(R.id.button65));
        Btn.buttonNums.add ((Button) findViewById(R.id.button66));
        Btn.buttonNums.add ((Button) findViewById(R.id.button67));
        Btn.buttonNums.add ((Button) findViewById(R.id.button68));
        Btn.buttonNums.add ((Button) findViewById(R.id.button69));
        Btn.buttonNums.add ((Button) findViewById(R.id.button70));
        Btn.buttonNums.add ((Button) findViewById(R.id.button71));
        Btn.buttonNums.add ((Button) findViewById(R.id.button72));
        Btn.buttonNums.add ((Button) findViewById(R.id.button73));
        Btn.buttonNums.add ((Button) findViewById(R.id.button74));
        Btn.buttonNums.add ((Button) findViewById(R.id.button75));
        Btn.buttonNums.add ((Button) findViewById(R.id.button76));
        Btn.buttonNums.add ((Button) findViewById(R.id.button77));
        Btn.buttonNums.add ((Button) findViewById(R.id.button78));
        Btn.buttonNums.add ((Button) findViewById(R.id.button79));
        Btn.buttonNums.add ((Button) findViewById(R.id.button80));
        Btn.buttonNums.add ((Button) findViewById(R.id.button81));

        //creating an array of Btn objects to correspond to the buttons.
        for (int i = 0 ; i < 81 ; i++) {
            Btn.minePlacements.add (new Btn (i));
        }

        //giving all of the buttons an onClick() method that is called when the button is clicked.
        Btn.buttonNums.get(0).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(0).getsClicked();
            }
        });
        Btn.buttonNums.get(1).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(1).getsClicked();
            }
        });
        Btn.buttonNums.get(2).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(2).getsClicked();
            }
        });
        Btn.buttonNums.get(3).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(3).getsClicked();
            }
        });
        Btn.buttonNums.get(4).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(4).getsClicked();
            }
        });
        Btn.buttonNums.get(5).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(5).getsClicked();
            }
        });
        Btn.buttonNums.get(6).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(6).getsClicked();
            }
        });
        Btn.buttonNums.get(7).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(7).getsClicked();
            }
        });
        Btn.buttonNums.get(8).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(8).getsClicked();
            }
        });
        Btn.buttonNums.get(9).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(9).getsClicked();
            }
        });
        Btn.buttonNums.get(10).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(10).getsClicked();
            }
        });
        Btn.buttonNums.get(11).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get (11).getsClicked();
            }
        });
        Btn.buttonNums.get(12).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get (12).getsClicked();
            }
        });
        Btn.buttonNums.get(13).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get (13).getsClicked();
            }
        });
        Btn.buttonNums.get(14).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get (14).getsClicked();
            }
        });
        Btn.buttonNums.get(15).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get (15).getsClicked();
            }
        });
        Btn.buttonNums.get(16).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get (16).getsClicked();
            }
        });
        Btn.buttonNums.get(17).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get (17).getsClicked();
            }
        });
        Btn.buttonNums.get(18).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get (18).getsClicked();
            }
        });
        Btn.buttonNums.get(19).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get (19).getsClicked();
            }
        });
        Btn.buttonNums.get(20).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get (20).getsClicked();
            }
        });
        Btn.buttonNums.get(21).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(21).getsClicked();
            }
        });
        Btn.buttonNums.get(22).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(22).getsClicked();
            }
        });
        Btn.buttonNums.get(23).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(23).getsClicked();
            }
        });
        Btn.buttonNums.get(24).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(24).getsClicked();
            }
        });
        Btn.buttonNums.get(25).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(25).getsClicked();
            }
        });
        Btn.buttonNums.get(26).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(26).getsClicked();
            }
        });
        Btn.buttonNums.get(27).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(27).getsClicked();
            }
        });
        Btn.buttonNums.get(28).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(28).getsClicked();
            }
        });
        Btn.buttonNums.get(29).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(29).getsClicked();
            }
        });
        Btn.buttonNums.get(30).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(30).getsClicked();
            }
        });
        Btn.buttonNums.get(31).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(31).getsClicked();
            }
        });
        Btn.buttonNums.get(32).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(32).getsClicked();
            }
        });
        Btn.buttonNums.get(33).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(33).getsClicked();
            }
        });
        Btn.buttonNums.get(34).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(34).getsClicked();
            }
        });
        Btn.buttonNums.get(35).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(35).getsClicked();
            }
        });
        Btn.buttonNums.get(36).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(36).getsClicked();
            }
        });
        Btn.buttonNums.get(37).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(37).getsClicked();
            }
        });
        Btn.buttonNums.get(38).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(38).getsClicked();
            }
        });
        Btn.buttonNums.get(39).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(39).getsClicked();
            }
        });
        Btn.buttonNums.get(40).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(40).getsClicked();
            }
        });
        Btn.buttonNums.get(41).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(41).getsClicked();
            }
        });
        Btn.buttonNums.get(42).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(42).getsClicked();
            }
        });
        Btn.buttonNums.get(43).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(43).getsClicked();
            }
        });
        Btn.buttonNums.get(44).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(44).getsClicked();
            }
        });
        Btn.buttonNums.get(45).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(45).getsClicked();
            }
        });
        Btn.buttonNums.get(46).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(46).getsClicked();
            }
        });
        Btn.buttonNums.get(47).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(47).getsClicked();
            }
        });
        Btn.buttonNums.get(48).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(48).getsClicked();
            }
        });
        Btn.buttonNums.get(49).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(49).getsClicked();
            }
        });
        Btn.buttonNums.get(50).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(50).getsClicked();
            }
        });
        Btn.buttonNums.get(51).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(51).getsClicked();
            }
        });
        Btn.buttonNums.get(52).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(52).getsClicked();
            }
        });
        Btn.buttonNums.get(53).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(53).getsClicked();
            }
        });
        Btn.buttonNums.get(54).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(54).getsClicked();
            }
        });
        Btn.buttonNums.get(55).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(55).getsClicked();
            }
        });
        Btn.buttonNums.get(56).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(56).getsClicked();
            }
        });
        Btn.buttonNums.get(57).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(57).getsClicked();
            }
        });
        Btn.buttonNums.get(58).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(58).getsClicked();
            }
        });
        Btn.buttonNums.get(59).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(59).getsClicked();
            }
        });
        Btn.buttonNums.get(60).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(60).getsClicked();
            }
        });
        Btn.buttonNums.get(61).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(61).getsClicked();
            }
        });
        Btn.buttonNums.get(62).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(62).getsClicked();
            }
        });
        Btn.buttonNums.get(63).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(63).getsClicked();
            }
        });
        Btn.buttonNums.get(64).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(64).getsClicked();
            }
        });
        Btn.buttonNums.get(65).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(65).getsClicked();
            }
        });
        Btn.buttonNums.get(66).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(66).getsClicked();
            }
        });
        Btn.buttonNums.get(67).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(67).getsClicked();
            }
        });
        Btn.buttonNums.get(68).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(68).getsClicked();
            }
        });
        Btn.buttonNums.get(69).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(69).getsClicked();
            }
        });
        Btn.buttonNums.get(70).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(70).getsClicked();
            }
        });
        Btn.buttonNums.get(71).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(71).getsClicked();
            }
        });
        Btn.buttonNums.get(72).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(72).getsClicked();
            }
        });
        Btn.buttonNums.get(73).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(73).getsClicked();
            }
        });
        Btn.buttonNums.get(74).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(74).getsClicked();
            }
        });
        Btn.buttonNums.get(75).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(75).getsClicked();
            }
        });
        Btn.buttonNums.get(76).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(76).getsClicked();
            }
        });
        Btn.buttonNums.get(77).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(77).getsClicked();
            }
        });
        Btn.buttonNums.get(78).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(78).getsClicked();
            }
        });
        Btn.buttonNums.get(79).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(79).getsClicked();
            }
        });
        Btn.buttonNums.get(80).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Btn.minePlacements.get(80).getsClicked();
            }
        });

        //giving every button an onLongClick() method for when the button is held (flagging).
        Btn.buttonNums.get (0).setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                Btn.minePlacements.get(0).held();
                return true;
            }
        });
        Btn.buttonNums.get (1).setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                Btn.minePlacements.get(1).held();
                return true;
            }
        });
        Btn.buttonNums.get (2).setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                Btn.minePlacements.get(2).held();
                return true;
            }
        });
        Btn.buttonNums.get (3).setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                Btn.minePlacements.get(3).held();
                return true;
            }
        });
        Btn.buttonNums.get (4).setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                Btn.minePlacements.get(4).held();
                return true;
            }
        });
        Btn.buttonNums.get (5).setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                Btn.minePlacements.get(5).held();
                return true;
            }
        });
        Btn.buttonNums.get (6).setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                Btn.minePlacements.get(6).held();
                return true;
            }
        });
        Btn.buttonNums.get (7).setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                Btn.minePlacements.get(7).held();
                return true;
            }
        });
        Btn.buttonNums.get (8).setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                Btn.minePlacements.get(8).held();
                return true;
            }
        });
        Btn.buttonNums.get (9).setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                Btn.minePlacements.get(9).held();
                return true;
            }
        });
        Btn.buttonNums.get (10).setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                Btn.minePlacements.get(10).held();
                return true;
            }
        });
        Btn.buttonNums.get (11).setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                Btn.minePlacements.get(11).held();
                return true;
            }
        });
        Btn.buttonNums.get (12).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (12).held();
                return true;
            }
        });
        Btn.buttonNums.get (13).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (13).held();
                return true;
            }
        });
        Btn.buttonNums.get (14).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (14).held();
                return true;
            }
        });
        Btn.buttonNums.get (15).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (15).held();
                return true;
            }
        });
        Btn.buttonNums.get (16).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (16).held();
                return true;
            }
        });
        Btn.buttonNums.get (17).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (17).held();
                return true;
            }
        });
        Btn.buttonNums.get (18).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (18).held();
                return true;
            }
        });
        Btn.buttonNums.get (19).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (19).held();
                return true;
            }
        });
        Btn.buttonNums.get (20).setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                Btn.minePlacements.get(20).held();
                return true;
            }
        });
        Btn.buttonNums.get (21).setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                Btn.minePlacements.get(21).held();
                return true;
            }
        });
        Btn.buttonNums.get (22).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (22).held();
                return true;
            }
        });
        Btn.buttonNums.get (23).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (23).held();
                return true;
            }
        });
        Btn.buttonNums.get (24).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (24).held();
                return true;
            }
        });
        Btn.buttonNums.get (25).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (25).held();
                return true;
            }
        });
        Btn.buttonNums.get (26).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (26).held();
                return true;
            }
        });
        Btn.buttonNums.get (27).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (27).held();
                return true;
            }
        });
        Btn.buttonNums.get (28).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (28).held();
                return true;
            }
        });
        Btn.buttonNums.get (29).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (29).held();
                return true;
            }
        });
        Btn.buttonNums.get (30).setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                Btn.minePlacements.get(30).held();
                return true;
            }
        });
        Btn.buttonNums.get (31).setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                Btn.minePlacements.get(31).held();
                return true;
            }
        });
        Btn.buttonNums.get (32).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (32).held();
                return true;
            }
        });
        Btn.buttonNums.get (33).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (33).held();
                return true;
            }
        });
        Btn.buttonNums.get (34).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (34).held();
                return true;
            }
        });
        Btn.buttonNums.get (35).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (35).held();
                return true;
            }
        });
        Btn.buttonNums.get (36).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (36).held();
                return true;
            }
        });
        Btn.buttonNums.get (37).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (37).held();
                return true;
            }
        });
        Btn.buttonNums.get (38).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (38).held();
                return true;
            }
        });
        Btn.buttonNums.get (39).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (39).held();
                return true;
            }
        });
        Btn.buttonNums.get (40).setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                Btn.minePlacements.get(40).held();
                return true;
            }
        });
        Btn.buttonNums.get (41).setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                Btn.minePlacements.get(41).held();
                return true;
            }
        });
        Btn.buttonNums.get (42).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (42).held();
                return true;
            }
        });
        Btn.buttonNums.get (43).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (43).held();
                return true;
            }
        });
        Btn.buttonNums.get (44).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (44).held();
                return true;
            }
        });
        Btn.buttonNums.get (45).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (45).held();
                return true;
            }
        });
        Btn.buttonNums.get (46).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (46).held();
                return true;
            }
        });
        Btn.buttonNums.get (47).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (47).held();
                return true;
            }
        });
        Btn.buttonNums.get (48).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (48).held();
                return true;
            }
        });
        Btn.buttonNums.get (49).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (49).held();
                return true;
            }
        });
        Btn.buttonNums.get (50).setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                Btn.minePlacements.get(50).held();
                return true;
            }
        });
        Btn.buttonNums.get (51).setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                Btn.minePlacements.get(51).held();
                return true;
            }
        });
        Btn.buttonNums.get (52).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (52).held();
                return true;
            }
        });
        Btn.buttonNums.get (53).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (53).held();
                return true;
            }
        });
        Btn.buttonNums.get (54).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (54).held();
                return true;
            }
        });
        Btn.buttonNums.get (55).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (55).held();
                return true;
            }
        });
        Btn.buttonNums.get (56).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (56).held();
                return true;
            }
        });
        Btn.buttonNums.get (57).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (57).held();
                return true;
            }
        });
        Btn.buttonNums.get (58).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (58).held();
                return true;
            }
        });
        Btn.buttonNums.get (59).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (59).held();
                return true;
            }
        });
        Btn.buttonNums.get (60).setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                Btn.minePlacements.get(60).held();
                return true;
            }
        });
        Btn.buttonNums.get (61).setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                Btn.minePlacements.get(61).held();
                return true;
            }
        });
        Btn.buttonNums.get (62).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (62).held();
                return true;
            }
        });
        Btn.buttonNums.get (63).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (63).held();
                return true;
            }
        });
        Btn.buttonNums.get (64).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (64).held();
                return true;
            }
        });
        Btn.buttonNums.get (65).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (65).held();
                return true;
            }
        });
        Btn.buttonNums.get (66).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (66).held();
                return true;
            }
        });
        Btn.buttonNums.get (67).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (67).held();
                return true;
            }
        });
        Btn.buttonNums.get (68).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (68).held();
                return true;
            }
        });
        Btn.buttonNums.get (69).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (69).held();
                return true;
            }
        });
        Btn.buttonNums.get (70).setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                Btn.minePlacements.get(70).held();
                return true;
            }
        });
        Btn.buttonNums.get (71).setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                Btn.minePlacements.get(71).held();
                return true;
            }
        });
        Btn.buttonNums.get (72).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (72).held();
                return true;
            }
        });
        Btn.buttonNums.get (73).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (73).held();
                return true;
            }
        });
        Btn.buttonNums.get (74).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (74).held();
                return true;
            }
        });
        Btn.buttonNums.get (75).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (75).held();
                return true;
            }
        });
        Btn.buttonNums.get (76).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (76).held();
                return true;
            }
        });
        Btn.buttonNums.get (77).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (77).held();
                return true;
            }
        });
        Btn.buttonNums.get (78).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (78).held();
                return true;
            }
        });
        Btn.buttonNums.get (79).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (79).held();
                return true;
            }
        });
        Btn.buttonNums.get (80).setOnLongClickListener (new View.OnLongClickListener() {
            public boolean onLongClick (View v) {
                Btn.minePlacements.get (80).held();
                return true;
            }
        });
    }




    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        // Trigger the initial hide() shortly after the activity has been
        // created, to briefly hint to the user that UI controls
        // are available.
        delayedHide(100);
    }


    /**
     * Touch listener to use for in-layout UI controls to delay hiding the
     * system UI. This is to prevent the jarring behavior of controls going away
     * while interacting with activity UI.
     */
    View.OnTouchListener mDelayHideTouchListener = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (AUTO_HIDE) {
                //delayedHide(AUTO_HIDE_DELAY_MILLIS);
            }
            return false;
        }
    };

    Handler mHideHandler = new Handler();
    Runnable mHideRunnable = new Runnable() {
        @Override
        public void run() {
            //mSystemUiHider.hide();
        }
    };

    /**
     * Schedules a call to hide() in [delay] milliseconds, canceling any
     * previously scheduled calls.
     */
    private void delayedHide(int delayMillis) {
        mHideHandler.removeCallbacks(mHideRunnable);
        mHideHandler.postDelayed(mHideRunnable, delayMillis);
    }



    }
