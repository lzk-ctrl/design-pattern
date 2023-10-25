package bridge;

public class App {
    protected Impl impl;
    public App(Impl impl) {
        this.impl = impl;
    }
    public void useCutout() {
        impl.cutout();
    }
    public void useBlur() {
        impl.blur();
    }
    public void useSharpen() {
        impl.sharpen();
    }
    public void useTexture() {
        impl.texture();
    }

}
