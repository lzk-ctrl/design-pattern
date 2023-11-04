package chain;

public class DataFilter extends Filter{
    @Override
    public boolean resolve(Content content) {
        if(content.getType().equals("data")) {
            return true;
        }
        return false;
    }
}
