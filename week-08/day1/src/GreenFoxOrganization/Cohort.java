package GreenFoxOrganization;

import java.util.ArrayList;

public class Cohort {

    protected String name;
    protected ArrayList <Student> students = new ArrayList<>();
    protected ArrayList <Mentor> mentors = new ArrayList<>();

    public Cohort (String name) {
        this.name = name;
    }

    public void addStudent (Student student) {
        students.add(student);
    }

    public void addMentor (Mentor mentor) {
        mentors.add(mentor);
    }

    public void info () {
        System.out.println("The " + this.name + " Cohort has " + students.size() + " students and " + mentors.size() + " mentors.");
    }
}
