package ex1;

import ex1.figure2d.Circle;
import ex1.figure2d.Rectangle;
import ex1.figure2d.Square;
import ex1.figure2d.Triangle;
import ex1.figure3d.Cube;
import ex1.figure3d.Parallelepiped;
import ex1.figure3d.Pyramid;
import ex1.figure3d.Sphere;

import java.util.Scanner;

class Main {
    static int tas = -1;    // Переменная введена для общего вывода

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DynStack mystack1 = new DynStack(5);
        System.out.print("Команды: вставить - Вставить новый элемент в стек  \n\t\t " +
                "получить - Получить последний элемент  \n\t\t " +
                "получить все - Получить все элементы \n\t\t " +
                "завершить - Завершить работу\n" + "Введите команду: ");
        String s = scanner.nextLine();
        String str = "Введите одну из команд: [вставить,получить,получить все,завершить] ";

        M:
        for (; ; ) {
            N:
            if (s.equals("вставить")) {
                tas++;
                System.out.println("Какую фигуру вставить в стек?\n[круг, квадрат, прямоугольник, треугольник, " +
                        "сфера, куб, параллелепипед, пирамида]");
                String s1 = scanner.nextLine();

                if (s1.equals("круг")) {
                    inputCircle(scanner, mystack1, str);
                    break N;
                } else if (s1.equals("квадрат")) {
                    inputSquare(scanner, mystack1, str);
                    break N;
                } else if (s1.equals("прямоугольник")) {
                    inputRectangle(scanner, mystack1, str);
                    break N;
                } else if (s1.equals("треугольник")) {
                    inputTriangle(scanner, mystack1, str);
                    break N;
                } else if (s1.equals("сфера")) {
                    inputSphere(scanner, mystack1, str);
                    break N;
                } else if (s1.equals("куб")) {
                    inputCube(scanner, mystack1, str);
                    break N;
                } else if (s1.equals("параллелепипед")) {
                    inputParallelepiped(scanner, mystack1, str);
                    break N;
                } else if (s1.equals("пирамида")) {
                    inputPyramid(scanner, mystack1, str);
                    break N;
                } else {
                    System.out.println("Ошибка ввода!\n" + str);
                    tas--;
                }

            } else if (s.equals("получить")) {
                System.out.println(mystack1.pop());
                tas--;
                System.out.println(str);
                break N;

            } else if (s.equals("получить все")) {
                for (; tas > -1; tas--) {
                    System.out.println(mystack1.pop());
                }
                break M;

            } else if (s.equals("завершить")) {
                System.out.println("Работа со стеком закончена!");
                break M;
            }
            s = scanner.nextLine();
        }
    }


    private static void inputCircle(Scanner scanner, DynStack mystack1, String str) {
        System.out.print("Введите радиус круга: ");
        int a = scanner.nextInt();
        if (a > 0) {
            mystack1.push(new Circle(a));
            System.out.println(str);
        } else {
            tas--;
            System.out.println("Ошибка ввода!\n" + str);
        }
    }

    private static void inputSquare(Scanner scanner, DynStack mystack1, String str) {
        System.out.print("Введите длину стороны квадрата: ");
        int a = scanner.nextInt();
        if (a > 0) {
            mystack1.push(new Square(a));
            System.out.println(str);
        } else {
            tas--;
            System.out.println("Ошибка ввода!\n" + str);

        }
    }

    private static void inputRectangle(Scanner scanner, DynStack mystack1, String str) {
        System.out.print("Введите длину прямоугольника: ");
        int a = scanner.nextInt();
        System.out.print("Введите ширину прямоугольника: ");
        int b = scanner.nextInt();
        if (a > 0 & b > 0) {
            mystack1.push(new Rectangle(a, b));
            System.out.println(str);
        } else {
            tas--;
            System.out.println("Ошибка ввода!\n" + str);
        }
    }

    private static void inputTriangle(Scanner scanner, DynStack mystack1, String str) {
        System.out.print("Введите длину стороны а: ");
        int a = scanner.nextInt();
        System.out.print("Введите высоту треугольника: ");
        int h = scanner.nextInt();
        if (a > 0 & h > 0) {
            mystack1.push(new Triangle(a, h));
            System.out.println(str);
        } else {
            tas--;
            System.out.println("Ошибка ввода!\n" + str);
        }
    }

    private static void inputSphere(Scanner scanner, DynStack mystack1, String str) {
        System.out.print("Введите радиус cферы: ");
        int a = scanner.nextInt();
        if (a > 0) {
            mystack1.push(new Sphere(a));
            System.out.println(str);
        } else {
            tas--;
            System.out.println("Ошибка ввода!\n" + str);
        }
    }

    private static void inputCube(Scanner scanner, DynStack mystack1, String str) {
        System.out.println("Введите длину стороны куба");
        int a = scanner.nextInt();
        if (a > 0) {
            mystack1.push(new Cube(a));
            System.out.println(str);
        } else {
            tas--;
            System.out.println("Ошибка ввода!\n" + str);
        }
    }

    private static void inputParallelepiped(Scanner scanner, DynStack mystack1, String str) {
        System.out.print("Введите длину параллелепипеда: ");
        int a = scanner.nextInt();
        System.out.print("Введите ширину параллелепипеда: ");
        int b = scanner.nextInt();
        System.out.print("Введите длину параллелепипеда: ");
        int c = scanner.nextInt();
        if (a > 0 & b > 0 & c > 0) {
            mystack1.push(new Parallelepiped(a, b, c));
            System.out.println(str);
        } else {
            tas--;
            System.out.println("Ошибка ввода!\n" + str);
        }
    }

    private static void inputPyramid(Scanner scanner, DynStack mystack1, String str) {
        System.out.print("Введите высоту пирамиды: ");
        int a = scanner.nextInt();
        System.out.println("Введите длину квадратного основания: ");
        int b = scanner.nextInt();
        if (a > 0 & b > 0) {
            mystack1.push(new Pyramid(a, b));
            System.out.println(str);
        } else {
            tas--;
            System.out.println("Ошибка ввода!\n" + str);
        }
    }
}


