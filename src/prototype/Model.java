package prototype;

public class Model implements Product{
    private String modelContent;
    private String photo;
    public Model(String modelContent,String phooto){
        this.modelContent=modelContent;
        this.photo=phooto;
    }
    @Override
    public void display() {
        System.out.println(modelContent);
        System.out.println(photo);
    }
    public void setModelContent(String modelContent){
        this.modelContent=modelContent;
    }
    public void setPhotoContent(String photoContent){
        this.photo=photoContent;
    }
    @Override
    public Product createClone() {
        Product p=null;
        try {
            p=(Product)clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return p;
    }
}
