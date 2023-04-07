import java.util.Objects;

public class Slizerin extends HogwartsStudent {
    String name;
    String surname;
    String cunning;
    String ambition;
    String resourcefulness;
    String determination;
    String lustPower;


    public Slizerin(String name, String surname, String cunning, String ambition, String resourcefulness, String determination, String lustPower) {
        super();
        this.name = name;
        this.surname = surname;
        this.cunning = cunning;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.determination = determination;
        this.lustPower = lustPower;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setCunning(String cunning) {
        this.cunning = cunning;
    }

    public void setAmbition(String ambition) {
        this.ambition = ambition;
    }

    public void setResourcefulness(String resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public void setDetermination(String determination) {
        this.determination = determination;
    }

    public void setLustPower(String lustPower) {
        this.lustPower = lustPower;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getCunning() {
        return this.cunning;
    }

    public String getAmbition() {
        return this.ambition;
    }

    public String getResourcefulness() {
        return this.resourcefulness;
    }

    public String getDetermination() {
        return this.determination;
    }

    public String getLustPower() {
        return this.lustPower;
    }

    public String toString() {
        return "Slizerin{name='" + this.name + "', surname='" + this.surname + "', cunning='" + this.cunning + "', ambition='" + this.ambition + "', resourcefulness='" + this.resourcefulness + "', determination='" + this.determination + "', lustPower='" + this.lustPower + "'}";
    }

}


