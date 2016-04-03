package com.masebeni.assignmnet5.soccerplayer.behavioural.strategy;

/**
 * Created by Isiphile on 2016/04/03.
 */
public class Student {
    int score;
    TestScore testScore;

    public Student(int score, TestScore testScore) {
        this.score = score;
        this.testScore = testScore;
    }

    public void setTestScore(TestScore testScore) {
        this.testScore = testScore;
    }

    public int getScore() {
        return score;
    }

    public boolean result() {
        return testScore.testScore(score);
    }
}
