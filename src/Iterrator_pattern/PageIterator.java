package Iterrator_pattern;

public class PageIterator implements Iterator{
    private Page page;
    private int index;
    private int count;//count是指每页的内容个数
    private int num;//表示页数
    public PageIterator(Page page) {
        this.page = page;
        this.index = 0;
    }

    public void setPage(int num,int count) {  //使迭代器读取某页
        this.num = num;
        this.count = count;
        this.index = 0;
    }
    @Override
    public boolean hasNext() {
        if(index+count*(num-1)<num*count&&index+count*(num-1)<page.getLength()) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String next() {
        String str = page.getTextAt(index+count*(num-1));
        index++;
        return str;
    }

}
