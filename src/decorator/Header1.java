package decorator;

public class Header1 extends Decorator{
    public Header1(Display display) {
        super(display);
    }
    @Override
    public int getRows() {
        return display.getRows() + 1;
    }

    @Override
    public String getRowText(int row) {
        if(row==0){
            return "Header1";
        }
        return display.getRowText(row-1);
    }
}
