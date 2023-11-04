package visitor;

public class Main {
    public static void main(String[] args) {
        Element[] list = {new Code("Code1"), new Code("Code2"), new Code("Code3")};
        Visitor[] visitors = {new SizeVisitor(), new NameVisitor()};
        for (Visitor visitor : visitors) {
            for (Element element : list) {
                element.accept(visitor);
            }
        }
    }
}
