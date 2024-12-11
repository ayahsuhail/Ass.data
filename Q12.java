
public class Q15 {
    // Instance variables
    private String customer; // name of the customer (e.g., "John Bowman")
    private String bank;     // name of the bank (e.g., "California Savings")
    private String account;  // account identifier (e.g., "5391 0375 9387 5309")
    private int limit;       // credit limit (measured in dollars)
    private double balance;  // current balance (measured in dollars)

    // Constructor
    public Q15(String customer, String bank, String account, int limit, double initialBalance) {
        this.customer = customer;
        this.bank = bank;
        this.account = account;
        this.limit = limit;
        this.balance = initialBalance;
    }

    // Getter methods
    public String getCustomer() {
        return customer;
    }

    public String getBank() {
        return bank;
    }

    public String getAccount() {
        return account;
    }

    public int getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

    // Method to charge an amount to the credit card
    public boolean charge(double price) {
        if (price + balance > limit) { // if charge exceeds limit
            return false;             // transaction rejected
        }
        balance += price;
        return true;                  // transaction accepted
    }

    // Method to make a payment
    public void makePayment(double amount) {
        balance -= amount;
    }

    // New method to update the credit limit
    public void updateLimit(int newLimit) {
        if (newLimit < 0) {
            throw new IllegalArgumentException("Credit limit cannot be negative.");
        }
        this.limit = newLimit;
    }

    // Utility method to print a card's information
    public static void printSummary(CreditCard card) {
        System.out.println("Customer = " + card.customer);
        System.out.println("Bank = " + card.bank);
        System.out.println("Account = " + card.account);
        System.out.println("Limit = " + card.limit);
        System.out.println("Balance = " + card.balance);
    }

    // Main method for testing
    public static void main(String[] args) {
        CreditCard card = new CreditCard("John Bowman", "California Savings", "5391 0375 9387 5309", 5000, 1000.0);

        // Print initial details
        CreditCard.printSummary(card);

        // Update the credit limit
        card.updateLimit(7000);
        System.out.println("\nAfter updating the credit limit:");
        CreditCard.printSummary(card);

        // Attempt an invalid limit update
        try {
            card.updateLimit(-2000); // Should throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println("\nError: " + e.getMessage());
        }
    }
}


