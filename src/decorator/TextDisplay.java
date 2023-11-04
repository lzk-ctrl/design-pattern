package decorator;

public class TextDisplay extends Display{
    private String text;
    public TextDisplay(String text){
        this.text = text;
    }
    public int getRows(){
        return 1;
    }
    public String getRowText(int row){
        if(row == 0){
            return text;
        }else{
            return null;
        }
    }
}
