class Main {
  public static void main(String[] args) {
	// write your code here
        // kindly use appropriate data types for your declaration
        // declare variables days the debtor defaulted, amount the debtor is to pay per day,amount the debtor paid and assign values to them
        int daysDefaulted = 5;
        double amountToPayPerDay = 400;
        double amountPaid = 1000;

        //Declare the variable of the total amount the debtor paid, the days the debtor paid for, amount the debtor is left to pay, days the debtor has not payed for
        double totalAmountToPay;
        int daysPaidFor;
        double amountLeftToPay;
        int daysNotPaidFor;

        // calculate and print total amount the debtor is to pay
        totalAmountToPay = daysDefaulted * amountToPayPerDay;
        System.out.println("The total amount the debtor is to pay is: " + "$" + totalAmountToPay);

        // calculate and print the days the debtor paid for
        daysPaidFor = (int) (amountPaid/amountToPayPerDay);
        System.out.println("The days the debtor paid for: " + daysPaidFor + " day(s)");

        // calculate and print the amount whose day was not captured because the amount was incomplete
        double amountNotCaptured = amountPaid % amountToPayPerDay;
        System.out.println("The amount not captured is: " + "$" + amountNotCaptured);

        // calculate and print amount the debtor is left to pay
        amountLeftToPay = totalAmountToPay - amountPaid;
        System.out.println("The amount left that the debtor has to pay is: " + "$" + amountLeftToPay);

        // calculate and print days the debtor has not payed for
        daysNotPaidFor = daysDefaulted - daysPaidFor;
        System.out.println("The days the debtor hasn't paid for is: " + daysNotPaidFor + " day(s)");
    }
}