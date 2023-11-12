import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        ArrayList<Client> alsClients = new ArrayList<>();
        ArrayList<Vehicle> alsVehicles = new ArrayList<>();
        ArrayList<Sales> alsSales = new ArrayList<>();

        Vehicle vehicle1 = new Vehicle();
        vehicle1.setVehicleRegistration("CV00000001");
        vehicle1.setModel("kadjar");
        vehicle1.setBrand("Renault");
        vehicle1.setCv("100");
        vehicle1.setColour("white");
        vehicle1.setEngine("1.5 TDI");
        vehicle1.setFuel("diesel");
        alsVehicles.add(vehicle1);

        Vehicle vehicle2 = new Vehicle();
        vehicle2.setVehicleRegistration("CV00000002");
        vehicle2.setModel("panda");
        vehicle2.setBrand("fiat");
        vehicle2.setCv("60");
        vehicle2.setColour("Limon");
        vehicle2.setEngine("1.2");
        vehicle2.setFuel("Gasoline");
        alsVehicles.add(vehicle2);

        //Hacemos pruebas para mostrar en consola el modelo de vehiculo1 y tambien todos los datos del vehicul1
        System.out.println(vehicle1.getModel());


        Client client1 = new Client();
        client1.setDni("70654215H");
        client1.setName("Arturo");
        client1.setSurname("Garcia");
        client1.setSecondSurname("Fernandez");
        client1.setDirection("CAlle los palomares, 4");
        alsClients.add(client1);

        Sales sale1 = new Sales();
        sale1.setvehicleRegistration(vehicle1.getVehicleRegistration()); //con esta linea asignamos el codigo del vehiculo1 a la venta1
        sale1.setSaleDate(new Date(123, Calendar.JANUARY,8));
        sale1.setCostumerDni(client1.getDni());
        sale1.setPrice(22400.00);
        sale1.setPayForm("transference");
        alsSales.add(sale1);



        Scanner scLeer = new Scanner(System.in);
        int intMenu;
        do {
            System.out.println("Menu");
            System.out.println("--------------------------------------");

            System.out.println("1 Listar clientes");
            System.out.println("2 Listar vehiculos");
            System.out.println("3 Listar ventas");
            System.out.println("0 salir");
            intMenu = scLeer.nextInt();

            switch (intMenu){

                case 1:
                    System.out.println("listando clientes");
                    System.out.println("--------------------------------------");
                    for (Client dato:alsClients){
                        System.out.println(dato.toString());
                    }
                    break;
                case 2:
                    System.out.println("listando vehculos");
                    System.out.println("--------------------------------------");
                    for (Vehicle dato:alsVehicles){
                        System.out.println(dato.toString());
                    }
                    break;
                case 3:
                    System.out.println("listando ventas");
                    System.out.println("--------------------------------------");
                    for (Sales dato:alsSales){
                        System.out.println(dato.toString());
                    }
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        }while (intMenu!=0);

        System.out.println(vehicle1.toString());
        System.out.println(client1.toString());
        System.out.println(sale1.toString());



    }
}