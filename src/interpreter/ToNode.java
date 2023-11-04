package interpreter;

public class ToNode extends AbstractNode{
    private String to;

    public ToNode(String to) {
        this.to = to;
    }

    @Override
    public String interpret() {
        return "TO " + to;
    }
}