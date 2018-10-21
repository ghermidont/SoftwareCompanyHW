package team;

public class Tester {

    private String fullname;
    private int experience;
    private int age;
    private float salary;

    public Tester(String   fullname, int experience, int age, float salary){
        this.fullname = fullname;
        this.experience = experience;
        this.age = age;
        this.salary = salary;

    }

    private void incrementSalary() {
        float extraForExperience = (salary * 0.005f) * experience;
        salary = salary * ((salary * 0.03f) + extraForExperience);

    }

    public float getSalary(){
        incrementSalary();
        return this.salary;
    }

    @Override
    public String toString(){
        return "Position: Tester\n" + "Full name: " + fullname + "\n" +
                "Work experience: " + experience + " years\n" + "Age: "+
                age + " years\nMonthly salary: " + salary + " EUR\n\n";
    }

}
