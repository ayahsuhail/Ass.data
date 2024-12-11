
public class Q16 {
    public static int sumUpTo71(int n) {
        // Ensure n is limited to 71
        if (n > 71) {
            n = 71;
        }
        if (n <= 0) {
            return 0; // No positive integers to sum
        }
        // Use the formula for the sum of the first n integers: n * (n + 1) / 2
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(sumUpTo71(50));  // Sum of integers up to 50
        System.out.println(sumUpTo71(71));  // Sum of integers up to 71
        System.out.println(sumUpTo71(100)); // Sum of integers up to 71 (limit enforced)
        System.out.println(sumUpTo71(-5));  // Sum of integers for negative input
    }
}

