package cz.swsamuraj.capture.model;

public class PublicNodeModel {

    private String name;
    private final NodeRole nodeRole;

    public PublicNodeModel(String name, NodeRole nodeRole) {
        this.name = name;
        this.nodeRole = nodeRole;
    }

    public String getName() {
        return name;
    }

    public NodeRole getNodeRole() {
        return nodeRole;
    }
}
