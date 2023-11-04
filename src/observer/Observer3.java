package observer;

public class Observer3 extends Observer{
    public void update(EditSubject subject) {
        System.out.println(subject.getEditContent()+":按照出现频次降序显示可编辑文本区中出现的单词以及每个单词出现的次数");
    }
}
