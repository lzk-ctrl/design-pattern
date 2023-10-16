package Iterrator_pattern;

public class main {

    //main方法
    public static void main(String[] args) {
        Page page = new Page();
        page.appendText("hello1");
        page.appendText("hello2");
        page.appendText("hello3");
        page.appendText("hello4");
        page.appendText("hello5");
        page.appendText("hello6");
        page.appendText("hello7");
        page.appendText("hello8");
        page.appendText("hello9");
        page.appendText("hello10");
        page.appendText("hello11");
        PageIterator it= page.iterator();
        it.setPage(2,3);//设置迭代器读取第2页，每页3个内容
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("==================================");
        it.setPage(4,3);
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
