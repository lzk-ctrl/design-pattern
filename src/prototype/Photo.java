package prototype;

public class Photo implements Cloneable {
    private String photoContent;

    public Photo(String photoContent){
        System.out.println("图片创建中");
        this.photoContent=photoContent;
    }
    public void setPhotoContent(String photoContent){
        this.photoContent=photoContent;
    }
    public String getPhotoContent(){
        return photoContent;
    }
    public Photo clone(){
        Photo photo=null;
        try {//深复制
            photo=(Photo)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return photo;
    }
}
