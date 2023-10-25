package easyFactory;

public class Factory {
    public static shape getShape(String type) throws Exception{
        if (type.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (type.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (type.equalsIgnoreCase("triangle")) {
            return new Triangle();
        } else {
            throw new UnsupportedShapeException("Unsupported shape exception");
        }
    }
}
