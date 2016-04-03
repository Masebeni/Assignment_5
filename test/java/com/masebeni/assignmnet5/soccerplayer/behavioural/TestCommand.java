package com.masebeni.assignmnet5.soccerplayer.behavioural;

import com.masebeni.assignmnet5.soccerplayer.behavioural.command.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Isiphile on 2016/04/03.
 */
public class TestCommand {
    private Run run = null;
    private Command runCommand = null;
    private Walk walk = null;
    private Command walkCommand = null;
    private Executer executer1 = null;
    private Executer executer2 = null;

    @Before
    public void setUp() {
        run = new Run();
        runCommand = new RunCommand(run);
        walk = new Walk();
        walkCommand = new WalkCommand(walk);
        executer1 = new Executer(runCommand);
        executer2 = new Executer(walkCommand);
    }

    @Test
    public void testRunCommand() {
        Assert.assertEquals(true, executer1.invokeCommand().equalsIgnoreCase("Running"));
    }

    @Test
    public void testWalkCommand() {
        Assert.assertEquals(true, executer2.invokeCommand().equalsIgnoreCase("Walking"));
    }
}

