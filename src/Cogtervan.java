import java.util.Objects;

public class Cogtervan extends HogwartsStudent{
    String name;
    String surname;
    String smart;
    String wise;
    String witty;
    String full;
    String creativity;
    private String fullCreativity;
    private int magic;
    private int transgression;

    public static void cogtervan() {
    }

    public Cogtervan(String name, String surname, String smart, String wise, String witty, String fullCreativity) {
        this.name = name;
        this.surname = surname;
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullCreativity = fullCreativity;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println(" Чжоу Чанг, Падма Патил и Маркус Белби");
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSmart(String smart) {
        this.smart = smart;
    }

    public void setWise(String wise) {
        this.wise = wise;
    }

    public void setWitty(String witty) {
        this.witty = witty;
    }

    public void setFullCreativity(String fullCreativity) {
        this.fullCreativity = fullCreativity;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getSmart() {
        return this.smart;
    }

    public String getWise() {
        return this.wise;
    }

    public String getWitty() {
        return this.witty;
    }

    public String getFullCreativity() {
        return this.fullCreativity;
    }

    public String toString() {
        return "cogtevran{name='" + this.name + "', surname='" + this.surname + "', smart='" + this.smart + "', wise='" + this.wise + "', witty='" + this.witty + "', full='" + this.full + "', creativity='" + this.creativity + "', fullCreativity='" + this.fullCreativity + "'}";
    }
}




