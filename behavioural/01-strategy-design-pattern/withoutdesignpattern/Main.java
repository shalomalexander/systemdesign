class Main {
    public static void main(String[] args) {
        Vehicle sportyVehicle = new SportyVehicle();
        Vehicle passengorVehicle = new PassengerVehicle();
        Vehicle offroadVehicle = new OffroadVehicle();

        sportyVehicle.drive(); // drive implementation is same as sportyVehicle
        passengorVehicle.drive();
        offroadVehicle.drive(); // drive implementation is same as sportyVehicle

        // When the implementation of the method is same in the child classes then its bettern to 
        // use strategy design pattern and have just one implmentation of Special Drive and Normal Drive.
    }
}