public class VehicleTest {
    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.print();

        Vehicle truck = new Vehicle("Mercedes", 15);
        truck.print();

        Vehicle bus = new Vehicle();
        bus.setMerk("Hino");
        bus.setMilesPerGallon(100);
    }
}
