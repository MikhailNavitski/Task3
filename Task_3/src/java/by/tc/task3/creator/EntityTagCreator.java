package by.tc.task3.creator;

import by.tc.task3.constant.TagType;
import by.tc.task3.creator.command.Command;
import by.tc.task3.entity.Node;

public class EntityTagCreator implements Command {

    private static final String REG_CLOSE_TAG = "</";

    @Override
    public Node createTeg(String tag) {
        Node node = new Node();
        node.setName(tag.replaceAll(REG_CLOSE_TAG, ""));
        node.setType(TagType.ENTITY_TYPE);
        return node;
    }
}
