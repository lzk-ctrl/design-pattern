package proxy;

public class Main {
    public static void main(String[] args){
        Memory memory=new ProxyMemory();
        memory.addData(1,"data1");
        memory.addData(2,"data2");
        memory.addData(3,"data3");
        System.out.println(memory.getData(1));
        System.out.println(memory.getData(2));
        System.out.println(memory.getData(3));
    }
}
