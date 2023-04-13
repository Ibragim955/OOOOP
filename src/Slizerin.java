import java.util.Objects;

 public class Slizerin extends HogwartsStudent {

    private String cunning;
    private String ambition;
    private String resourcefulness;
    private String determination;
    private String lustPower;


    public Slizerin(String cunning, String ambition, String resourcefulness, String determination, String lustPower) {
        super();

        this.cunning = cunning;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.determination = determination;
        this.lustPower = lustPower;
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
        return "Slizerin{ cunning='" + this.cunning + "', ambition='" + this.ambition + "', resourcefulness='" + this.resourcefulness + "', determination='" + this.determination + "', lustPower='" + this.lustPower + "'}";
    }

}


