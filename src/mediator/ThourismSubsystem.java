package mediator;

public class ThourismSubsystem extends Subsystem {

        public ThourismSubsystem(Mediator mediator) {
            super(mediator);
        }
        public void getInformation(){
            System.out.println("ThourismSubsystem gets information. " );
            mediator.colleagueChanged(this);
        }
        public void getSharedInformation(){
            System.out.println("ThourismSubsystem gets shared information. " );
        }
}
