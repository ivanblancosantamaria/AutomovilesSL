public class Vehicle {
    private String vehicleRegistration;
    private String brand;
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    private String colour;
    private String fuel;
    private String engine;
    private String cv;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    public String getVehicleRegistration() {
        return vehicleRegistration;
    }

    public void setVehicleRegistration(String vehicleRegistration) {
        this.vehicleRegistration = vehicleRegistration;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String toString() {
        return "Vehicles{" +
                "vehicleRegistration='" + vehicleRegistration + "'," +
                "brand='" + brand + "'," +
                "model='" + model + "'," +
                "colour='" + colour + "'," +
                "fuel='" + colour + "'," +
                "engine='" + engine + "'," +
                "cv='" + cv + "',}";
    }
}
