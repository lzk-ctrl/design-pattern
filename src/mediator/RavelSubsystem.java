package mediator;

public class RavelSubsystem extends Subsystem{

    public RavelSubsystem(Mediator mediator) {
        super(mediator);
    }
    public void getInformation(String message){
        System.out.println("RavelSubsystem gets information: " + message);
        mediator.colleagueChanged(this);
    }
    public void getSharedInformation(){
        System.out.println("RavelSubsystem gets shared information. " );
    }
}
