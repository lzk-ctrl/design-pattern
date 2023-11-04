package decorator;

public class Footer1 extends Decorator {
    public Footer1(Display display) {
        super(display);
    }

    @Override
    public int getRows() {
        return display.getRows() + 1;
    }

    @Override
    public String getRowText(int row) {
        if(row == display.getRows()){
            return "Footer1";
        }
        return display.getRowText(row);
    }
}
