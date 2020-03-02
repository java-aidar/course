package homework.calculator;

public class Calculator {
    public double calculate(double a, char operation, double b) {
        double result = 0;
        switch (operation) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                System.out.println("Неверный знак операции!!!");
        }
        return result;
    }
}
