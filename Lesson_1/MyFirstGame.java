public class MyFirstGame {

    public static void main(String[] args) {
        int numComputer = 23;

        for (int i = 1; i <= 100; i++) {
            if (i > numComputer) {
                System.out.println("число " + i + " больше того, что загадал компьютер");
            } else if (i < numComputer) {
                System.out.println("число " + i + " меньше того, что загадал компьютер");
            } else {
                System.out.println("Вы победили!");
                break;
            }
        }
    }
}