public class Q2 {
    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();

        for (char character : text.toCharArray()) {
            if (Character.isLowerCase(character)) {
                char encrypted = (char) ((character - 'a' + shift) % 26 + 'a');
                result.append(encrypted);
            } else if (Character.isUpperCase(character)) {
                char encrypted = (char) ((character - 'A' + shift) % 26 + 'A');
                result.append(encrypted);
            } else {
                result.append(character);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String text = "Hello World!";
        int shift = 3;

        String encryptedText = encrypt(text, shift);
        System.out.println("Encrypted Text: " + encryptedText);
    }
}