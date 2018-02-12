package by.tc.task3.creator;

import by.tc.task3.constant.TagType;
import by.tc.task3.creator.command.Command;
import by.tc.task3.entity.Node;

public class OpenTagCreator implements Command {

    @Override
    public Node createTeg(String tag) {
        Node node = new Node();
        node.setName(tag);
        node.setType(TagType.OPEN_TYPE);
        return node;
    }
}
