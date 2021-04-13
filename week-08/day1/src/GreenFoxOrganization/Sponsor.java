package GreenFoxOrganization;

public class Sponsor extends Person {

    protected String company;
    protected int hiredStudents;


    public Sponsor (String name, int age, String gender, String company, int hiredStudents) {
        super(name, age, gender);
        this.company = company;
        this.hiredStudents = hiredStudents;
        hiredStudents = 0;
    }

    public void introduce() {
        System.out.println("Hi, i´m " +  this.name +  ", a " + this.age + " years old " + this.gender + " who represents " + this.company + " and hired " + this.hiredStudents + " students so far." );
    }


    public void getGoal () {
        System.out.println("My goal is: Hire brilliant junior software developers.");
    }

    public void hire () {
        hiredStudents++;
    }
}



