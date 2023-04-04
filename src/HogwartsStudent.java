import java.util.Objects;

public class HogwartsStudent {

        String name;
        String surname;
        private int ability(){
 return magic + transgression;
    }

    public HogwartsStudent() {
        this.name = name;
        this.surname = surname;
        this.magic = magic;
        this.transgression = transgression;
        this.ability = ability;
    }

    private int magic;
        private int transgression;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getMagic() {
        return magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public void setAbility(int ability) {
        this.ability = ability;
    }

    private int ability;

    @Override
    public String toString() {
        return "HogwartsStudent{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", magic=" + magic +
                ", transgression=" + transgression +
                ", ability=" + ability +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HogwartsStudent that = (HogwartsStudent) o;
        return magic == that.magic && transgression == that.transgression && ability == that.ability && Objects.equals(name, that.name) && Objects.equals(surname, that.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, magic, transgression, ability);
    }

    public void compareHogwarts(HogwartsStudent hogwartsStudent) {
        int ability1 = ability;
            int ability2 = hogwartsStudent.ability();
            if(ability1 > ability2){
                System.out.printf("Студент %s лучше,чем студент %s: %d VS %d%n",
                getName(),
                        hogwartsStudent.getName(),
                        ability1,
                        ability2);
            } else if (ability2 > ability1){
                System.out.printf("Студент %s лучше,чем студент %s: %d VS %d%n",
                        getName(),
                        hogwartsStudent.getName(),
                        ability1,
                        ability2);
            }else {
                System.out.printf("Студент %s лучше,чем студент %s: %d VS %d%n",
                        getName(),
                        hogwartsStudent.getName(),
                        ability1,
                        ability2);
            }
        }
    }

