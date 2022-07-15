import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    private Player playerOne;
    private Player playerTwo;
    private int computerNumber;

    public GuessNumber(Player player1, Player player2) {
        this.playerOne = player1;
        this.playerTwo = player2;
    }

    public void gameStart() {
        computerNumber = random.nextInt(100) + 1;
        System.out.println("\nНачинаем! Компьютер загадал число от 0 до 100! Теперь попробуйте угадать его!");
        do {
            System.out.print("Игрок " + playerOne.getName() + " предлагает число: ");
            playerOne.setNumber(scanner.nextInt());
            checkNumber(playerOne.getNumber());
            if (playerOne.getNumber() == computerNumber) {
                break;
            }
            System.out.print("Игрок " + playerTwo.getName() + " предлагает число: ");
            playerTwo.setNumber(scanner.nextInt());
            checkNumber(playerTwo.getNumber());
            if (playerTwo.getNumber() == computerNumber) {
                break;
            }
        } while (true);
    }

    private void checkNumber(int targetNumber) {
        if (targetNumber <= 0 || targetNumber > 100) {
            System.out.println("Ошибка! Число должно быть в полуинтервале (0; 100]");
        } else {
            if (targetNumber == computerNumber) {
                System.out.println("Вы угадали!");
            } else if (targetNumber > computerNumber) {
                System.out.println("Число " + targetNumber + " больше того, что загадал компьютер");
            } else if (targetNumber < computerNumber) {
                System.out.println("Число " + targetNumber + " меньше того, что загадал компьютер");
            }
        }
    }
}