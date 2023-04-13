public class Main {

    public static void main(String[] args) {

        Slizerin[] student = {
                new Slizerin("33 ", "23 ", "45", "77", "22"),
                new Slizerin("21", "34", "10", "32", "23"),
                new Slizerin( "76", "54", "65", "77", "76"),
        };
        System.out.println("Студенты Слизерин " + student.length);
        for (int i = 0; i < student.length; i++) {
            Slizerin slizerin = student[i];
            System.out.println("Имя - " + slizerin.getName() + ", Фамилия - " + slizerin.getSurname() + ", Хитрость - " + slizerin.getCunning() + ", Решительность " + slizerin.getAmbition() + ", Амбициозность " + slizerin.getResourcefulness() + ", Находчивость " + slizerin.getDetermination() + ", Жажда власти " + slizerin.getLustPower());
        }


        Cogtervan[] students = {
                new Cogtervan( "55", "61", "45", "23"),
                new Cogtervan( "21", "34", "54", "65"),
                new Cogtervan( "87", "67", "64", "44"),
        };
        System.out.println(" Студенты Когтервана  " + students.length);
        for (int i = 0; i < students.length; i++) {
            Cogtervan cogtevran = students[i];
            System.out.println("Имя - " + cogtevran.getName() + ", Фамилия - " + cogtevran.getSurname() + ", Умны - " + cogtevran.getSmart() + ",Мудры - " + cogtevran.getWise() + ",Остроумны - " + cogtevran.getWitty() + ", Полны творчества- " + cogtevran.getFullCreativity());
        }


        Puffenduy[] pufenduys = {
                new Puffenduy( "23", "44", "56"),
                new Puffenduy("24", "44", "65"),
                new Puffenduy("67", "88", "100"),
        };
        System.out.println("Студенты Пуфендуя" + pufenduys.length);
        for (int i = 0; i < pufenduys.length; i++) {
            Puffenduy pufenduy = pufenduys[i];
            System.out.println("Имя -" + pufenduy.getName() + ",Фамилия -" + pufenduy.getSurname() + ",Трудолюбивы - " + pufenduy.getHardworking() + ",Верны - " + pufenduy.getLoyal() + ",Честны - " + pufenduy.getHonest());
        }

        Griffindoor[] griffindors = {
                new Griffindoor("Гарри", "Поттер", "21", "24", "54"),
                new Griffindoor("Гермиона", "Грейнджер", "32", "44", "76"),
                new Griffindoor("Рон", "Уизли", "45", "66", "77"),
        };
        System.out.println("Студенты Гриффиндора " + griffindors.length);
        for (int i = 0; i < griffindors.length; i++) {
            Griffindoor griffindor = griffindors[i];
            System.out.println("Имя -" + griffindor.getName() + ",Фамилия - " + griffindor.getSurname() + ",Благородсва - " + griffindor.getNobility() + ",честь - " + griffindor.getHonor() + ",Храбрость - " + griffindor.getCourage());
//РРР

        }
    }
}