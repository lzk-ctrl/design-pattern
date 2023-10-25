package prototype;

public class Client {
    public static void main(String[] args) {
        Product product = new Model("模板内容", "图片");
        Product product1 = product.createClone();

        // 修改product1的Photo对象
        ((Model) product1).setPhotoContent("新图片");

        // 显示两个对象的内容
        product.display();
        product1.display();
    }
}
