package GreenFoxOrganization;

public class Student extends Person {

    protected String previousOrganization;
    protected int skippedDays;
    protected Object Student;


    public Student (String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }


    public void introduce() {
        System.out.println("Hi, i´m: " +  this.name +  ", a " + this.age + " years old " + this.gender + " from " + this.previousOrganization + " who skipped " + this.skippedDays + " days from the course." );
    }

    public void getGoal () {
        System.out.println("My goal is: Be a junior software developer.");
    }

    public void skipDays (int numbersOfDays) {

        this.skippedDays = this.skippedDays + numbersOfDays;
        System.out.println(this.skippedDays);
    }


    @Override
    public String toString() {
        return "previousOrganization: " + previousOrganization +
                ", name: " + name +
                ", gender: " + gender +
                ", age: " + age;
    }
}

