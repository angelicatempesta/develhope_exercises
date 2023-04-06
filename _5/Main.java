package javabasics._5;

public class Main {
    // Don't forget to use comments to clear things up if you need them!
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4Bonus();
        exercise5Bonus();
        playAroundWithModulus();
    }

    /*
            Remember the symbols you need to do maths are

            Plus = +
            Minus = -
            Multiply or times = *
            Divide = /
     */

    /**
     * 1: Create an int variable, add 1 to the value and then print it. Use the + operator
     * Then minus 1 from the same variable and print it.
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        int variable = 5;
        var increment = variable + 1;
        System.out.println(increment);
        var decrement = variable - 1;
        System.out.println(decrement);
        // Write your code here
    }

    /**
     * 2: Create a double variable, times by 2 and then print it.
     * <p>
     * Create another double variable, which is the previous variable divided by 2
     * and then print it
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        double decimal = 2.44;
        double decimal1 = decimal * 2;
        System.out.println(decimal1);
        double decimal2 = decimal / 2;
        System.out.println(decimal2);
        // Write your code here
    }

    /**
     * 3: We are going to convert the temperature from celsius to fahrenheit
     * <p>
     * Create a double variable called celsius
     * <p>
     * Create a new variable called fahrenheit
     * <p>
     * The variable fahrenheit should be set as
     * celsius times by 1.8 plus 32
     * <p>
     * Print out celsius and fahrenheit with 2 print statements
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        double celsius = 10;
        var fahrenheit = celsius * 1.8 + 32;
        System.out.println(celsius);
        System.out.println(fahrenheit);

        // Write your code here
    }

    /**
     * 4: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     * Create an int called age with a starting value of 10.
     * <p>
     * Only using the '++' operator increase this value to 15
     */
    private static void exercise4Bonus() {
        System.out.println("\nExercise 4:");
        int age = 10;
        var incrementValue = 4;
        int finalAge = ++age + incrementValue;   //<--- ho utilizzato il pre-incremento, ma avrei potuto utilizzare
        System.out.println(finalAge);             //    anche il post-incremento e settando l'incrementValue a 5
                                                    //   il risultato sarebbe stato ugualmente 15

        /* OPPURE (non so se è quello che voleva l'esericizio, quindi nel dubbio lo eseguo anche
          se mi sembra un po' ripetitivo e macchinoso)*/
        age = 10;
        age++;
        age++;
        age++;
        age++;
        age++;
        System.out.println(age);



        // Write your code here
    }

    /**
     * 5: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     * Create an int called age set as 50
     * <p>
     * Using the -= operator change this value from 50 to 0 in one line of code,
     * <p>
     * Underneath create another int called secondAge set as 50
     * <p>
     * Change this value from 50 to 0 in 3 lines of code
     */
    private static void exercise5Bonus() {
        System.out.println("\nExercise 5:");
        int age = 50;
        var decrementValue = 10;
        age-=decrementValue * 5;
        System.out.println(age);

        int secondAge = 50;
        var decrementValue2 = 12.5;

        secondAge/=2;
        secondAge/=2;
        secondAge-=decrementValue2;

        System.out.println(secondAge);// Write your code here
    }

    /**
     * This is completely optional, but if you guys want to play around with
     * modulus to get a better understanding. Simply change the code below
     */
    private static void playAroundWithModulus() {
        System.out.println("\nModulus testing!:");

        int value = 50;   // <--- change this value
        int modulus = 3; // <--- and this value to see the results of modulus

        System.out.println("Modulus calculation, " + value + " % " + modulus +
                "=" + value % modulus);
    }

}
