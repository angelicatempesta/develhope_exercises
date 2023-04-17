//package javabasics._17;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise3();
    }

    /**
     * 1: Write code and fix the program below, you want to accept the questionableFunds
     * into the account!
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        int myBankBalanceEuro = 500;


        String suspiciousEmailMessage =
                """
                            Hello Sir/Madam,
                            
                            I'm a prince here in [redacted] and I need help transferring my billions into 
                            Italy, please provide your bank account details and I will pay you generously.
                            
                            Thanks
                """;

        long questionableFundsEuro = 5_000_000_000l;
        System.out.println(questionableFundsEuro + myBankBalanceEuro);
        //Add the questionable funds to your bank balance and print it out!
    }

    /**
     * 2: Given the following information, think about the MOST EFFICIENT (which uses least space)
     *    type to use to store such data. Why is this the most efficient?
     *
     *    long = -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
     *    double = 16 decimal places
     *    float = 7 decimal places
     *    int = -2,147,483,648 to 2,147,483,647
     *    short = -32,768 to 32,768
     *    byte = -127 to 127
     *
     *    2a: Someone's age -> short, in teoria andrebbe bene anche un byte dato che è difficilissimo trovare
     *        persone che hanno piu' di 127 anni, ma in ogni caso dato che una possibilità c'è opterei per uno short
     *    2b: The age of a baby in months -> byte, dato che in teoria si parla in termini di mesi fino a circa i 36 mesi
     *        e mi risulta difficile immaginare l'età di un bambino contato in 127 mesi
     *    2c: Money in a hedgefund in euros -> long, dato che un fondo d'investimento di una banca potrebbe contenere
     *    migliaia di miliardi o anche di piu'
     *    2d: Price of a good in euros on amazon.com -> float, il prezzo di solito è predisposto con due decimali nel
     *    mondo del commercio, quindi un float dato che è il decimale piu' piccolo
     *    2e: The exact weight of an apple measured by scientific equipment -> double, immagino che l'attrezzatura
     *    scientifica si occupi di arrivare a piu' decimali possibili per essere molto precisa, quindi direi un double
     *    2f: The number of kilometers from any 2 places in the world -> int, dato che la circonferenza della terra
     *    stessa è di circa 40_000 km immagino che l'int possa andare bene perchè lo short arriva fino a 32_768 e quindi
     *    ho pensato fosse piu' adatto l'int
     */

    /**
     * 3: Use the LOCALDATE type (LocalDate.now()) to print out the current date
     * <p>
     * Play around with local date! What can you get it to do?
     * Use at least the following methods on myDate().
     * * getDayOfMonth()
     * * getDayOfWeek()
     * * getDayOfYear()
     * * getMonth()
     * * getMonthValue()
     * * use isBefore() and isAfter() to compare with other dates, use LocalDate.of(year, month, day) to
     * create other days
     */
    public static void exercise3() {
        System.out.println("Exercise 3:");
        myDate();
    }
    private static void myDate(){
        LocalDate.now();
        System.out.println("Todays is " + LocalDate.now().getDayOfWeek() + ", " + LocalDate.now().getDayOfMonth() + " of "
        + LocalDate.now().getMonth() + " (" +  LocalDate.now().getMonthValue() + "° month of the year) and it's the " +
                LocalDate.now().getDayOfYear() + " day of the year!");

        System.out.println("Are we before the Discovery of America? " + LocalDate.now().isBefore(LocalDate.of(1942,10,12)));
        System.out.println("So, are we after the Discovery of America? " + LocalDate.now().isAfter(LocalDate.of(1942,10,12)));
    }
}
