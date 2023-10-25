package bridge;

public class GIFImpl extends Impl{

    @Override
    public void cutout() {
        System.out.println("GIF cutout");
    }

    @Override
    public void blur() {
        System.out.println("GIF blur");
    }

    @Override
    public void sharpen() {
        System.out.println("GIF sharpen");
    }

    @Override
    public void texture() {
        System.out.println("GIF texture");
    }
}
