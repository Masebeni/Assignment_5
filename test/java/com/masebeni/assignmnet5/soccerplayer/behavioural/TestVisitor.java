package com.masebeni.assignmnet5.soccerplayer.behavioural;

import com.masebeni.assignmnet5.soccerplayer.behavioural.visitor.Body;
import com.masebeni.assignmnet5.soccerplayer.behavioural.visitor.BodyPart;
import com.masebeni.assignmnet5.soccerplayer.behavioural.visitor.MovePart;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Isiphile on 2016/04/03.
 */
public class TestVisitor {
    private BodyPart body = null;

    @Before
    public void setUp() {
        body = new Body();
        body.move(new MovePart());
    }

    @Test
    public void test() {
        Assert.assertEquals(true, body.move(new MovePart()).equalsIgnoreCase("Moving arms Moving legs Moving body "));
    }
}
