package chain;

public class Main {
    public static void main(String[] args) {
        Content content = new Content("Hello World","data");
        Filter encodeFilter = new EncodeFilter();
        Filter typeFilter = new TypeFilter();
        Filter dataFilter = new DataFilter();
        encodeFilter.setNext(typeFilter);
        typeFilter.setNext(dataFilter);
        dataFilter.setNext(null);
        encodeFilter.doFilter(content);
    }
}
