import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StepTracker stepTracker = new StepTracker();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Привет! Я счётчик шагов");

        System.out.println("Ваша цель шагов в месяц?");
        int stepsMonth = scanner.nextInt();

        while (true) {
            printMenu();
            int command = scanner.nextInt();

            if (command == 1) {
                System.out.println("За какой день вы хотите ввести колличество шагов: 1-ПН, 2-ВТ, 3-СР, 4-ЧТ, 5-ПТ, 6-СБ, 7-ВС?");
                int day = scanner.nextInt();
                System.out.println("Введите колличество шагов:");
                int numberOfSteps = scanner.nextInt();
                stepsMonth = stepsMonth - numberOfSteps;
                System.out.println("Значение сохранено! Ваше коллисество шагов за месяц: " + stepsMonth);
            } else if (command == 2) {
                System.out.println("Выберите, за какой месяц вы хотите получить статистику: 1-Январь, 2-Февраль, 3-Март, 4-Апрель, 5-Май, 6-Июнь, 7-Июль, 8-Август, 9-Сентябрь, 10-Октябрь, 11-Ноябрь, 12-Декабрь");
                int month = scanner.nextInt();
                System.out.println(stepsMonth)
            }
        } else if (command == 3) {
            stepsmonth = stepTracker.newstepsMonth();
            System.out.println("Цель по количеству шагов изменено.");
            System.out.println("Ваша новая цель - " + stepsMonth + " в день!");
        }
    } else if(command ==4)

    {
        System.out.println("Выйти из приложения");
        break;
    } else{
        System.out.println("Программа завершена");
              }

                }
                }

    private static void printMenu() {
        System.out.println("Что вы хотите сделать? ");
        System.out.println("1. Ввести количество шагов за определённый день");
        System.out.println("2. Напечатать статистику за определённый месяц");
        System.out.println("3. Изменить цель по количеству шагов в день");
        System.out.println("4. Выход.");
    }
}