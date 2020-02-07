package cz.swsamuraj.capture.model;

import java.util.ArrayList;
import java.util.List;

public class PublicTreeModel {
    private List<? extends PublicNodeModel> nodes = new ArrayList<>();

    public List<? extends PublicNodeModel> getNodes() {
        return nodes;
    }

    public void setNodes(List<? extends PublicNodeModel> nodes) {
        this.nodes = nodes;
    }
}
