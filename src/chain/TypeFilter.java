package chain;

public class TypeFilter extends Filter{
    @Override
    public boolean resolve(Content content) {
        if(content.getType().equals("type")) {
            return true;
        }
        return false;
    }
}
