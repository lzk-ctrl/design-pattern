package easyFactory;

public class Rectangle implements shape{
    @Override
    public void draw() {
        System.out.println("Rectangle draw");
    }

    @Override
    public void erase() {
        System.out.println("Rectangle erase");
    }
}
