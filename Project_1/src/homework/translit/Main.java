package homework.translit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        System.out.print("Привет, " + name + "!");
        Translit tr = new Translit();
        String s = "";

        while (!s.equals("нет")) {
            System.out.println("Введите что-нибудь!");
            s = scanner.nextLine();
            System.out.println(tr.rusToEngTranlit(s));
            System.out.println("Продолжить? (да/нет)");
            s = scanner.nextLine();
        }
    }
}
