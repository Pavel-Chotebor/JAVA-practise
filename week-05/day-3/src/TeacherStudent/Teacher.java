package TeacherStudent;

import TeacherStudent.Student;

public class Teacher {

    public static void teach(Student student) {
        student.learn();
    }

    public void answer() {
        System.out.println("Teacher is answering question...");

    }
}
