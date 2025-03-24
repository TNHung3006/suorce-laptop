import java.util.Arrays;
import java.util.Comparator;

public class Cau17 {
    public static void main(String[] args) {
        char[][] studentAnswers = {
            {'A', 'B', 'A', 'C', 'C', 'D', 'F', 'E', 'A', 'D'},
            {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
            {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
            {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'F', 'A', 'D'},
            {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'E', 'B', 'E', 'C', 'C', 'D', 'F', 'E', 'A', 'D'}
        };

        char[] correctAnswers = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        int[][] studentScores = new int[studentAnswers.length][2];

        // Tính điểm cho từng sinh viên
        for (int i = 0; i < studentAnswers.length; i++) {
            int score = 0;
            for (int j = 0; j < correctAnswers.length; j++) {
                if (studentAnswers[i][j] == correctAnswers[j]) {
                    score++;
                }
            }
            studentScores[i][0] = i; // Lưu trữ số thứ tự sinh viên
            studentScores[i][1] = score; // Lưu trữ điểm số
        }

        // Sắp xếp sinh viên theo thứ tự tăng dần của điểm số
        Arrays.sort(studentScores, Comparator.comparingInt(a -> a[1]));

        // In kết quả
        for (int[] studentScore : studentScores) {
            System.out.println("Student " + studentScore[0] + ": " + studentScore[1] + " correct answers");
        }
    }
}
