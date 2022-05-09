package pig;

import java.util.Scanner;

public class pigApp {
    public static void main(String[] args) {
        System.out.println("Press 1 to play with one dice or press 2 to play with two dice");
        Scanner scanner = new Scanner(System.in);
        pigGame game = new pigGame();
        int dice = scanner.nextInt();
        if (dice == 1) {
            game.play();
        } else {
            game.play2();
        }
    }
}
