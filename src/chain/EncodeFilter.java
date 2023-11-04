package chain;

public class EncodeFilter extends Filter {
    @Override
    public boolean resolve(Content content) {
        if(content.getType().equals("encode")) {
            return true;
        }
        return false;
    }
}
