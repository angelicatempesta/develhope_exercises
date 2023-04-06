package javabasics._6;

public class Main {
    // Don't forget to use comments to clear things up if you need them!
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4Bonus();
    }

    /**
     * 1: Create a double variable called value, create another double variable called valueSquareRoot
     *
     *    Use Math.sqrt to find the square root of value and assign it to valueSquareRoot
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        double value = 20;
        double valueSquareRoot = Math.sqrt(value);
        System.out.println(valueSquareRoot);

    }

    /**
     * 2: See the code below
     *
     *    Print out the highest value using Math.max()
     *
     *    Then print out the lowest value using Math.min()
     *
     *    You must put your variables into these methods and separate them with a comma
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        int valueA = 5;
        int valueB = 10;
        var max = Math.max(valueA, valueB);
        var min = Math.min(valueA, valueB);

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);

        // Write your code here
    }

    /**
     * 3: Use Modulus (%) to calculate the remaining amount of money if we buy as many burgers as possible, print remainder
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");

        int totalMoney = 50;
        int costPerBurger = 9;
        var remainingMoney = totalMoney % costPerBurger;// Write your code here
        System.out.println("Remainder = "+ remainingMoney + "euros");
    }

    /**
     * 4: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     * I've chosen loads of methods from the Math Library, write comments above each line to guess what they do!
     *
     * You do not need to write any code
     *
     * Answers can be found in resources
     */
    private static void exercise4Bonus() {
        System.out.println("\nExercise 4 (Bonus!):");

        double ourValue = 4.5;

        // trasforma il valore non intero che abbiamo nel seguente numero intero più vicino
        System.out.println(ourValue + " after using ceiling=" + Math.ceil(ourValue));
        // trasforma il valore non intero che abbiamo nel precedente numero intero più vicino
        System.out.println(ourValue + " after using floor=" + Math.floor(ourValue));
        // approssimazione (per eccesso dal .5 al .9, per difetto dal .1 al .4)
        System.out.println(ourValue + " after using round=" + Math.round(ourValue));
        // calcola il valore della variabile (ourValue) in potenza di 2 (che è il valore numerico dato come parametro dopo la virgola)
        System.out.println(ourValue + " after using powerOf with the value of 2=" + Math.pow(ourValue, 2));
        // calcola il valore della variabile (ourValue) in potenza di 3 (che è il valore numerico dato come parametro dopo la virgola)
        System.out.println(ourValue + " after using powerOf with the value of 3=" + Math.pow(ourValue, 3));
        // crea un numero casuale da 0 a 1, che va a sua volta a moltiplicare la nostra variabile double
        System.out.println(ourValue + " times random =" + Math.random() * ourValue);
    }
}