
public class Q20 {
    public static String removePunctuation(String s) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (Character.isLetterOrDigit(c) || Character.isWhitespace(c)) {
                sb.append(c);
            }
        }
        
        // Convert StringBuilder to a string and return
        return sb.toString();
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(removePunctuation("Let's try Mike!"));  // "Lets try Mike"
        System.out.println(removePunctuation("Hello, World!"));  // "Hello World"
        System.out.println(removePunctuation("Java is fun!!!"));  // "Java is fun"
        System.out.println(removePunctuation("No punctuation here"));  // "No punctuation here"
    }
}

