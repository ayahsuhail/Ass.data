public class Q5 {
    private static final int X = 1, O = -1; // اللاعبين
    private static final int EMPTY = 0;
    private int[][] board = new int[3][3]; // لوحة اللعبة
    private int player; // اللاعب الحالي

    public Q5() {
        clearBoard();
    }

    // مسح اللوحة
    public void clearBoard() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                board[i][j] = EMPTY; // كل الخانات يجب أن تكون فارغة
        player = X; // اللاعب الأول هو 'X'
    }

    // وضع علامة X أو O في الموقع i,j.
    public void putMark(int i, int j) {
        if (isGameOver()) {
            throw new IllegalStateException("اللعبة انتهت بالفعل.");
        }
        if ((i < 0) || (i > 2) || (j < 0) || (j > 2)) {
            throw new IllegalArgumentException("موقع اللوحة غير صالح.");
        }
        if (board[i][j] != EMPTY) {
            throw new IllegalArgumentException("الموقع مشغول بالفعل.");
        }
        board[i][j] = player; // وضع العلامة للاعب الحالي
        player = -player; // تبديل اللاعبين (بما أن O = -X)
    }

    // التحقق مما إذا كانت اللعبة قد انتهت
    private boolean isGameOver() {
        return (winner() != 0) || isBoardFull();
    }

    // التحقق مما إذا كانت اللوحة ممتلئة
    private boolean isBoardFull() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board[i][j] == EMPTY)
                    return false;
        return true;
    }

    // تحديد الفائز وإعادة X، O، أو 0 (لا يوجد فائز)
    public int winner() {
        // التحقق من الصفوف والأعمدة
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] + board[i][1] + board[i][2] == 3 * X) ||
                (board[0][i] + board[1][i] + board[2][i] == 3 * X))
                return X;
            if ((board[i][0] + board[i][1] + board[i][2] == 3 * O) ||
                (board[0][i] + board[1][i] + board[2][i] == 3 * O))
                return O;
        }
        // التحقق من الأقطار
        if ((board[0][0] + board[1][1] + board[2][2] == 3 * X) ||
            (board[2][0] + board[1][1] + board[0][2] == 3 * X))
            return X;
        if ((board[0][0] + board[1][1] + board[2][2] == 3 * O) ||
            (board[2][0] + board[1][1] + board[0][2] == 3 * O))
            return O;
        // لا يوجد فائز بعد
        return 0;
    }
}