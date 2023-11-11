import java.util.Date;

public class Sales {
    private String codeVehicle;
    private Date saleDate;
    private String costumer;
    private String payForm;
    private Double price;

    public String getCodeVehicle() {
        return codeVehicle;
    }

    public void setCodeVehicle(String codeVehicle) {
        this.codeVehicle = codeVehicle;
    }

    public Date getSaleDAte() {
        return saleDate;
    }

    public void setSaleDAte(Date saleDAte) {
        this.saleDate = saleDAte;
    }

    public String getCostumer() {
        return costumer;
    }

    public void setCostumer(String costumer) {
        this.costumer = costumer;
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

    public String getVehicle() {
        return codeVehicle;
    }

    public void setVehicle(String vehicle) {
        this.codeVehicle = vehicle;
    }

    public String toString(){
        return "Sales {"+
                "'codeVehicle='"+ saleDate + "',"+
                "'saleDate='"+ saleDate + "',"+
                "'costumer='"+ costumer + "',"+
                "'price='"+ price + "',}";


    }
}
