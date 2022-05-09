import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StepTracker stepTracker = new StepTracker();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Привет! Я счётчик шагов");

        System.out.println("Цель шагов в месяц?");
       int stepsMonth = scanner.nextInt();

        while(true) {
            printMenu();
            int command = scanner.nextInt()

            if (command == 1) {
                System.out.println("Введите количество шагов за день ");
                int steps = scanner.nextInt();
            if (command == 2) {
                System.out.println("Напечатать статистику за определенный месяц");
            }
            if (command == 3) {
                System.out.println("Изменить цель по колличеству шагов в день");
            }
            if (command == 4) {
                System.out.println("Выйти из приложения");
            }
            printMenu(); // печатем меню ещё раз перед завершением предыдущего действия
            userInput = scanner.nextInt(); // повторное считывание данных от пользователя
        }
        System.out.println("Программа завершена");
    }

    private static void printMenu() {
        System.out.println("Что вы хотите сделать? ");
        System.out.println("1. Ввести количество шагов за определённый день");
        System.out.println("2. Напечатать статистику за определённый месяц");
        System.out.println("3. Изменить цель по количеству шагов в день");
        System.out.println("4. Выход.");
    }
}