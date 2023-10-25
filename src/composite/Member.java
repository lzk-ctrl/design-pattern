package composite;

public class Member extends One{
    private String name;
    public Member(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void printList() {
        System.out.println("Member: " + name);
    }
    public void contact(One one) {
        System.out.println(name+" contacted "+one.getName());
    }
}
