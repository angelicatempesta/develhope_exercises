package javabasics._15;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1a: Edit this while loop to stop once our currentInvestmentValueEuros reaches €100,000
     * <p>
     * 1b: Change the same line, but now instead of currentInvestmentValueEuros reaching €100,000
     *
     *     Let's just run it for 5 years OR until it reaches €15,000 use || just like an if!
     */
    private static void exercise1() {
        System.out.println("Exercise 1 - Compounding Interest:");

        double currentInvestmentValueEuros = 10_000;
        double averageReturnFromStockMarketIndexPercentage = 8;
        double perYearMultiplier = 1 + (averageReturnFromStockMarketIndexPercentage / 100);
        int yearsPast = 0;
        double interestGainedThisYearEuros = 0;

        // nel commento sotto la linea di codice corrisponde alla risoluzione dell'esercizio 1a
        //while (currentInvestmentValueEuros <= 100_000) {

            while (yearsPast <= 5 || currentInvestmentValueEuros <= 15_000) {
            System.out.println("Investment value = €" + currentInvestmentValueEuros + " after " + yearsPast++ + " years" +
                    ", interest this year €" + interestGainedThisYearEuros);
            double previousYearsInvestment = currentInvestmentValueEuros;
            currentInvestmentValueEuros = currentInvestmentValueEuros * perYearMultiplier;
            interestGainedThisYearEuros = currentInvestmentValueEuros - previousYearsInvestment;
        }
    }

    /**
     * 2: Write a while loop for our trading bot!
     *
     *    The bot is going through a financial catastrophe! It's holding 10,000 great british pounds.
     *
     *    It wants to sell all of these as soon as possible! Before the state of Britain collapses, but it's a bit greedy.
     *    It will only sell its pounds when the exchange rate is greater than 1.15 (poundToEuro)
     *
     *    On days where it sells, it can only sell 1000 pounds for euros.
     *
     *    Write a while loop
     *
     *    Use the calculation for exchange rate below
     *    1 + (Math.random() * 0.2);
     *
     *    to recalculate our rate every day (once per loop)
     *
     *    Print the number of days it takes for our bot to sell its pounds
     */
    private static void exercise2() {
        System.out.println("Exercise 2 - Selling the pound:");
        double poundToEuroExchangeRate = 1 + (Math.random() * 0.2);
        int daysToSell = 0;
        int remainingPoundsToSell = 10_000;
        int maxPoundsToSellPerDay = 1_000;

        while (remainingPoundsToSell > 0) {
            poundToEuroExchangeRate = 1 + (Math.random() * 0.2);
            if (poundToEuroExchangeRate >= 1.15) {
                remainingPoundsToSell -= maxPoundsToSellPerDay;   // Write your while loop here
            }
            daysToSell++;

        }

        System.out.println("It took " + daysToSell + " to exit that cursed economy");
    }

    /**
     * 3: Write answers below for the following 4 situations, should we use a while, do while, fori or for each loop?
     *    Which would work best? Why?
     *
     * Q Example: Print out the numbers 1 to 10
     * A Example: fori
     *
     * Q1: A user inputs their actions into an ATM, they can withdraw, deposit, check balance or exit. What loop should we use?
     * A1: Do while, perchè conosciamo la quantità di azioni che può fare e sappiamo che potrà farne solamente una alla volta
     *
     * Q2: We have a list of 1000 users to send emails to
     * A2:For each e Fori, ma a mio parere il for each sarebbe più adatto, poichè conosciamo già il numero di email da inviare
     *
     * Q3: We want to print out the first 80 customer names from our bank database
     * A3: Fori, dato che possiamo procedere per indice è molto adatto, e soprattutto perchè il for each continuerebbe a stampare tutti i nomi dal database
     *        mentre noi vogliamo solo i primi 80
     *
     * Q4: We want to read a file 100 lines at a time, without loading the full file into our program
     * A4: Fori: dato che vogliamo leggere 100 righe alla volta senza però sapere quante righe ci sono effettivamente
     *              all'interno del file
     */
}