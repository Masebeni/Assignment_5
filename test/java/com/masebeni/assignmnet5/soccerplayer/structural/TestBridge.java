package com.masebeni.assignmnet5.soccerplayer.structural;

import com.masebeni.assignmnet5.soccerplayer.structural.bridge.BigRectangle;
import com.masebeni.assignmnet5.soccerplayer.structural.bridge.Rectangle;
import com.masebeni.assignmnet5.soccerplayer.structural.bridge.Shape;
import com.masebeni.assignmnet5.soccerplayer.structural.bridge.SmallRectangle;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Isiphile on 2016/04/03.
 */
public class TestBridge {
    private Shape bigRectangle = null;
    private Shape smallRectangle = null;

    @Before
    public void setUp() {
        bigRectangle = new Rectangle(6, 5, new BigRectangle());
        smallRectangle = new Rectangle(3, 2, new SmallRectangle());
    }

    @Test
    public void testBigRectangle() {
        Assert.assertEquals(true, bigRectangle.draw().equalsIgnoreCase("Height: 6 Width: 5"));
    }

    @Test
    public void testSmallRectangle() {
        Assert.assertEquals(true, smallRectangle.draw().equalsIgnoreCase("Height: 3 Width: 2"));
    }
}
