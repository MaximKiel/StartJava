import java.util.Scanner;

public class Player {

    Scanner scanner = new Scanner(System.in);

    private int number;
    private String name;

    public Player() {
        System.out.print("Введите имя игрока: ");
        name = scanner.next();
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}