package decorator;

public abstract class Display {
    public abstract int getRows();
    public abstract String getRowText(int row);
    public final void show(){
        int n=getRows();
        for(int i=0;i<n;i++){
            System.out.println(getRowText(i));
        }
    }
}
