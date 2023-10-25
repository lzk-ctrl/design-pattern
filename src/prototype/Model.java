package prototype;

public class Model implements Product,Cloneable {
    private String modelContent;
    private Photo photo;

    public Model(String modelContent,String phooto){
        photo = new Photo(phooto);
        System.out.println("模板创建中");
        this.modelContent=modelContent;
    }
    @Override
    public void display() {
        System.out.println(modelContent);
        System.out.println(photo.getPhotoContent());
    }
    public void setModelContent(String modelContent){
        this.modelContent=modelContent;
    }
    public void setPhotoContent(String photoContent){
        photo.setPhotoContent(photoContent);
    }
    public Model clone(){
        Model model=null;
        try {//深复制
            model=(Model)super.clone();
            model.photo=(Photo)photo.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return model;
    }
    @Override
    public Product createClone() {
        Product product=null;
        product=(Product)clone();
        return product;
    }


}
