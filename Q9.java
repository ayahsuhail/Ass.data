public class Q9 {
    private int[] scores;  // Array to store the scores
    private int n;         // Number of current entries

    // Constructor to initialize the scoreboard with a maximum size
    public Q9(int maxEntries) {
        scores = new int[maxEntries];
        n = 0;
    }

    // Add a new score to the scoreboard
    public void add(int e) {
        if (n < scores.length) {  // Ensure there's space in the scoreboard
            scores[n] = e;  // Add the new score at the next available position
            n++;  // Increment the number of entries
        } else {
            System.out.println("The scoreboard is full. Cannot add more scores.");
        }
    }

    // Remove a score at a specific index
    public void remove(int i) {
        if (i >= 0 && i < n) {  // Ensure the index is valid
            scores[i] = scores[n - 1];  // Replace the score at index i with the last score
            n--;  // Decrement the number of entries
        } else {
            System.out.println("Invalid index.");
        }
    }

    // Display the current scores (for testing purposes)
    public void displayScores() {
        System.out.print("Scores: ");
        for (int j = 0; j < n; j++) {
            System.out.print(scores[j] + " ");
        }
        System.out.println();
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        // Create a scoreboard with a maximum capacity of 5
        Q9 scoreboard = new Q9(5);

        // Test adding scores
        scoreboard.add(10);
        scoreboard.add(20);
        scoreboard.add(30);
        scoreboard.add(40);
        scoreboard.add(50);
        scoreboard.displayScores(); // Expected: 10 20 30 40 50

        // Attempt to add a score when the scoreboard is full
        scoreboard.add(60); // Expected: "The scoreboard is full. Cannot add more scores."

        // Test removing a score
        scoreboard.remove(2); // Remove the score at index 2 (30)
        scoreboard.displayScores(); // Expected: 10 20 50 40 (order may vary)

        // Test removing another score
        scoreboard.remove(0); // Remove the score at index 0 (10)
        scoreboard.displayScores(); // Expected: 40 20 50 (order may vary)

        // Test removing with an invalid index
        scoreboard.remove(5); // Expected: "Invalid index."

        // Add a new score after removal
        scoreboard.add(70);
        scoreboard.displayScores(); // Expected: 40 20 50 70 (order may vary)
    }
}


