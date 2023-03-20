import java.util.Objects;

public class Cogtervan {
    String name;
    String surname;
    String smart;
    String wise;
    String witty;
    String full;
    String creativity;
    private String fullCreativity;

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

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Cogtervan cogtevran = (Cogtervan) o;
            return Objects.equals(this.name, cogtevran.name) && Objects.equals(this.surname, cogtevran.surname) && Objects.equals(this.smart, cogtevran.smart) && Objects.equals(this.wise, cogtevran.wise) && Objects.equals(this.witty, cogtevran.witty) && Objects.equals(this.full, cogtevran.full) && Objects.equals(this.creativity, cogtevran.creativity) && Objects.equals(this.fullCreativity, cogtevran.fullCreativity);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.name, this.surname, this.smart, this.wise, this.witty, this.full, this.creativity, this.fullCreativity});
    }
}


