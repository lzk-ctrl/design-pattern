package bridge;

public class RefineApp extends App{
    public RefineApp(Impl impl) {
        super(impl);
    }
    public void use(){
        useCutout();
        useBlur();
        useSharpen();
        useTexture();
    }
}
