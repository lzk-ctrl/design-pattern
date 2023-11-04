package visitor;

public class Code extends Element{
    private String code;

    public Code(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
