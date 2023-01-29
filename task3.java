/*
Реализовать простой калькулятор (операции + - / * )
Пример работы программы:

Введите число 1: 2
Введите число 2: 3
Введите операцию: +
Ответ: 5
Введите число 1: 2
Введите число 2: 3
Введите операцию: а
Ответ: Такой операции нет
*/
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число a: ");
        int a = iScanner.nextInt();
        System.out.printf("Введите число b: ");
        int b = iScanner.nextInt();
        System.out.printf("Введите операцию: ");
        char symbol = iScanner.next().charAt(0);
        if (symbol == '+') {
            int result = a + b;
            System.out.print(result);
        }
        else {
            if (symbol == '-') {
                int result = a - b;
                System.out.print(result);
            }
            else {
                if (symbol == '*') {
                    int result = a * b;
                    System.out.print(result);
                } 
                else {
                    if (symbol == '/') {
                        int result = a / b;
                        System.out.print(result);
                    }
                    else {
                        System.out.println("Несуществующая операция");
                    }
                }
            }
        }
        iScanner.close();
    }
}
