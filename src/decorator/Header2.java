package decorator;

public class Header2 extends Decorator{
    public Header2(Display display) {
        super(display);
    }
    @Override
    public int getRows() {
        return display.getRows() + 1;
    }

    @Override
    public String getRowText(int row) {
        if(row==0){
            return "Header2";
        }
        return display.getRowText(row-1);
    }
}
