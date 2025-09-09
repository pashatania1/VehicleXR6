public class Vehicle {
    //property class
    String merk;
    int milesPerGallon;
    
    //Constructor Default
    public Vehicle() {
        merk = "Toyota";
        milesPerGallon = 20;
    }

    //Constructor Parameter
    public Vehicle(String merk, int milesPerGallon) {
        this.merk = merk;
        this.milesPerGallon = milesPerGallon;
    }
    //getter
    //setter
    //method
    public void print() {
        System.out.println("Merk: " + merk);
        System.out.println("Miles Per Gallon: " + milesPerGallon);
    }
}
