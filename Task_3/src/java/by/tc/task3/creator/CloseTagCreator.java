package by.tc.task3.creator;

import by.tc.task3.constant.TagType;
import by.tc.task3.creator.command.Command;
import by.tc.task3.entity.Node;

public class CloseTagCreator implements Command {

    private static final String REG_CLOSE_TAG = "<\\";

    @Override
    public Node createTeg(String tag) {
        Node node = new Node();
        node.setType(TagType.CLOSE_TYPE);
        node.setName(REG_CLOSE_TAG + tag);
        return node;
    }
}
