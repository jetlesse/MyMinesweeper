package com.example.jordan.myminesweeper.util;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v4.content.res.ResourcesCompat;
import android.view.View;
import android.widget.Button;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

import com.example.jordan.myminesweeper.R;

import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

/**
 * Created by Jordan on 12/06/2015.
 */
public class Btn {

    static ArrayList <Btn> minePlacements = new ArrayList <Btn> ();
    static ArrayList <Button> buttonNums = new ArrayList <Button> ();
    static ArrayList <Btn> alreadyVisit = new ArrayList <Btn> ();
    static Stack <Btn> currPath = new Stack <Btn> ();
    //0 means not started, 1 means running, 2 means ended.
    static int gameState = 0;
    static TextView t;
    static Timing timing = new Timing();

    public Btn (int a) {
        numMines = 0;
        state = 0;
        isMine = false;
        place = a;
    }

    int numMines;
    //which display iss being used for the button.
    //0 means blank, 1 means flag, 2 means number, 3 means mine/lose.
    private int state;
    boolean isMine;
    int place;

    public int getNumMines() { return numMines; }
    public boolean getIsMine() { return isMine; }
    public int getState() { return state; }

    public void setIsMine (boolean bool) {
        isMine = bool;
    }
    public void setState (int i) { state = i; }

    public void giveNums() {
        if (!(isMine)) {
            switch (searchAround()) {
                case 1:
                    if (minePlacements.get (place - 1).getIsMine()) {
                        numMines++;
                    }
                    if (minePlacements.get (place + 1).getIsMine()) {
                        numMines++;
                    }
                    if (minePlacements.get (place + 8).getIsMine()) {
                        numMines++;
                    }
                    if (minePlacements.get (place + 9).getIsMine()) {
                        numMines++;
                    }
                    if (minePlacements.get (place + 10).getIsMine()) {
                        numMines++;
                    }
                    break;
                case 2:
                    if (minePlacements.get (place - 9).getIsMine()) {
                        numMines++;
                    }
                    if (minePlacements.get (place - 8).getIsMine()) {
                        numMines++;
                    }
                    if (minePlacements.get (place + 1).getIsMine()) {
                        numMines++;
                    }
                    if (minePlacements.get (place + 9).getIsMine()) {
                        numMines++;
                    }
                    if (minePlacements.get (place + 10).getIsMine()) {
                        numMines++;
                    }
                    break;
                case 3:
                    if (minePlacements.get (place - 1).getIsMine()) {
                        numMines++;
                    }
                    if (minePlacements.get (place + 1).getIsMine()) {
                        numMines++;
                    }
                    if (minePlacements.get (place - 8).getIsMine()) {
                        numMines++;
                    }
                    if (minePlacements.get (place - 9).getIsMine()) {
                        numMines++;
                    }
                    if (minePlacements.get (place - 10).getIsMine()) {
                        numMines++;
                    }
                    break;
                case 4:
                    if (minePlacements.get (place - 9).getIsMine()) {
                        numMines++;
                    }
                    if (minePlacements.get (place - 10).getIsMine()) {
                        numMines++;
                    }
                    if (minePlacements.get (place - 1).getIsMine()) {
                        numMines++;
                    }
                    if (minePlacements.get (place + 9).getIsMine()) {
                        numMines++;
                    }
                    if (minePlacements.get (place + 8).getIsMine()) {
                        numMines++;
                    }
                    break;
                case 5:
                    if (minePlacements.get (place + 1).getIsMine()) {
                        numMines++;
                    }
                    if (minePlacements.get (place + 10).getIsMine()) {
                        numMines++;
                    }
                    if (minePlacements.get (place + 9).getIsMine()) {
                        numMines++;
                    }
                    break;
                case 6:
                    if (minePlacements.get (place - 1).getIsMine()) {
                        numMines++;
                    }
                    if (minePlacements.get (place + 8).getIsMine()) {
                        numMines++;
                    }
                    if (minePlacements.get (place + 9).getIsMine()) {
                        numMines++;
                    }
                    break;
                case 7:
                    if (minePlacements.get (place + 1).getIsMine()) {
                        numMines++;
                    }
                    if (minePlacements.get (place - 8).getIsMine()) {
                        numMines++;
                    }
                    if (minePlacements.get (place - 9).getIsMine()) {
                        numMines++;
                    }
                    break;
                case 8:
                    if (minePlacements.get (place - 1).getIsMine()) {
                        numMines++;
                    }
                    if (minePlacements.get (place - 10).getIsMine()) {
                        numMines++;
                    }
                    if (minePlacements.get (place - 9).getIsMine()) {
                        numMines++;
                    }
                    break;
                case 9:
                    if (minePlacements.get (place - 1).getIsMine()) {
                        numMines++;
                    }
                    if (minePlacements.get (place + 1).getIsMine()) {
                        numMines++;
                    }
                    if (minePlacements.get (place - 8).getIsMine()) {
                        numMines++;
                    }
                    if (minePlacements.get (place - 9).getIsMine()) {
                        numMines++;
                    }
                    if (minePlacements.get (place - 10).getIsMine()) {
                        numMines++;
                    }
                    if (minePlacements.get (place + 9).getIsMine()) {
                        numMines++;
                    }
                    if (minePlacements.get (place + 8).getIsMine()) {
                        numMines++;
                    }
                    if (minePlacements.get (place + 10).getIsMine()) {
                        numMines++;
                    }
                    break;
            }
        }
    }
    public void btnReset (int a) {
        minePlacements.get (a).numMines = 0;
        minePlacements.get (a).isMine = false;
        minePlacements.get (a).state = 0;
    }

    //when the button is clicked.
    public void getsClicked() {
        if (gameState == 0) {
            startGame();
        }

        if (gameState == 1) {
            getsChosen();
            alreadyVisit = new ArrayList<Btn>();
            currPath = new Stack <Btn>();

            if (checkW()) {
                t.setText("You Won!");
                timing.stopTimer();
                gameState = 2;
            }
        }
        else if (gameState == 2) {
            for (int i = 0; i < 81; i++) {
                minePlacements.get (i).btnReset (i);
                buttonNums.get(i).setText("");
                buttonNums.get(i).setBackgroundResource(R.drawable.button_background);
            }
            timing.theTime = 0;
            Timing.time.setText ("0");
            gameState = 0;
        }
    }

    public void startGame() {
    //sets the board if the game has not yet started.
        setBoard(place);
        t.setText(" ");
        gameState = 1;
        for (int i = 0; i < 81; i++) {
            minePlacements.get(i).giveNums();
            //buttonNums.get (i).setBackgroundResource (R.drawable.button_background);
        }
        timing.theTime = 0;
        timing.startTimer();

    }

    public void getsChosen() {
        if (state == 0) {
            buttonNums.get (place).setBackgroundResource (R.drawable.button_pressed_background);
            if (isMine) {
                buttonNums.get (place).setTextColor (Color.parseColor ("#000000"));
                buttonNums.get(place).setText("lose");
                t.setText("You lost. Play again?");
                System.out.println("lost");
                timing.stopTimer();
                state = 3;
                gameState = 2;
            }
            //only works for 9x9 boards. can be changed to be for other sized boards.
            else if (numMines == 0) {
                //buttonNums.get(place).setText(Integer.toString(numMines));

                state = 2;
                DFS();
            } else {
                switch (numMines) {
                    case 1:
                        buttonNums.get (place).setTextColor(Color.parseColor("#3170B7"));
                        break;
                    case 2:
                        buttonNums.get (place).setTextColor(Color.parseColor("#1E631F"));
                        break;
                    case 3:
                        buttonNums.get (place).setTextColor(Color.parseColor("#C10313"));
                        break;
                    case 4:
                        buttonNums.get (place).setTextColor(Color.parseColor("#03077A"));
                        break;
                    case 5:
                        buttonNums.get (place).setTextColor(Color.parseColor("#820000"));
                        break;
                    case 6:
                        buttonNums.get (place).setTextColor(Color.parseColor("#0EBA65"));
                        break;
                    case 7:
                        buttonNums.get (place).setTextColor(Color.parseColor("#FFFFFF"));
                        break;
                    case 8:
                        buttonNums.get (place).setTextColor(Color.parseColor("#000000"));
                        break;
                }

                buttonNums.get(place).setText(Integer.toString(numMines));
                state = 2;
                //shows the number of mines surrounding the space.
            }
        }
    }

    //checks the board to see if it's completed.
    private boolean checkW() {
        for (int i = 0 ; i < 81 ; i++) {
            if (minePlacements.get (i).isMine) {

            }
            else {
                if (minePlacements.get (i).state == 0 || minePlacements.get (i).state == 1) {
                    return false;
                }
            }
        }
        return true;
    }
    //
    public void held() {
        if (gameState == 1) {
            if (state == 0) {
                state = 1;
                System.out.println("btn state: " + state);
                buttonNums.get(place).setBackgroundResource(R.drawable.flag_background);
            } else if (state == 1) {
                state = 0;
                System.out.println("btn state: " + state);
                buttonNums.get(place).setBackgroundResource(R.drawable.button_background);
            }
        }
    }

    private void DFS() {
        alreadyVisit.add (minePlacements.get (place));
        currPath.push (minePlacements.get (place));
        switch (searchAround()) {
            case 1:
                System.out.println("1");
                if (!(alreadyVisit.contains (minePlacements.get (place - 1)))) {
                    minePlacements.get (place - 1).getsChosen();
                }
                if (!(alreadyVisit.contains (minePlacements.get (place + 1)))) {
                    minePlacements.get (place + 1).getsChosen();
                }
                if (!(alreadyVisit.contains (minePlacements.get (place + 8)))) {
                    minePlacements.get (place + 8).getsChosen();
                }
                if (!(alreadyVisit.contains (minePlacements.get (place + 9)))) {
                    minePlacements.get (place + 9).getsChosen();
                }
                if (!(alreadyVisit.contains (minePlacements.get (place + 10)))) {
                    minePlacements.get (place + 10).getsChosen();
                }
                break;
            case 2:
                System.out.println ("2");
                if (!(alreadyVisit.contains (minePlacements.get (place - 9)))) {
                    minePlacements.get (place - 9).getsChosen();
                }
                if (!(alreadyVisit.contains (minePlacements.get (place - 8)))) {
                    minePlacements.get (place - 8).getsChosen();
                }
                if (!(alreadyVisit.contains (minePlacements.get (place + 1)))) {
                    minePlacements.get (place + 1).getsChosen();
                }
                if (!(alreadyVisit.contains (minePlacements.get (place + 9)))) {
                    minePlacements.get (place + 9).getsChosen();
                }
                if (!(alreadyVisit.contains (minePlacements.get (place + 10)))) {
                    minePlacements.get (place + 10).getsChosen();
                }
                break;
            case 3:
                System.out.println ("3");
                if (!(alreadyVisit.contains (minePlacements.get (place - 1)))) {
                    minePlacements.get (place - 1).getsChosen();
                }
                if (!(alreadyVisit.contains (minePlacements.get (place + 1)))) {
                    minePlacements.get (place + 1).getsChosen();
                }
                if (!(alreadyVisit.contains (minePlacements.get (place - 8)))) {
                    minePlacements.get (place - 8).getsChosen();
                }
                if (!(alreadyVisit.contains (minePlacements.get (place - 9)))) {
                    minePlacements.get (place - 9).getsChosen();
                }
                if (!(alreadyVisit.contains (minePlacements.get (place - 10)))) {
                    minePlacements.get (place - 10).getsChosen();
                }
                break;
            case 4:
                System.out.println ("4");
                if (!(alreadyVisit.contains (minePlacements.get (place - 9)))) {
                    minePlacements.get (place - 9).getsChosen();
                }
                if (!(alreadyVisit.contains (minePlacements.get (place - 10)))) {
                    minePlacements.get (place - 10).getsChosen();
                }
                if (!(alreadyVisit.contains (minePlacements.get (place - 1)))) {
                    minePlacements.get (place - 1).getsChosen();
                }
                if (!(alreadyVisit.contains (minePlacements.get (place + 9)))) {
                    minePlacements.get (place + 9).getsChosen();
                }
                if (!(alreadyVisit.contains (minePlacements.get (place + 8)))) {
                    minePlacements.get (place + 8).getsChosen();
                }
                break;
            case 5:
                System.out.println ("5");
                if (!(alreadyVisit.contains (minePlacements.get (place + 1)))) {
                    minePlacements.get (place + 1).getsChosen();
                }
                if (!(alreadyVisit.contains (minePlacements.get (place + 10)))) {
                    minePlacements.get (place + 10).getsChosen();
                }
                if (!(alreadyVisit.contains (minePlacements.get (place + 9)))) {
                    minePlacements.get (place + 9).getsChosen();
                }
                break;
            case 6:
                System.out.println ("6");
                if (!(alreadyVisit.contains (minePlacements.get (place - 1)))) {
                    minePlacements.get (place - 1).getsChosen();
                }
                if (!(alreadyVisit.contains (minePlacements.get (place + 8)))) {
                    minePlacements.get (place + 8).getsChosen();
                }
                if (!(alreadyVisit.contains (minePlacements.get (place + 9)))) {
                    minePlacements.get (place + 9).getsChosen();
                }
                break;
            case 7:
                System.out.println ("7");
                if (!(alreadyVisit.contains (minePlacements.get (place + 1)))) {
                    minePlacements.get (place + 1).getsChosen();
                }
                if (!(alreadyVisit.contains (minePlacements.get (place - 8)))) {
                    minePlacements.get (place - 8).getsChosen();
                }
                if (!(alreadyVisit.contains (minePlacements.get (place - 9)))) {
                    minePlacements.get (place - 9).getsChosen();
                }
                break;
            case 8:
                System.out.println ("8");
                if (!(alreadyVisit.contains (minePlacements.get (place - 1)))) {
                    minePlacements.get (place - 1).getsChosen();
                }
                if (!(alreadyVisit.contains (minePlacements.get (place - 10)))) {
                    minePlacements.get (place - 10).getsChosen();
                }
                if (!(alreadyVisit.contains (minePlacements.get (place - 9)))) {
                    minePlacements.get (place - 9).getsChosen();
                }
                break;
            case 9:
                System.out.println ("9");
                if (!(alreadyVisit.contains (minePlacements.get (place - 1)))) {
                    minePlacements.get (place - 1).getsChosen();
                }
                if (!(alreadyVisit.contains (minePlacements.get (place + 1)))) {
                    minePlacements.get (place + 1).getsChosen();
                }
                if (!(alreadyVisit.contains (minePlacements.get (place - 8)))) {
                    minePlacements.get (place - 8).getsChosen();
                }
                if (!(alreadyVisit.contains (minePlacements.get (place - 9)))) {
                    minePlacements.get (place - 9).getsChosen();
                }
                if (!(alreadyVisit.contains (minePlacements.get (place - 10)))) {
                    minePlacements.get (place - 10).getsChosen();
                }
                if (!(alreadyVisit.contains (minePlacements.get (place + 9)))) {
                    minePlacements.get (place + 9).getsChosen();
                }
                if (!(alreadyVisit.contains (minePlacements.get (place + 8)))) {
                    minePlacements.get (place + 8).getsChosen();
                }
                if (!(alreadyVisit.contains (minePlacements.get (place + 10)))) {
                    minePlacements.get (place + 10).getsChosen();
                }
                break;
        }
        currPath.pop();
    }

    public int searchAround() {
        if (place > 0 && place < 8) {
            return 1;
        }
        else if (place % 9 == 0 && place != 0 && place != 72) {
            return 2;
        }
        else if (place > 72 && place < 80) {
            return 3;
        }
        else if (place % 9 == 8 && place != 8 && place != 80) {
            return 4;
        }
        else if (place == 0) {
            return 5;
        }
        else if (place == 8) {
            return 6;
        }
        else if (place == 72) {
            return 7;
        }
        else if (place == 80) {
            return 8;
        }
        else {
            return 9;
        }
    }

    public static void setBoard (int no) {

        for (int i = 0 ; i < 10 ; i++) {
            Random ranNum = new Random();
            boolean cont = true;
            while (cont) {
                int place = (int) (ranNum.nextFloat() * 81);
                if (!(minePlacements.get(place).getIsMine()) && place != no) {
                    switch (minePlacements.get (no).searchAround()) {
                        case 1:
                            if (place == no - 1 || place == no + 1 || place == no + 8 || place == no + 9 || place == no + 10) {

                            }
                            else {
                                minePlacements.get(place).setIsMine(true);
                                cont = false;
                            }
                            break;
                        case 2:
                            if (place == no - 9 || place == no + 9 || place == no - 8 || place == no + 1 || place == no + 10) {

                            }
                            else {
                                minePlacements.get(place).setIsMine(true);
                                cont = false;
                            }
                            break;
                        case 3:
                            if (place == no - 1 || place == no + 1 || place == no - 8 || place == no - 9 || place == no - 10) {

                            } else {
                                minePlacements.get(place).setIsMine(true);
                                cont = false;
                            }
                            break;
                        case 4:
                            if (place == no - 1 || place == no - 10 || place == no - 9 || place == no + 9 || place == no + 8) {

                            }
                            else {
                                minePlacements.get(place).setIsMine(true);
                                cont = false;
                            }
                            break;
                        case 5:
                            if (place == no + 1 || place == no + 9 || place == no + 10) {

                            }
                            else {
                                minePlacements.get(place).setIsMine(true);
                                cont = false;
                            }
                            break;
                        case 6:
                            if (place == no - 1 || place == no + 9 || place == no + 8) {

                            }
                            else {
                                minePlacements.get(place).setIsMine(true);
                                cont = false;
                            }
                            break;
                        case 7:
                            if (place == no + 1 || place == no - 9 || place == no - 8) {

                            }
                            else {
                                minePlacements.get(place).setIsMine(true);
                                cont = false;
                            }
                            break;
                        case 8:
                            if (place == no - 1 || place == no - 9 || place == no - 10) {

                            }
                            else {
                                minePlacements.get(place).setIsMine(true);
                                cont = false;
                            }
                            break;
                        case 9:
                            if (place == no + 1 || place == no - 1 || place == no - 8 || place == no - 9
                                    || place == no - 10 || place == no + 8 || place == no + 9 || place == no + 10) {

                            }
                            else {
                                minePlacements.get(place).setIsMine(true);
                                cont = false;
                            }
                            break;
                    }
                }
            }
        }
    }
}
