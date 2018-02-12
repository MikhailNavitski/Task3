package by.tc.task3.creator.command.impl;

import by.tc.task3.creator.CloseTagCreator;
import by.tc.task3.creator.DeclarationTagCreator;
import by.tc.task3.creator.EntityTagCreator;
import by.tc.task3.creator.OpenTagCreator;
import by.tc.task3.creator.command.Command;
import by.tc.task3.creator.command.TagDirector;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import static by.tc.task3.constant.ConstantReg.*;


public class TagDirectorImpl implements TagDirector {

    private final static TagDirectorImpl instance = new TagDirectorImpl();


    public static TagDirectorImpl getInstance() {
        return instance;
    }

    private static Map<Boolean, Command> map = new HashMap<>();

    private TagDirectorImpl() {
    }

    public void addMap(String tagType) {
        map.put(Pattern.compile(REG_OPEN).matcher(tagType).matches(), new OpenTagCreator());
        map.put(Pattern.compile(REG_CLOSE).matcher(tagType).matches(), new CloseTagCreator());
        map.put(Pattern.compile(REG_ENTITY).matcher(tagType).matches(), new EntityTagCreator());
        map.put(Pattern.compile(REG_META).matcher(tagType).matches(), new DeclarationTagCreator());
    }

    public Command getCommand(boolean match) {
        Command command;
        command = map.get(match);
        return command;
    }
}
