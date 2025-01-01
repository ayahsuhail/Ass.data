import java.util.HashSet;
import java.util.Set;

public class Q13 {
    // مصفوفة لتتبع اللقاءات بين اللاعبين
    static boolean[][] meetings;
    // مصفوفة لتتبع عدد اللاعبين الذين التقى بهم كل لاعب
    static int[] meetingCount;
    // مجموعة لتخزين اللاعبين الفائزين
    static Set<Integer> winners;

    public static void initialize(int n) {
        meetings = new boolean[n][n];
        meetingCount = new int[n];
        winners = new HashSet<>();
    }

    public static void meet(int i, int j, int n) {
        // تحديث المصفوفة لتتبع اللقاءات
        meetings[i][j] = true;
        meetings[j][i] = true;

        // زيادة عدد اللقاءات لكل لاعب
        meetingCount[i]++;
        meetingCount[j]++;

        // تحقق إذا كان أحد اللاعبين قد التقى بكل اللاعبين الآخرين
        if (meetingCount[i] == n - 1) {
            winners.add(i); // اللاعب i فائز
        }
        if (meetingCount[j] == n - 1) {
            winners.add(j); // اللاعب j فائز
        }
    }

    public static void main(String[] args) {
        int n = 5; // عدد اللاعبين (مثال)
        initialize(n);

        // محاكاة لقاءات بين اللاعبين
        meet(0, 1, n);
        meet(1, 2, n);
        meet(2, 3, n);
        meet(3, 4, n);
        meet(0, 2, n);
        meet(1, 3, n);

        // طباعة الفائزين
        System.out.println("الفائزون: " + winners);
    }
}
