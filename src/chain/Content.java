package chain;

public class Content {
    private String content;
    private String type;

    public Content(String content,String type) {
        this.content = content;
        this.type = type;
    }

    public String getContent() {
        return content;
    }
    public String getType() {
        return type;
    }
}
