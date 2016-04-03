package com.masebeni.assignmnet5.soccerplayer.creational;

import com.masebeni.assignmnet5.soccerplayer.creational.singleton.Cat;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Isiphile on 2016/04/03.
 */
public class TestSingleton {
        private Cat cat1 = null;
        private Cat cat2 = null;
        private Cat cat3 = null;

        @Before
        public void setUp() throws Exception{
            cat1 = Cat.getInstance();
            cat2 = Cat.getInstance();
        }

        @Test
        public void testBark() throws Exception{
            Assert.assertEquals("Meowing", cat1.meow());
        }

        @Test
        public void testInstance() throws Exception{
            Assert.assertEquals(cat1, cat2);
        }
    }
