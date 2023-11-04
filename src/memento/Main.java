package memento;

public class Main {
    public static void main(String[] args) {
        App app = new App();
        app.excute("打开文件");
        app.excute("编辑文件");
        app.excute("保存文件");
        app.excute("关闭文件");
        app.undo();
        app.undo();
        app.redo();
        app.redo();
    }

}
