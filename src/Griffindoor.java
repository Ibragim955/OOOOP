import java.util.Objects;

class Griffindoor extends HogwartsStudent {

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




    public String toString() {
        return "griffindor{name='" + this.name + "', surname='" + this.surname + "', nobility='" + this.nobility + "', honor='" + this.honor + "', courage='" + this.courage + "'}";
    }
}


