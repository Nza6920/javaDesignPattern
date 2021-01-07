package com.niu.design.pattern.behavioral.command;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * 命令模式
 *
 * @author [nza]
 * @version 1.0 [2021/01/07 15:46]
 * @createTime [2021/01/07 15:46]
 */
public class Staff {

    private List<Command> commands = Lists.newArrayList();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void executeCommands() {
        for (Command command : commands) {
            command.execute();
        }
        commands.clear();
    }
}
