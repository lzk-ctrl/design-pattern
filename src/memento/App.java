package memento;

import java.util.Stack;

public class App {
    private static int count = 0;
    private static Stack<Memento> undoStack = new Stack<>();
    private static Stack<Memento> redoStack = new Stack<>();
    public void excute(String command) {
        System.out.println("App执行操作"+count+"："+command );
        count++;
        undoStack.push(new Memento(command));
    }
    public void undo() {
        if (undoStack.isEmpty()) {
            System.out.println("没有可以撤销的操作");
            return;
        }
        Memento memento = undoStack.pop();
        redoStack.push(memento);
        System.out.println("撤销操作"+count+"："+memento.getCommand());
        count--;
    }
    public void redo() {
        if (redoStack.isEmpty()) {
            System.out.println("没有可以恢复的操作");
            return;
        }
        Memento memento = redoStack.pop();
        undoStack.push(memento);
        System.out.println("恢复操作"+count+"："+memento.getCommand());
        count++;
    }
}
