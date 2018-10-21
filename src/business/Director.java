package business;

public class Director {

    private String   fullname;
    private int      experience;
    private int      age;
    private float    salary;

    public Director(String fullname, int experience, int age, float salary){
       this.fullname = fullname;
       this.experience = experience;
       this.age = age;
       this.salary = salary;
    }

    private void incrementSalary() {
        float extraForExperience = (salary * 0.01f) * experience;
        salary = salary + ((salary * 0.20f) + extraForExperience);
    }
    public String getFullname(){ return fullname; }

    public float getSalary(){
        incrementSalary();
        return this.salary;
    }

  @Override
  public String toString(){
  return "Position: Director\n" + "Full name: " + fullname + "\n" +
          "Work experience: " + experience + " years\n" + "Age: "+
          age + " years\nMonthly salary: " + salary + " EUR\n\n";
  }
}
