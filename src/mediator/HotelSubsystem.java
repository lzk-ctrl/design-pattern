package mediator;

public class HotelSubsystem extends Subsystem{

    public HotelSubsystem(Mediator mediator) {
        super(mediator);
    }
    public void getInformation(){
        System.out.println("HotelSubsystem gets information. " );
        mediator.colleagueChanged(this);
    }
    public void getSharedInformation(){
        System.out.println("HotelSubsystem gets shared information. " );
    }

}
