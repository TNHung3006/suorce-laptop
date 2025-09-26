import java.io.*;
import java.util.*;

public class Scoreboard {
    private static final String SCORE_FILE = "scores.txt";
    private List<ScoreEntry> scores;
    private Set<String> playerNames; // To track unique player names

    public Scoreboard() {
        scores = new ArrayList<>();
        playerNames = new HashSet<>();
        loadScores();
    }

    public void addScore(String playerName, int score) {
        int existingScoreIndex = findPlayerScore(playerName);

        if (existingScoreIndex != -1) {
            // Player exists, check if the new score is higher
            ScoreEntry existingScore = scores.get(existingScoreIndex);
            if (score > existingScore.getScore()) {
                // New score is higher, update the score
                scores.set(existingScoreIndex, new ScoreEntry(playerName, score));
                Collections.sort(scores); // Sort the scores
                saveScores();
            }
        } else {
            // Player doesn't exist, add the new score
            if (scores.size() < 10 && !playerNames.contains(playerName)) {
                scores.add(new ScoreEntry(playerName, score));
                playerNames.add(playerName);
                Collections.sort(scores); // Sort the scores
                saveScores();
            } else if (scores.size() >= 10) {
                // Check if the new score is higher than the lowest score in the top 10
                ScoreEntry lowestScore = scores.get(scores.size() - 1);
                if (score > lowestScore.getScore() && !playerNames.contains(playerName)) {
                    // Replace the lowest score with the new score
                    scores.remove(lowestScore);
                    playerNames.remove(lowestScore.getPlayerName());
                    scores.add(new ScoreEntry(playerName, score));
                    playerNames.add(playerName);
                    Collections.sort(scores);
                    saveScores();
                }
            }
        }
        // After adding or updating, ensure we only keep top 10 unique names
        ensureTop10Unique();
    }

    private void ensureTop10Unique() {
        Set<String> uniqueNames = new HashSet<>();
        List<ScoreEntry> uniqueScores = new ArrayList<>();
        for (ScoreEntry score : scores) {
            if (uniqueNames.add(score.getPlayerName())) {
                uniqueScores.add(score);
                if (uniqueScores.size() == 10) break;
            }
        }
        scores = uniqueScores;
        saveScores();
    }

    private int findPlayerScore(String playerName) {
        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i).getPlayerName().equals(playerName)) {
                return i; // Player found
            }
        }
        return -1; // Player not found
    }

    public List<ScoreEntry> getTopScores() {
        return scores.subList(0, Math.min(10, scores.size()));
    }

    private void loadScores() {
        try (BufferedReader reader = new BufferedReader(new FileReader(SCORE_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String playerName = parts[0];
                    int score = Integer.parseInt(parts[1]);
                    scores.add(new ScoreEntry(playerName, score));
                    playerNames.add(playerName);
                }
            }
        } catch (IOException e) {
            System.err.println("Error loading scores: " + e.getMessage());
            // Handle file not found or other IO errors
        }
    }

    private void saveScores() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(SCORE_FILE))) {
            for (ScoreEntry entry : scores) {
                writer.write(entry.getPlayerName() + "," + entry.getScore());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error saving scores: " + e.getMessage());
        }
    }
}