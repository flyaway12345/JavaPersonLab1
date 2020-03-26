package person;

public class Person {
    private String name;
    private int age;
    private String favoriteSport;
    private String occupation;
    private double salary;
    public Person(){}
    public Person(String name,int age, String favoriteSport, String occupation, double salary){
        this.name = name;
        this.favoriteSport = favoriteSport;
        this.age = age;
        this.occupation = occupation;
        this.salary = salary;

    }

    public String getName(){
        return name;
    }
    public String getFavoriteSport(){
        return favoriteSport;
    }
    public int getAge(){
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getOccupation() {
        return occupation;
    }

    public  void setAge(int age){
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printMethod(Person x){
        System.out.println("My name is"+getName()+"and I am "+getAge()+" years old."+
                " My Favorite sport is "+ getFavoriteSport()+" and by this time next year "+
                "my occupation will be "+  getOccupation() +" meaning I could be making up "+
                "to "+getSalary()+" yearly!");
    }
    public double yearlyBonus(double b){
       return salary+=b;

    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", favoriteSport='" + favoriteSport + '\'' +
                ", occupation='" + occupation + '\'' +
                ", salary=" + salary +
                '}';
    }
}