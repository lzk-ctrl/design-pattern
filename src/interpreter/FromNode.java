package interpreter;

public class FromNode extends AbstractNode{
    private String from;

    public FromNode(String from) {
        this.from = from;
    }

    @Override
    public String interpret() {
        return  "FROM " + from;
    }
}