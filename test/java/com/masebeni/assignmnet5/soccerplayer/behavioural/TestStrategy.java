package com.masebeni.assignmnet5.soccerplayer.behavioural;

import com.masebeni.assignmnet5.soccerplayer.behavioural.strategy.DistinctionPass;
import com.masebeni.assignmnet5.soccerplayer.behavioural.strategy.NormalPass;
import com.masebeni.assignmnet5.soccerplayer.behavioural.strategy.Student;
import com.masebeni.assignmnet5.soccerplayer.behavioural.strategy.TestScore;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Isiphile on 2016/04/03.
 */
public class TestStrategy {
    private TestScore distinctionPass = null;
    private TestScore normalPass = null;
    private Student student1 = null;
    private Student student2 = null;

    @Before
    public void setUp() {
        distinctionPass = new DistinctionPass();
        normalPass = new NormalPass();
        student1 = new Student(98, distinctionPass);
        student2 = new Student(58, normalPass);
    }

    @Test
    public void getDistinctionScore() {
        Assert.assertEquals(98, student1.getScore());
    }

    @Test
    public void testDistinctionPass() {
        Assert.assertEquals(true, student1.result());
    }

    @Test
    public void getNormalScore() {
        Assert.assertEquals(58, student2.getScore());
    }

    @Test
    public void testNormalPass() {
        Assert.assertEquals(true, student2.result());
    }
}

