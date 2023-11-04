package observer;

public class Main {
    public static void main(String[] args) {
        EditSubject subject = new EditSubject();
        Observer1 observer1 = new Observer1();
        Observer2 observer2 = new Observer2();
        Observer3 observer3 = new Observer3();
        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.addObserver(observer3);
        subject.edit("hello world");

    }
}
