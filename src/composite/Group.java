package composite;

public class Group extends One{
    private String name;
    private One[] ones = new One[100];
    public String getName() {
        return name;
    }
    public Group(String name) {
        this.name = name;
    }
    public void add(One one) {
        for(int i=0; i<100; i++) {
            if(ones[i] == null) {
                ones[i] = one;
                break;
            }
        }
    }
    public void printList() {
        System.out.println("Group: " + name);
        for(int i=0; i<100; i++) {
            if(ones[i] != null) {
                ones[i].printList();
            }
        }
    }
}
