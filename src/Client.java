import java.util.ArrayList;

public class Client {
    private String dni;
    private String name;
    private String surname;
    private String secondSurname;
    private String fullName;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    private String direction;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSecondSurname() {
        return secondSurname;
    }

    public void setSecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
    }


    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getdNi() {
        return dni;
    }

    public void setdNi(String dNi) {
        this.dni = dNi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String FullName = name+surname+secondSurname;

    public String toString(){
        return "Client{ "+
                "dni = '"+ dni +"',"+
                "name = '"+name + "',"+
                "surname = '"+surname+"',"+
                "secondSurname='"+secondSurname+"',"+
                "direction ='"+direction+"',}";


    }
}
