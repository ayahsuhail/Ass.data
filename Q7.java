
public class Q18 {
    public static int sumOfSquares(int n) {
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        
        return sum;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(sumOfSquares(3));  // Sum of squares up to 3 (1^2 + 2^2 + 3^2)
        System.out.println(sumOfSquares(5));  // Sum of squares up to 5
        System.out.println(sumOfSquares(7));  // Sum of squares up to 7
        System.out.println(sumOfSquares(1));  // Sum of squares up to 1
    }
}

