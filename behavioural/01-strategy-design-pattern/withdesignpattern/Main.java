class Main {
    public static void main(String[] args) {
        Vehicle sportyVehicle = new SportyVehicle();
        Vehicle passengorVehicle = new PassengerVehicle();
        Vehicle offroadVehicle = new OffroadVehicle();

        sportyVehicle.drive();
        passengorVehicle.drive();
        offroadVehicle.drive();

        // After implmentation of the strategy design pattern the duplicacy of the code is reduced.
    }
}