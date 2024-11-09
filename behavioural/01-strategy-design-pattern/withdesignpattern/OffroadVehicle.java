import Strategy.SpecialDriveStrategy;

public class OffroadVehicle extends Vehicle {

    public OffroadVehicle() {
        super(new SpecialDriveStrategy());
    }
}
