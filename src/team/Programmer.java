package team;

public class Programmer {

        private String fullname;
        private int experience;
        private int age;
        private float salary;
        private String technology;
        private String position;

        public Programmer(String position, String   fullname, int experience, String technology, int age, float salary){
            this.position = position;
            this.fullname = fullname;
            this.experience = experience;
            this.technology = technology;
            this.age = age;
            this.salary = salary;
        }

        private void incrementSalary() {
            float extraForExperience = (salary * 0.01f) * experience;
            salary = salary * ((salary * 0.05f) + extraForExperience);
        }

        public float getSalary(){
            incrementSalary();
            return this.salary;
        }

    @Override
    public String toString(){
        return "Position: " + position + "\n" + "Full name: " + fullname + "\n" +
                "Technology: " + technology + "\nWork experience: " + experience + " years\n" + "Age: "+
                age + " years\nMonthly salary: " + salary + " EUR\n\n";
    }

}


