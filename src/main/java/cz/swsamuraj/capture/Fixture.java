package cz.swsamuraj.capture;

import cz.swsamuraj.capture.model.NodeModel;
import cz.swsamuraj.capture.model.NodeRole;
import cz.swsamuraj.capture.model.PublicNodeModel;
import cz.swsamuraj.capture.model.TreeModel;

import java.util.ArrayList;
import java.util.List;

public class Fixture {

    public static TreeModel createModel() {
        TreeModel treeModel = new TreeModel();
        List<NodeModel> nodes = new ArrayList<>();
        nodes.add(new NodeModel("Node-1", NodeRole.SECONDARY));
        nodes.add(new NodeModel("Node-2", NodeRole.SECONDARY));
        nodes.add(new NodeModel("Node-3", NodeRole.PRIMARY));
        treeModel.setNodes(nodes);

        return treeModel;
    }

    public static int indexOfPrimaryNode(List<? extends PublicNodeModel> nodes) {
        for (int i = 0; i < nodes.size(); i++) {
            NodeModel node = (NodeModel) nodes.get(i);

            if (NodeRole.PRIMARY.equals(node.getNodeRole())) {
                return i;
            }
        }

        return -1;
    }
}
