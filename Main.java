package person;

public class Main {
    public static void main(String[] args) {
    Person evan = new Person("Evan",21, "None", "Software Engineer", 100000);
    Person anth = new Person("Anthony",21, "Soccer", "IT Helpdesk Specialist", 60000);
    Person tzar = new Person("Tzar",21, "Basketball", "Psychologest", 80000);

        evan.printMethod(evan);
        anth.printMethod(anth);
        tzar.printMethod(tzar);
        anth.setSalary(75000);
        anth.printMethod(anth);
        tzar.yearlyBonus(10000);
        tzar.printMethod(tzar);
    }
}
