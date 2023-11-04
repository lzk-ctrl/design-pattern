package observer;

public class Observer1 extends Observer{
    @Override
    public void update(EditSubject subject) {
        System.out.println( subject.getEditContent()+":显示可编辑文本区中出现的单词总数量和字符总数量");
    }
}
