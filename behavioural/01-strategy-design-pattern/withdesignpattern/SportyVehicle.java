import Strategy.SpecialDriveStrategy;

public class SportyVehicle extends Vehicle{
   
    public SportyVehicle() {
        super(new SpecialDriveStrategy());
    }
   
}
