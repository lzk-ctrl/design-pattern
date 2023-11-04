package mediator;

public class TotalSystem extends Mediator{

    public RavelSubsystem ravelSubsystem;
    public RestaurantSubsystem restaurantSubsystem;
    public ThourismSubsystem thourismSubsystem;
    public HotelSubsystem hotelSubsystem;
    public void createColleagues() {
        ravelSubsystem = new RavelSubsystem(this);
        restaurantSubsystem = new RestaurantSubsystem(this);
        thourismSubsystem = new ThourismSubsystem(this);
        hotelSubsystem = new HotelSubsystem(this);
    }

    @Override
    public void colleagueChanged(Subsystem subsystem){
        if(subsystem instanceof RavelSubsystem){
            System.out.println("RavelSubsystem changed. ");
            restaurantSubsystem.getSharedInformation();
            thourismSubsystem.getSharedInformation();
            hotelSubsystem.getSharedInformation();
        }else if(subsystem instanceof RestaurantSubsystem){
            System.out.println("RestaurantSubsystem changed. ");
            ravelSubsystem.getSharedInformation();
            thourismSubsystem.getSharedInformation();
            hotelSubsystem.getSharedInformation();
        }else if(subsystem instanceof ThourismSubsystem){
            System.out.println("ThourismSubsystem changed. ");
            ravelSubsystem.getSharedInformation();
            restaurantSubsystem.getSharedInformation();
            hotelSubsystem.getSharedInformation();
        }else if(subsystem instanceof HotelSubsystem){
            System.out.println("HotelSubsystem changed. ");
            ravelSubsystem.getSharedInformation();
            restaurantSubsystem.getSharedInformation();
            thourismSubsystem.getSharedInformation();
        }

    }
}
