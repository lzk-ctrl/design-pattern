package singleton;

public class Generator {

    private static class HolderClass{
        private final static Generator generator=new Generator();
    }
    private Generator(){
        System.out.println("启动一个虚拟用户生成器");
    }
    public static Generator getInstance(){
        return HolderClass.generator;
    }
    public void generateUser(){
        System.out.println("生成一个虚拟用户");
    }
}
