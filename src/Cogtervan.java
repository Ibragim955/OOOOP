import java.util.Objects;

public class Cogtervan extends HogwartsStudent{

    private  String smart;
    private  String wise;
    private  String witty;
    private  String full;
    private  String creativity;
    private String fullCreativity;


    public static void cogtervan() {
    }

    public Cogtervan( String smart, String wise, String witty, String fullCreativity) {

        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullCreativity = fullCreativity;
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
        return "cogtevran{smart='" + this.smart + "', wise='" + this.wise + "', witty='" + this.witty + "', full='" + this.full + "', creativity='" + this.creativity + "', fullCreativity='" + this.fullCreativity + "'}";
    }
}




