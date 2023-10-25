package easyFactory;

public class Circle implements shape{
    @Override
    public void draw() {
        System.out.println("Circle draw");
    }

    @Override
    public void erase() {
        System.out.println("Circle erase");
    }

}
