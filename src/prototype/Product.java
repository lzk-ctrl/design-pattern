package prototype;

public interface Product extends Cloneable{
    public abstract void display();
    public abstract Product createClone();
    public abstract void setModelContent(String modelContent);

}
