package GreenFoxOrganization;

public class Mentor extends Person {

    protected String level;

    public Mentor (String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
    }

    public void introduce() {
        System.out.println("Hi, i´m " +  this.name +  ", a " + this.age + " years old " + this.gender + " " + this.level + ".");
    }

    public void getGoal () {
        System.out.println("My goal is: Educate brilliant junior software developers.");
    }


    @Override
    public String toString() {

        return  "level: " + level +
                ", name: " + name +
                ", gender: " + gender +
                ", age: " + age;
    }
}
