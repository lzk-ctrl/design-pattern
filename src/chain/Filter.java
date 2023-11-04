package chain;

public abstract class Filter {

    private Filter next;

    public abstract boolean resolve(Content content);
    public void doFilter(Content content) {
        if(resolve(content)) {
            done(content);
            System.out.println("拦截器" + content.getType() + "拦截" + content.getContent());
        }else if(next != null) {
            next.doFilter(content);
        }else {
            fail(content);
        }
    }

    public boolean done(Content content) {
        return true;
    }
    public boolean fail(Content content) {
        return false;
    }


    public void setNext(Filter next) {
        this.next = next;
    }
}
