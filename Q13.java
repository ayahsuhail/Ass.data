
public class Q17 {
    public static int sumOfOdds(int n) {
        int sum = 0;
        
        // Loop through all numbers from 1 to n and add the odd ones
        for (int i = 1; i <= n; i += 2) {  // Increment by 2 to only consider odd numbers
            sum += i;
        }
        
        return sum;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(sumOfOdds(10));  // Sum of odd integers up to 10 (1 + 3 + 5 + 7 + 9)
        System.out.println(sumOfOdds(15));  // Sum of odd integers up to 15
        System.out.println(sumOfOdds(7));   // Sum of odd integers up to 7
        System.out.println(sumOfOdds(1));   // Sum of odd integers up to 1
    }
}

