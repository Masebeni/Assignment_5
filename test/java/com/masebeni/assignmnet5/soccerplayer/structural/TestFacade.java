package com.masebeni.assignmnet5.soccerplayer.structural;

import com.masebeni.assignmnet5.soccerplayer.structural.facade.DrawShape;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Isiphile on 2016/04/03.
 */
public class TestFacade {
    private DrawShape drawShape = null;

    @Before
    public void setUp() {
        drawShape = new DrawShape();
    }

    @Test
    public void drawRectangle() {
        Assert.assertEquals(true, drawShape.drawRectangle().equalsIgnoreCase("Draw Rectangle"));
    }

    @Test
    public void drawSquare() {
        Assert.assertEquals(true, drawShape.drawSquare().equalsIgnoreCase("Draw Square"));
    }
}

