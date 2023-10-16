package Iterrator_pattern;

public class Page implements Aggregate{
    private String[] text;
    private int last;

    public Page() {
        this.text = new String[100];
        this.last = 0;
    }
    public String getTextAt(int index) {
        return text[index];
    }
    public void appendText(String str) {
        this.text[last] = str;
        last++;
    }
    public int getLength() {
        return last;
    }
    @Override
    public PageIterator iterator() {
        return new PageIterator(this);
    }


}
