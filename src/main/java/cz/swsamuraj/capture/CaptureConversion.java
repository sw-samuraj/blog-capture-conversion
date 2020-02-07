package cz.swsamuraj.capture;

import cz.swsamuraj.capture.model.NodeModel;
import cz.swsamuraj.capture.model.PublicNodeModel;
import cz.swsamuraj.capture.model.TreeModel;

public class CaptureConversion {

    public static void main(String[] args) {
        TreeModel treeModel = Fixture.createModel();
        int index = Fixture.indexOfPrimaryNode(treeModel.getNodes());
        NodeModel primaryNode = (NodeModel) treeModel.getNodes().get(index);

        // following two lines won't compile
        treeModel.getNodes().set(index, treeModel.getNodes().get(0));
        treeModel.getNodes().set(0, primaryNode);

        // this will compile & run
        treeModel.getNodes().set(index, convert(treeModel.getNodes().get(0)));
        treeModel.getNodes().set(0, convert(primaryNode));
    }

    // silly conversion
    private static <T extends PublicNodeModel> T convert(PublicNodeModel node) {
        return (T) node;
    }

}
