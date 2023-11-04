package mediator;

public class Main {
    public static void main(String[] args) {
        TotalSystem mediator = new TotalSystem();
        mediator.createColleagues();
        mediator.hotelSubsystem.getInformation();
    }
}
