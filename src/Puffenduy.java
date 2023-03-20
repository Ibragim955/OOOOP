import java.util.Objects;

public class Puffenduy {
    String name;
    String surname;
    String hardworking;
    String loyal;
    String honest;

    public static void pufenduy() {
    }

    public Puffenduy(String name, String surname, String hardworking, String loyal, String honest) {
        this.name = name;
        this.surname = surname;
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setHardworking(String hardworking) {
        this.hardworking = hardworking;
    }

    public void setLoyal(String loyal) {
        this.loyal = loyal;
    }

    public void setHonest(String honest) {
        this.honest = honest;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getHardworking() {
        return this.hardworking;
    }

    public String getLoyal() {
        return this.loyal;
    }

    public String getHonest() {
        return this.honest;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Puffenduy pufenduy = (Puffenduy) o;
            return Objects.equals(this.name, pufenduy.name) && Objects.equals(this.surname, pufenduy.surname) && Objects.equals(this.hardworking, pufenduy.hardworking) && Objects.equals(this.loyal, pufenduy.loyal) && Objects.equals(this.honest, pufenduy.honest);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.name, this.surname, this.hardworking, this.loyal, this.honest});
    }

    public String toString() {
        return "pufenduy{name='" + this.name + "', surname='" + this.surname + "', hardworking='" + this.hardworking + "', loyal='" + this.loyal + "', honest='" + this.honest + "'}";
    }
}


