package team;

public class Tester {

    public String       fullname;   // полное имя
    public int          experience; // опыт работы (лет)
    public int          age;        // возраст (лет!!!)
    public float        salary;     // текущая заработная плата (в у.е.!!!)
    public String       technology; // название языка программирования, которым владеет (например Java, Python,...)
    // добавить конструктор и методы, указанные выше

    public Tester(String   fullname, int experience, int age, float salary){
        this.fullname = fullname;
        this.experience = experience;
        this.age = age;
        this.salary = salary;

    }

    public void incrementSalary() {
        //оторый каждый раз, когда он применяется,
        // увеличивает заработную плату на 3% + 0.5%
        // за каждый год опыта работы в данной области.
    }

    @Override
    public String toString(){
        // return
    }

}
