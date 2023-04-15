package org.techtown.elemath;

import androidx.fragment.app.Fragment;

public class QuizProblemFragment {
    private static int countQuizProblemNumber;
    private static boolean selectGame;

    public QuizProblemFragment() {
    }

    public QuizProblemFragment(int number) {
        this.countQuizProblemNumber = number;
    }

    public int getCountQuizProblemNumber() {
        return this.countQuizProblemNumber;
    }

    public void increaseCountQuizProblemNumber() {
        this.countQuizProblemNumber += 1;
    }

    public boolean getSelectGame() {
        return this.selectGame;
    }

    public void RandomGame() {
        this.selectGame = false;
    }

    public void SelectGame() {
        this.selectGame = true;
    }

    public Fragment selectQuizProblemFragment(int randomNumber) {
        Fragment randomFragment = null;
        switch(randomNumber) {
            case 0:
                randomFragment = new Problem1Fragment();
                break;
            case 1:
                randomFragment = new Problem2Fragment();
                break;
            case 2:
                randomFragment = new Problem3Fragment();
                break;
            case 3:
                randomFragment = new Problem4Fragment();
                break;
            case 4:
                randomFragment = new Problem5Fragment();
                break;
            case 5:
                randomFragment = new Problem6Fragment();
                break;
            case 6:
                randomFragment = new Problem7Fragment();
                break;
            case 7:
                randomFragment = new Problem8Fragment();
                break;
            case 8:
                randomFragment = new Problem9Fragment();
                break;
            case 9:
                randomFragment = new Problem10Fragment();
                break;
            case 10:
                randomFragment = new Problem11Fragment();
                break;
            case 11:
                randomFragment = new Problem12Fragment();
                break;
            case 12:
                randomFragment = new Problem13Fragment();
                break;
            case 13:
                randomFragment = new Problem14Fragment();
                break;
            case 14:
                randomFragment = new Problem15Fragment();
                break;
            case 15:
                randomFragment = new Problem16Fragment();
                break;
            case 16:
                randomFragment = new Problem17Fragment();
                break;
            case 17:
                randomFragment = new Problem18Fragment();
                break;
            case 18:
                randomFragment = new Problem19Fragment();
                break;
            case 19:
                randomFragment = new Problem20Fragment();
                break;
        }
        return randomFragment;
    }
}
