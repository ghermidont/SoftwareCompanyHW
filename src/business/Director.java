package business;

public class Director {

    public String   fullname;   // полное имя
    public int      experience; // опыт работы (лет)
    public int      age;        // возраст (лет!!!)
    public float    salary;     // текущая заработная плата (в у.е.!!!)
    public Manager  helper;     // Объект тип Manager - это основной помощник менеджера (правая рука)
    // добавить конструктор и методы, указанные выше

    public Director(String   fullname, int experience, int age, float salary){
       this.fullname = fullname;
       this.experience = experience;
       this.age = age;
       this.salary = salary;
    }

    public void incrementSalary() {
        //который каждый раз, когда он применяется,
        // увеличивает заработную плату на 20%.
    }

  @Override
  public String toString(){
   // return
    }


}
