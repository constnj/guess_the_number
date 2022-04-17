import java.util.Random;
import java.util.Scanner;

public class guessTheNumber {
    public static void main(String[] args) {

        System.out.println("Игра \"Угадай число\"");
        System.out.println("Есть три попытки.");

        int compNumber = random();
        boolean result = false;

        for(int i=1; i<=3; i++){
            int humNumber = scan();
            result = gameLoop(humNumber, compNumber);
            if (result) { break; }
        }

        if (result) {
            System.out.println("Вы выиграли");
        } else {
            System.out.println("Вы проиграли");
        }
    }

    static boolean gameLoop(int humanNumber, int compNumber) {

        if (humanNumber == compNumber) {
            return true;
        } else if  (humanNumber < compNumber) {
                System.out.println("Вам нужно было число больше данного.");
        } else {
                System.out.println("Вам нужно было число меньше данного.");
        }
        return false;
    }

    static int random() {
        Random newRandom = new Random();
        int randomNumber = newRandom.nextInt(10) + 1;
        return randomNumber;
    }

    static int scan() {
        System.out.println("Введите число от 1 до 10");
        Scanner scanner = new Scanner(System.in);
        int humanNumber = scanner.nextInt();
        return humanNumber;
    }
}

