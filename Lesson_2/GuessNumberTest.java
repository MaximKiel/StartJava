import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GuessNumber guessNumber = new GuessNumber();
        String answer;

        do {
            System.out.println("\nНачинаем! Компьютер загадал число от 0 до 100! Теперь попробуйте угадать его!");
            guessNumber.gameProcess();
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                answer = scanner.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));

        System.out.println("Конец игры! До свидания!");
    }
}