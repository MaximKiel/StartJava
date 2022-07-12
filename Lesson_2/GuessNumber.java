public class GuessNumber {

    private int computerNumber;
    private String answer;

    public int getComputerNumber() {
        return computerNumber;
    }

    public void setComputerNumber(int computerNumber) {
        this.computerNumber = computerNumber;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

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
}