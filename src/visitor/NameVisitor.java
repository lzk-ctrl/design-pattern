package visitor;

public class NameVisitor extends Visitor{
    public void visit(Code code) {
        System.out.println("NameVisitor: " + code.getCode());
    }
}
