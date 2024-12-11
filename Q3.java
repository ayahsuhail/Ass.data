public class Q11 {
    public static boolean isMultiple(long n, long m) {
        // A number n is a multiple of m if m is not zero and n % m == 0
        if (m == 0) {
            throw new IllegalArgumentException("The second parameter (m) cannot be zero.");
        }
        return n % m == 0;
    }

    public static void main(String[] args) {
        // Example usage
        System.out.println(isMultiple(10, 2)); // true
        System.out.println(isMultiple(10, 3)); // false
        System.out.println(isMultiple(0, 5));  // true
    }
}
