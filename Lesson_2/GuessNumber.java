import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    Player playerOne = new Player();
    Player playerTwo = new Player();

    private int computerNumber;

    public void checkNumber(int targetNumber) {
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

    public void gameProcess() {
        computerNumber = random.nextInt(100);
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
        } while (playerOne.getNumber() != computerNumber && playerTwo.getNumber() != computerNumber);
    }
}