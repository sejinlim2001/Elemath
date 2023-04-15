package org.techtown.elemath;

import androidx.fragment.app.Fragment;

public class MathProblemFragment {
    private static int countMathProblemNumber;
    private static boolean selectGame;

    public MathProblemFragment() {
    }

    public MathProblemFragment(int number) {
        this.countMathProblemNumber = number;
    }

    public int getCountMathProblemNumber() {
        return this.countMathProblemNumber;
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

    public void increaseCountMathProblemNumber() {
        this.countMathProblemNumber += 1;
    }

    public Fragment selectMathProblemFragment(int randomNumber) {
        Fragment randomFragment = null;
        switch(randomNumber) {
            case 0:
                randomFragment = new ProblemaFragment();
                break;
            case 1:
                randomFragment = new ProblembFragment();
                break;
            case 2:
                randomFragment = new ProblemcFragment();
                break;
            case 3:
                randomFragment = new ProblemdFragment();
                break;
            case 4:
                randomFragment = new ProblemeFragment();
                break;
            case 5:
                randomFragment = new ProblemfFragment();
                break;
            case 6:
                randomFragment = new ProblemgFragment();
                break;
            case 7:
                randomFragment = new ProblemhFragment();
                break;
            case 8:
                randomFragment = new ProblemiFragment();
                break;
            case 9:
                randomFragment = new ProblemjFragment();
                break;
            case 10:
                randomFragment = new ProblemkFragment();
                break;
            case 11:
                randomFragment = new ProblemlFragment();
                break;
            case 12:
                randomFragment = new ProblemmFragment();
                break;
            case 13:
                randomFragment = new ProblemnFragment();
                break;
            case 14:
                randomFragment = new ProblemoFragment();
                break;
            case 15:
                randomFragment = new ProblempFragment();
                break;
            case 16:
                randomFragment = new ProblemqFragment();
                break;
            case 17:
                randomFragment = new ProblemrFragment();
                break;
            case 18:
                randomFragment = new ProblemsFragment();
                break;
            case 19:
                randomFragment = new ProblemtFragment();
                break;
            case 20:
                randomFragment = new ProblemuFragment();
                break;
            case 21:
                randomFragment = new ProblemvFragment();
                break;
            case 22:
                randomFragment = new ProblemwFragment();
                break;
            case 23:
                randomFragment = new ProblemxFragment();
                break;
            case 24:
                randomFragment = new ProblemyFragment();
                break;
            case 25:
                randomFragment = new ProblemzFragment();
                break;
        }
        return randomFragment;
    }
}
