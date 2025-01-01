import java.util.Random;
import java.util.Arrays;

public class Q3 {
    public static void removeRandomEntries(int[] array) {
        Random random = new Random();
        while (array.length > 0) {
            // اختيار فهرس عشوائي
            int index = random.nextInt(array.length);

            // طباعة العنصر الذي سيتم إزالته
            System.out.println("Removing: " + array[index]);

            // إنشاء مصفوفة جديدة بدون العنصر المحذوف
            array = Arrays.copyOfRange(array, 0, index) + Arrays.copyOfRange(array, index + 1, array.length);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        removeRandomEntries(array);
    }
}
