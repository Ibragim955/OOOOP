import java.util.Objects;

public class Puffenduy extends HogwartsStudent {

    private  String hardworking;
    private  String loyal;
    private String honest;


    public static void pufenduy() {
    }

    public Puffenduy( String hardworking, String loyal, String honest) {

        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
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


    public String getHardworking() {
        return this.hardworking;
    }

    public String getLoyal() {
        return this.loyal;
    }

    public String getHonest() {
        return this.honest;
    }



    public String toString() {
        return "pufenduy{hardworking='" + this.hardworking + "', loyal='" + this.loyal + "', honest='" + this.honest + "'}";
    }
}


