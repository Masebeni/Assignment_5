package com.masebeni.assignmnet5.soccerplayer.structural;

import com.masebeni.assignmnet5.soccerplayer.structural.proxy.Image;
import com.masebeni.assignmnet5.soccerplayer.structural.proxy.ProxyImage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Isiphile on 2016/04/03.
 */
public class TestProxy {
    private Image image1 = null;
    private Image image2 = null;

    @Before
    public void setUp() {
        image1 = new ProxyImage("Image1.jpg");
        image2 = new ProxyImage("Image2.jpg");
    }

    @Test
    public void testProxyImage() {
        Assert.assertEquals(true, image1.display().equalsIgnoreCase("Displaying Image1.jpg"));
    }

    @Test
    public void testRealImage() {
        Assert.assertEquals(true, image2.display().equalsIgnoreCase("Displaying Image2.jpg"));
    }
}

