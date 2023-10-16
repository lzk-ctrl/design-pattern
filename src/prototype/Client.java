package prototype;

public class Client {
    public static void main(String[] args) {
        Manager manager =new Manager();
        Model model=new Model("模板一","照片1");
        manager.register("model",model);
        Product p1=manager.create("model");
        //修改p1的内容
        model.setModelContent("模板二");
        p1.display();
        model.display();
    }
}
