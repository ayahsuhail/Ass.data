
public class Q19 {
    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(countVowels("Hello World"));  // 3 vowels ('e', 'o', 'o')
        System.out.println(countVowels("Java Programming"));  // 5 vowels ('a', 'a', 'o', 'a', 'i')
        System.out.println(countVowels("OpenAI"));  // 3 vowels ('O', 'e', 'A')
        System.out.println(countVowels("rhythm"));  // 0 vowels
    }
}


