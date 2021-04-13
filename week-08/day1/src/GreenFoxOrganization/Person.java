package GreenFoxOrganization;

public class Person {

    protected String name;
    protected String gender;
    protected int age;


    public Person (String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    public void introduce() {
        System.out.println("Hi, i´m: " +  this.name +  ", a " + this.age + " years old " + this.gender + "." );
    }

    public  void getGoal () {
        System.out.println("My goal is: Live for the moment!");
    }

    public Object clone(Object object) {
        return object;
    }
}

