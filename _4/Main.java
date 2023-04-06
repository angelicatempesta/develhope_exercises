package javabasics._4;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();

    }

    /**
     * 1: Store your age in an appropriate variable, print it out in
     *    one line using the "+" in your print statement. Only use 1 print statement
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        int myAge = 26;
        System.out.println("My age is " + myAge);
        // Write your code here
    }

    /**
     * 2: Store your first name initial (i.e. Jane -> J) in a variable, your age in another variable.
     *
     *    And then print them out on the same line using the following idea
     *
     *    System.out.println("My Age=" + myAge +", my initial=" + myInitial);
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        char myInitial = 'a';
        int myAge = 26;
        System.out.println("My Age = " + myAge +", my initial = " + myInitial);//Write your code here
    }

    /**
     * 3: Write comments above each line of code, describing what the line of code is doing
     */
    private static void exercise3() {
        /*stampa "Exercise 3" utilizzando \n per dare una linea vuota come spazio con le righe di codice precedenti*/
        System.out.println("\nExercise 3:");

        /*dichiara e inizializza la variabile booleana "ha pranzato" e gli assegna valore FALSE
                per affermare che non ha pranzato*/
        boolean hasEatenLunch = false;
        /*dichiara e inizializza la variabile decimale "costo del pranzo" e gli assegna un valore double (decimale)*/
        double lunchCost = 5.99;
        /*stampa in una nuova riga la stringa "costo del pranzo" e concatena (somma mi sembra il termine sbagliato)
           la variabile double prima dichiarata*/
        System.out.println("Lunch cost=" + lunchCost);
        /*stampa in una nuova riga la stringa "ha pranzato" e concatena la variabile booleana prima dichiarata*/
        System.out.println("Has Eaten lunch=" + hasEatenLunch);
    }
}
