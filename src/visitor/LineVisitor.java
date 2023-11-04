package visitor;

public class LineVisitor extends Visitor {
    public void visit(Code code) {
        System.out.println("LineVisitor: " + code.getCode());
    }
}
