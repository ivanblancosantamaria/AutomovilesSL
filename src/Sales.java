import java.util.Date;

public class Sales {
    private String vehicleRegistration;
    private Date saleDate;
    private String costumerDni;

    public String getVehicleRegistration() {
        return vehicleRegistration;
    }

    public void setVehicleRegistration(String vehicleRegistration) {
        this.vehicleRegistration = vehicleRegistration;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    private String payForm;
    private Double price;

    public String getvehicleRegistration() {
        return vehicleRegistration;
    }

    public void setvehicleRegistration(String vehicleRegistration) {
        this.vehicleRegistration = vehicleRegistration;
    }

    public Date getSaleDAte() {
        return saleDate;
    }

    public void setSaleDAte(Date saleDAte) {
        this.saleDate = saleDAte;
    }

    public String getCostumerDni() {
        return costumerDni;
    }

    public void setCostumerDni(String costumerDni) {
        this.costumerDni = costumerDni;
    }

    public String getPayForm() {
        return payForm;
    }

    public void setPayForm(String payForm) {
        this.payForm = payForm;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String toString(){
        return "Sales {"+
                "'codeVehicle='"+ vehicleRegistration + "',"+
                "'saleDate='"+ saleDate + "',"+
                "'costumer='"+ costumerDni + "',"+
                "'price='"+ price + "'}";


    }
}
