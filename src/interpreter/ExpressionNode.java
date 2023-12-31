package interpreter;

public class ExpressionNode extends AbstractNode {
    private AbstractNode action;
    private AbstractNode from;
    private AbstractNode to;

    public ExpressionNode(AbstractNode action, AbstractNode from, AbstractNode to) {
        this.action = action;
        this.from = from;
        this.to = to;
    }

    @Override
    public String interpret() {
        return this.action.interpret() + " "
                + this.from.interpret() + " "
                + this.to.interpret();
    }
}