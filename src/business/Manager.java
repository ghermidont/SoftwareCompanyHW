package business;

public class Manager {

    public String       fullname;   // полное имя
    public int          experience; // опыт работы (лет)
    public int          age;        // возраст (лет!!!)
    public float        salary;     // текущая заработная плата (в у.е.!!!)
    public Programmer   lead_developer;  // Объект тип Programmer - элитный разработчик в команде
    public Programmer   senior_developer;// Объект тип Programmer - ведущий (senior) разработчик в команде
    public Programmer   junior_developer;// Объект тип Programmer - младший (junior) разработчик в команде
    public Tester       quality_guy;     // Объект тип Tester - тестировщик в команде
    // добавить конструктор и методы, указанные выше

    public Manager(String   fullname, int experience, int age, float salary){
        this.fullname = fullname;
        this.experience = experience;
        this.age = age;
        this.salary = salary;

    }

    public void incrementSalary() {
        //который каждый раз, когда он применяется,
        // увеличивает заработную плату на 15%.
    }

    @Override
    public String toString(){
        // return
    }
}
