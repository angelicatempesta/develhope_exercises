//package javaoop.exercises._3;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1: Copy over the student class
     *
     *    Make sure there are 5 fields inside, if they are not simply create some more.
     *    make every field private first.
     *
     *    Then create getters and setters for each of these 5 fields.
     *
     *    Once ready use all 5 below
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        Student student = new Student();
        student.setName("Biagio");
        System.out.println(student.getName());
        student.setAge(20);
        System.out.println(student.getAge());
        student.setCity("Rome");
        System.out.println(student.getCity());
        System.out.println(student.getIsAdult());
        student.setSalary(1550.50);
        System.out.println(student.getSalary());
        student.setInitial('B');
        System.out.println(student.getInitial());
        // Write and use your 5 getters and setters!




    }


    /**
     * 2: Create 3 setter constraints for the student class
     *
     *    Think about what reasonably constraints are?
     *
     *    Should a student be able to be a negative age?
     *
     *    Create a counter for one of the getters, try to think about
     *    what other code could be inside a getter? Why not write it?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");

        Student student1 = new Student();
        student1.setName("Filippo");

        student1.setInitial('F');
        student1.setAge(17);
        student1.setSalary(1100.00);
        System.out.println(student1.getIsAdult());

    }

}
