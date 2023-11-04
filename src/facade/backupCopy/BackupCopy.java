package facade.backupCopy;

public class BackupCopy {
    private BackupCopy() {
    }
    public static void copy(){
        BookManage bookManage = new BookManage();
        bookManage.copy();
        TextManage textManage = new TextManage();
        textManage.copy();
    }
}
