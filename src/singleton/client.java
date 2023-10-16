package singleton;

public class client {
    public static void main(String[] args) {
        Generator generator1 = Generator.getInstance();
        Generator generator2 = Generator.getInstance();

        if(generator1 == generator2){
            System.out.println("generator1和generator2是同一个实例");
        }
        else{
            System.out.println("generator1和generator2不是同一个实例");
        }
    }
}
