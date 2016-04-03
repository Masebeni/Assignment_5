package com.masebeni.assignmnet5.soccerplayer.behavioural.command;

/**
 * Created by Isiphile on 2016/04/03.
 */
public class RunCommand implements Command {

    Run run;
    public RunCommand(Run run) {
        this.run = run;
    }
    @Override
    public String command() {
        return run.run();
    }
}