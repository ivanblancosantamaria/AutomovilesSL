// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle();
        vehicle1.setVehicleRegistration("CV00000001");
        vehicle1.setModel("kadjar");
        vehicle1.setBrand("Renault");


        //Hacemos pruebas para mostrar en consola el modelo de vehiculo1 y tambien todos los datos del vehicul1
        System.out.println(vehicle1.getModel());
        System.out.println(vehicle1.toString());

        Client client1 = new Client();
        client1.setDni("70654215H");
        client1.setName("Arturo");
        client1.setSurname("Garcia");
        client1.setSecondSurname("Fernandez");
        client1.setDirection("CAlle los palomares 4");

        Sales sale1 = new Sales();
        sale1.setCodeVehicle(vehicle1.getVehicleRegistration()); //con esta linea asignamos el codigo del vehiculo1 a la venta1
        sale1.setSaleDAte(6/10/12);
        sale1.setCostumer(client1.getFullName());
        sale1.setPrice(22400.00);
        sale1.setPayForm("transference");
        sale1.setVehicle(vehicle1.getModel());



    }
}