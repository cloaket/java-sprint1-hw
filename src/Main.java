/*  Оно должно предоставлять следующий функционал:
    Консольный интерфейс для управления программой;1
    Хранение данных о количестве пройденных шагов за несколько месяцев;
    Ввод вашей цели по количеству шагов в день;
    Ввод пройденного количества шагов за день;
    Вывод статистики за определённый месяц.       */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();

            int userInput = scanner.nextInt();

            if (userInput == 1) {
                // код
            } else if (userInput == 2) {
                // код
            } else if (userInput == 3) {
                // код
            } else if (userInput == 0) {
                System.out.println("Программа завершена");
                break;
            } else {
                System.out.println("Вы ввели: " + userInput + ", такой команды пока нет.\n");
            }
        }
    }

    private static void printMenu() {
        System.out.println("Выберете пункт из списка: \n");
        System.out.println("1 - Ввести количество шагов за определённый день");
        System.out.println("2 - Напечатать статистику за определённый месяц");
        System.out.println("3 - Изменить цель по количеству шагов в день");
        System.out.println("0 - Выйти из приложения\n");
    }
}
