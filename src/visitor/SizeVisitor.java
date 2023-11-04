package visitor;

public class SizeVisitor extends Visitor{
    public void visit(Code code) {
        System.out.println("SizeVisitor: " + code.getCode());
    }
}
