public class VehicleTest {
    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.print();

        Vehicle truck = new Vehicle("Mercedes", 15);
        truck.print();

        Vehicle bus = new Vehicle();
        bus.setMerk("Hino");
        bus.setMilesPerGallon(100);
        bus.print();
        bus.compare();

        System.out.println(compare1(15, 20));
    }

    public static int compare1(int a, int b) {
        if(a > b) {
            return 1;
        } else if(b > a){
            return 2;
        } else {
            return 0;
        }
    }
}