package observer;

public class Observer2 extends Observer{
    public void update(EditSubject subject) {
        System.out.println(subject.getEditContent()+":显示可编辑文本区中出现的单词");
    }
}
