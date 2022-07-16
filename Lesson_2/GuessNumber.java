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

    public void start() {
        computerNumber = random.nextInt(100) + 1;
        System.out.println("\nНачинаем! Компьютер загадал число от 0 до 100! Теперь попробуйте угадать его!");
        do {
            System.out.print("Игрок " + playerOne.getName() + " предлагает число: ");
            playerOne.setNumber(scanner.nextInt());
            if (checkNumber(playerOne)) {
                break;
            }
            System.out.print("Игрок " + playerTwo.getName() + " предлагает число: ");
            playerTwo.setNumber(scanner.nextInt());
            if (checkNumber(playerTwo)) {
                break;
            }
        } while (true);
    }

    private boolean checkNumber(Player player) {
        if (player.getNumber() <= 0 || player.getNumber() > 100) {
            System.out.println("Ошибка! Число должно быть в полуинтервале (0; 100]");
            return false;
        } else {
            if (player.getNumber() == computerNumber) {
                System.out.println("Игрок " + player.getName() + " угадал!");
                return true;
            } else if (player.getNumber() > computerNumber) {
                System.out.println("Число " + player.getNumber() + " больше того, что загадал компьютер");
                return false;
            } else {
                System.out.println("Число " + player.getNumber() + " меньше того, что загадал компьютер");
                return false;
            }
        }
    }
}