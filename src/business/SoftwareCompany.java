package business;
import team.*;
import java.util.Scanner;

public class SoftwareCompany {

    private Scanner getOptions = new Scanner(System.in);
    private final String companyName = "\"Microhard\" ltd";
    private final int yearOfFoundation = 1998;

    private companyAddress companyAddress;
    private companyContacts companyContacts;
    public Director director;
    private Manager manager;
    private Programmer lead_developer;
    private Programmer senior_developer;
    private Programmer junior_developer;
    private Tester tester;

    public SoftwareCompany(){
        this.companyAddress = new companyAddress();
        this.companyContacts = new companyContacts();
        this.director = new Director("Bill Doors", 15, 46, 1500.0f);
        this.manager = new Manager("John Smith", 9, 39, 1200.0f);
        this.lead_developer = new Programmer("Lead_developer","Addy Kim", 10, "Java", 40, 1100.0f);
        this.senior_developer = new Programmer("Senior developer","Tommy Lee", 7, "Python", 30, 1000.0f);
        this.junior_developer = new Programmer("Junior developer","Kirk Jordison", 4, "C#", 27, 950.0f);
        this.tester = new Tester("Ion Avasiloaie", 2, 26, 500.0f);
    }

    private class companyAddress {
        private String country = "Republic of Moldova";
        private String city = "Chisinau";
        private String street = "\nstr. Salcimilor";
        private String strNumber = "13/6";

        @Override
        public String toString() {
            return "COMPANY ADDRESS: " + country + ", " + city + ", " +
                    street + " no. " + strNumber + ".\n";
        }
    }

    private class companyContacts {
        private String telNumber = "0986757433";
        private String ZIPcode = "20596";
        private String email = "microsoftJR@yahoo.com";

        @Override
        public String toString() {
            return "COMPANY CONTACTS: " + "\ntel. numb: " + telNumber + "\nPostal Code: " + ZIPcode + "\nEmail: " +
                    email + "\n";
        }

    }

    private void showMembers() {
        System.out.println("\n" + director.toString()+ manager + lead_developer+
                senior_developer+junior_developer+tester + "\n");
    }

    private void calculateSalaryBudget() {
        float salaryBudget = director.getSalary() + manager.getSalary() + lead_developer.getSalary() +
                senior_developer.getSalary() + junior_developer.getSalary() + tester.getSalary();

        float salary1Year = salaryBudget * 12;
        float salary3Years = salaryBudget * 36;

        System.out.println("\nThe total Salary budget for the current month is: " + salaryBudget + " EUR\n" +
                "The salary budget for 1 year is: " + salary1Year + " EUR\n" + "The salary budget for 3 years is: " +
                salary3Years + " EUR\n");
    }

    private void choiceSwitch() {
        int optionsGetter = getOptions.nextInt();

        switch (optionsGetter) {
            case 1: {
                System.out.println("\n" + companyName + " was founded in " + yearOfFoundation + " by " + director.getFullname() + ".\n" +
                        "It's main area of activity is software development.\n" + companyAddress.toString() + companyContacts);
                break;
            }
            case 2: {
                showMembers();
                break;
            }
            case 3: {
                calculateSalaryBudget();
                break;
            }
            default: {
                System.err.println("Please input a valid option!!");
            }
        }
    }

    public void runTheCompany() {
        System.out.println("Good day to you dear visitor!!\n Welcome to the " + companyName + " headquarters\n" +
                    "In order to find get information about our company,\nplease select one of " +
                    "the options listed bellow: \n\n\t1. General info about the Comapany\n\t" +
                    "2. List of employees\n\t3. Salary budget\n");
        choiceSwitch();

    }

}

