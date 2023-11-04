package mediator;

public class RestaurantSubsystem extends Subsystem{

        public RestaurantSubsystem(Mediator mediator) {
            super(mediator);
        }
        public void getInformation(){
            System.out.println("RestaurantSubsystem gets information. " );
            mediator.colleagueChanged(this);
        }
        public void getSharedInformation(){
            System.out.println("RestaurantSubsystem gets shared information. " );
        }

}
