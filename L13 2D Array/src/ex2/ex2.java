package ex2;


import java.security.PublicKey;
import java.util.Arrays;
import java.util.Random;
import java.util.SortedMap;

public class ex2 {
    public static void main(String[] args) {
        char[][] table = new char[8][10];
        char[] svar =
                {'A', 'D', 'C', 'A', 'C', 'B', 'A', 'B', 'B', 'B'};
        int student = 8;
        int questions = 10;

        for (int r = 0; r < table.length; r++) {
            for (int c = 0; c < table[r].length; c++) {
                table[r][c] = quizSvar();
            }
            int numberOfCorrectAnswers = 0;
            for (int i = 0; i < table[r].length; i++) {
                if (table[r][i] == svar[i]) {
                    numberOfCorrectAnswers++;
                }
            }
            System.out.println("Student #" + (r + 1) + ": " + Arrays.toString(table[r]) + " Correct answers: " + numberOfCorrectAnswers);
        }
        int correctAnswersPrQ = 0;
        for (int c = 0; c < questions; c++) {
            for (int r = 0; r < table.length; r++)
                if (table[r][c] == svar[c]) {
                    correctAnswersPrQ++;
                }
            System.out.println("Number of correct answers for question # " + (c + 1) + ": " + correctAnswersPrQ);
            correctAnswersPrQ = 0;
        }
    }

    public static char quizSvar() {
        Random rand = new Random();
        int tal = rand.nextInt(65, 69);
        return (char) tal;
    }
}


