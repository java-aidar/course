package homework.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        System.out.println("Привет, " + name + "!");
        String userAction = "да";

        while (userAction.equals("да")) {
            System.out.print("Введите 1-е число: ");
            double a = scanner.nextDouble();
            System.out.print("Введите операцию: ");
            char operation = scanner.next().charAt(0);
            System.out.print("Введите 2-е число: ");
            double b = scanner.nextDouble();
            Calculator calculator = new Calculator();
            System.out.println(a + " " + operation + " " + b + " = " + calculator.calculate(a, operation, b));
            System.out.println("Продолжить? (да/нет)" + (userAction = scanner.nextLine()));
            userAction = scanner.nextLine(); // если оставить только один userAction = scanner.nextLine() то переходит в начало цикла, пропуская s!!!!!
        }
    }
}
