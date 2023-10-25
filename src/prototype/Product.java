package prototype;

public interface Product extends Cloneable{
    public abstract void display();
    //浅复制
    public abstract Product createClone();


}
