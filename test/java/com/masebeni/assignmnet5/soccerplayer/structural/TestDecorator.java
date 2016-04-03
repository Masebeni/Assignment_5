package com.masebeni.assignmnet5.soccerplayer.structural;

import com.masebeni.assignmnet5.soccerplayer.structural.decorator.BigShape;
import com.masebeni.assignmnet5.soccerplayer.structural.decorator.Rectangle;
import com.masebeni.assignmnet5.soccerplayer.structural.decorator.Shape;
import com.masebeni.assignmnet5.soccerplayer.structural.decorator.Square;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Isiphile on 2016/04/03.
 */
public class TestDecorator {
    private Shape rectangle = null;
    private Shape bigRectangle = null;
    private Shape square = null;
    private Shape bigSquare = null;

    @Before
    public void setUp() {
        rectangle = new Rectangle();
        bigRectangle = new BigShape(new Rectangle());
        square = new Square();
        bigSquare = new BigShape(new Square());
    }

    @Test
    public void testRectangle() {
        Assert.assertEquals(true, rectangle.draw().equalsIgnoreCase("Rectangle"));
    }

    @Test
    public void testBigRectangle() {
        Assert.assertEquals(true, bigRectangle.draw().equalsIgnoreCase("Rectangle: Red"));
    }

    @Test
    public void testSquare() {
        Assert.assertEquals(true, square.draw().equalsIgnoreCase("Square"));
    }

    @Test
    public void testBigSquare() {
        Assert.assertEquals(true, bigSquare.draw().equalsIgnoreCase("Square: Red"));
    }
}
