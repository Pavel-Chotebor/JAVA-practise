package GreenFoxOrganization;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();

        Person mark = new Person("Mark", 46, "male");
        people.add(mark);
        Person jane = new Person("Jane Doe",30, "female");
        people.add(jane);
        Student john = new Student("John Doe", 20, "male", "BME");
        people.add(john);
        Student student = new Student("John", 20, "male", "BME");
        people.add(student);
        Mentor gandhi = new Mentor("Gandhi", 148, "male", "senior");
        people.add(gandhi);
        Mentor mentor = new Mentor("Jane Doe", 30, "female", "intermediate");
        people.add(mentor);
        Sponsor sponsor = new Sponsor("Jane Doe", 30, "female", "Google", 0);
        people.add(sponsor);
        Sponsor elon = new Sponsor("Elon Musk", 46, "male", "SpaceX", 0);
        people.add(elon);

        student.skipDays(3);

        for (int i = 0; i < 5; i++) {
            elon.hire();
        }

        for (int i = 0; i < 3; i++) {
            sponsor.hire();
        }

        for(Person person : people) {
            person.introduce();
            person.getGoal();
        }

        Cohort awesome = new Cohort("AWESOME");
        awesome.addStudent(student);
        awesome.addStudent(john);
        awesome.addMentor(mentor);
        awesome.addMentor(gandhi);
        awesome.info();

        Student johnTheClone = new Student("-", 0, "-", "-");
        Mentor gandhiTheClone = new Mentor("-", 0, "-", "-");
        Sponsor elonTheClone = new Sponsor("-", 0, "-", "-", 0);

        johnTheClone = (Student) johnTheClone.clone(john);
        gandhiTheClone = (Mentor) gandhiTheClone.clone(gandhi);
        elonTheClone = (Sponsor) elonTheClone.clone(elon);


        System.out.println(johnTheClone);
        System.out.println(gandhiTheClone);

    }

}
