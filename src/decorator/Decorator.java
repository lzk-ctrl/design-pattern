package decorator;

public abstract class Decorator extends Display{
    protected Display display;
    protected Decorator(Display display) {
        this.display = display;
    }

}
