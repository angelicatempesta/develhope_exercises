package javabasics._13;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Add 8 random integers to the array list
     * <p>
     * Print out the first item
     * <p>
     * Remove the first 3 items
     * <p>
     * Then print out the first remaining item
     */
    public static void exercise1() {
        System.out.println("Exercise 1:");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(745);
        numbers.add(51);
        numbers.add(4);
        numbers.add(713);
        numbers.add(1463);
        numbers.add(95);
        numbers.add(688);
        numbers.add(45788);
        System.out.println(numbers.get(0));
        numbers.remove(0);
        numbers.remove(0);
        numbers.remove(0);
        System.out.println(numbers.get(0));



        //Write your code here
    }

    /**
     * 2: Create 2 Array Lists,
     * <p>
     * A list of strings called 'menuItems'
     * <p>
     * And a list of Doubles called 'menuPrices'
     * <p>
     * The indexes of these two lists correspond to eachother
     * <p>
     * Create a print statement to output the name and price of each
     * menu item correspond
     */
    public static void exercise2() {
        System.out.println("\nExercise 2:");
        ArrayList<String> menuItems = new ArrayList<>();
        menuItems.add("Carbonara");
        menuItems.add("Amatriciana");
        menuItems.add("Cotoletta alla milanese");
        menuItems.add("Pollo con patate");
        menuItems.add("Tiramisù");
        menuItems.add("CheeseCake");

        ArrayList<Double> menuPrices = new ArrayList<>();
        menuPrices.add(8.50);
        menuPrices.add(9.90);
        menuPrices.add(12.00);
        menuPrices.add(11.50);
        menuPrices.add(5.50);
        menuPrices.add(6.90);

        System.out.println("Una porzione di " + menuItems.get(0) + " costa €" +  menuPrices.get(0));
        System.out.println("Una porzione di " + menuItems.get(1) + " costa €" + menuPrices.get(1));
        System.out.println("Una porzione di " + menuItems.get(2) + " costa €" + menuPrices.get(2));
        System.out.println("Una porzione di " + menuItems.get(3) + " costa €" + menuPrices.get(3));
        System.out.println("Una porzione di " + menuItems.get(4) + " costa €" + menuPrices.get(4));
        System.out.println("Una porzione di " + menuItems.get(5) + " costa €" + menuPrices.get(5));
        //Write your code here
    }

    /**
     * 3: I changed this to an int array after recording!
     * <p>
     * You'll still need to find the total but using [index] instead of .get(index)
     * <p>
     * Find the total sum of all items in the ArrayList below.
     * <p>
     * Use the + operator
     * <p>
     * print the total
     */
    public static void exercise3() {
        System.out.println("\nExercise 3:");
        int[] items = new int[]{5, 10404, -234348, -53, 9, 91, 92, 34534, 12334, 1435};

        System.out.println(items[0] + items[1] + items[2] + items[3] + items[4] + items[5] + items[6] + items[7] + items[8] + items[9]);

        //OPPURE (ho usato un altro metodo che mi sembrasse meno macchinoso)
        int sum = Arrays.stream(items).sum();
        System.out.println(sum);






        //Write your code here
    }
}
