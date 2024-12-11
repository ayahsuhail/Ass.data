
public class Qq12
{

    public static boolean isEven(int i) {
        return (i & 1) == 0;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isEven(4));  // true, because 4 is even
        System.out.println(isEven(7));  // false, because 7 is odd
        System.out.println(isEven(0));  // true, because 0 is even
        System.out.println(isEven(-6)); // true, because -6 is even
    }
}

