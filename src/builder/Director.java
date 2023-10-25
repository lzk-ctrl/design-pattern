package builder;

public class Director  {
    private Builder builder;
    public Director(Builder builder){
        this.builder = builder;
    }
    public void construct(){
        builder.buildBody();
        builder.buildEngine();
        builder.buildTires();
        builder.buildGearbox();
    }
}
