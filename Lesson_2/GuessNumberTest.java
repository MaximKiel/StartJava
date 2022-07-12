import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        GuessNumber guessNumber = new GuessNumber();

        System.out.print("Введите имя 1 игрока: ");
        Player playerOne = new Player(scanner.nextLine());

        System.out.print("Введите имя 2 игрока: ");
        Player playerTwo = new Player(scanner.nextLine());

        do {
            guessNumber.setComputerNumber(random.nextInt(100));

            System.out.println("\nНачинаем! Компьютер загадал число от 0 до 100! Теперь попробуйте угадать его!");

            do {
                System.out.print("Игрок " + playerOne.getPlayerName() + " предлагает число: ");
                playerOne.setPlayerNumber(scanner.nextInt());
                guessNumber.checkNumber(playerOne.getPlayerNumber());

                if (playerOne.getPlayerNumber() == guessNumber.getComputerNumber()) {
                    break;
                }

                System.out.print("Игрок " + playerTwo.getPlayerName() + " предлагает число: ");
                playerTwo.setPlayerNumber(scanner.nextInt());
                guessNumber.checkNumber(playerTwo.getPlayerNumber());
            } while (playerOne.getPlayerNumber() != guessNumber.getComputerNumber() &&
                    playerTwo.getPlayerNumber() != guessNumber.getComputerNumber());

            do {
                System.out.println("Хотите продолжить игру? [yes/no]:");
                guessNumber.setAnswer(scanner.next());
            } while (!guessNumber.getAnswer().equals("yes") && !guessNumber.getAnswer().equals("no"));
        } while (guessNumber.getAnswer().equals("yes"));

        System.out.println("Конец игры! До свидания!");
    }
}