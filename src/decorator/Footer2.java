package decorator;

public class Footer2 extends Decorator {
    public Footer2(Display display) {
        super(display);
    }

    @Override
    public int getRows() {
        return display.getRows() + 1;
    }

    @Override
    public String getRowText(int row) {
        if(row == display.getRows()){
            return "Footer2";
        }
        return display.getRowText(row);
    }
}
