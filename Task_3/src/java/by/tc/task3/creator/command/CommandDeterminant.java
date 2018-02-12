package by.tc.task3.creator.command;

import by.tc.task3.creator.command.impl.TagDirectorImpl;
import by.tc.task3.entity.Node;
import by.tc.task3.print_info.PrintInfo;

public class CommandDeterminant {
    public static void commandIdentify(String tagType) {
        Node node;

        TagDirectorImpl director = TagDirectorImpl.getInstance();
        director.addMap(tagType);

        Command command = director.getCommand(true);
        node = command.createTeg(tagType);

        PrintInfo info = PrintInfo.getInstance();
        info.printInformation(node);
    }
}
