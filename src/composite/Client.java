package composite;

public class Client {
    public static void main(String[] args){
        One root= new Group("root");
        One a=new Member("a");
        One A= new Group("A");
        One B= new Group("B");
        One b=new Member("b");
        root.add(a);
        root.add(A);
        A.add(B);
        B.add(b);
        root.printList();
        System.out.println("-----");
        a.contact(b);
        A.printList();


    }

}
