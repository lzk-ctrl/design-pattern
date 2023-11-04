package command;

public class Light {
    private String name;
    private int state;
    public Light(String name){
        this.name = name;
        this.state = 0;
    }
    public void on(){
        this.state = 1;
        System.out.println(this.name + " is on");
    }
    public void off(){
        this.state = 0;
        System.out.println(this.name + " is off");
    }
}
