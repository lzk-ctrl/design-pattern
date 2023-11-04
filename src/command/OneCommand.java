package command;

public class OneCommand extends Command{
    private Light light;
    private int state;
    public OneCommand(Light light, int state){
        this.light = light;
        this.state = state;
    }
    public void execute(){
        if (this.state == 1){
            this.light.on();
        } else {
            this.light.off();
        }
    }
}
