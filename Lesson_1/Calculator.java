public class Calculator {

    public static void main(String[] args) {
        int num1 = 19;
        int num2 = 7;
        int result = 0;
        char mathSign = '-';

        if (mathSign == '+') {
            result = num1 + num2;
        } else if (mathSign == '-') {
            result = num1 - num2;
        } else if (mathSign == '*') {
            result = num1 * num2;
        } else if (mathSign == '/') {
            result = num1 / num2;
        } else if (mathSign == '^') {
            result = num1;
            for (int i = 1; i < num2; i++) {
                result *= num1;
            }
        } else if (mathSign == '%') {
            result = num1 % num2;
        }
        System.out.println(num1 + " " + mathSign + " " + num2 + " = " + result);
    }
}