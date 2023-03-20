import java.util.Objects;

public class Griffindoor {
    String name;
    String surname;
    String nobility;
    String honor;
    String courage;

    public Griffindoor(String name, String surname, String nobility, String honor, String courage) {
        this.name = name;
        this.surname = surname;
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Гарри Поттер, Гермиона Грейнджер и Рон Уизли");
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setNobility(String nobility) {
        this.nobility = nobility;
    }

    public void setHonor(String honor) {
        this.honor = honor;
    }

    public void setCourage(String courage) {
        this.courage = courage;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getNobility() {
        return this.nobility;
    }

    public String getHonor() {
        return this.honor;
    }

    public String getCourage() {
        return this.courage;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Griffindoor that = (Griffindoor) o;
            return Objects.equals(this.name, that.name) && Objects.equals(this.surname, that.surname) && Objects.equals(this.nobility, that.nobility) && Objects.equals(this.honor, that.honor) && Objects.equals(this.courage, that.courage);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.name, this.surname, this.nobility, this.honor, this.courage});
    }

    public String toString() {
        return "griffindor{name='" + this.name + "', surname='" + this.surname + "', nobility='" + this.nobility + "', honor='" + this.honor + "', courage='" + this.courage + "'}";
    }
}


