// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Vehicle vehiculo1 = new Vehicle();
        vehiculo1.setVehicleRegistration("CV00000001");
        vehiculo1.setModel("kadjar");
        vehiculo1.setBrand("Renault");

        System.out.println(vehiculo1.getModel());
        System.out.println(vehiculo1.toString());

    }
}