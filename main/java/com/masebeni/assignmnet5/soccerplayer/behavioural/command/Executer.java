package com.masebeni.assignmnet5.soccerplayer.behavioural.command;

/**
 * Created by Isiphile on 2016/04/03.
 */
public class Executer {
    Command command;

    public Executer(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public String invokeCommand() {
        return command.command();
    }
}
