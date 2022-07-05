import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();

        printMenu();
        int userInput = scanner.nextInt();


        while (userInput != 0) {
            // обработка разных случаев
            int month;
            int day;
            int steps;
            switch (userInput){

                case 1 :
                    while (true) { // Узнаем месяц
                        System.out.println("Укажите месяц: ");
                        month =  scanner.nextInt();
                        if (month < 0 || month > 11){
                            System.out.println("Введено не корректное значение");
                        }
                        else break;
                    }
                    while (true) { // Узнаем день
                        System.out.println("Укажите день: ");
                        day =  scanner.nextInt();
                        if (day < 0 || day> 30){
                            System.out.println("Введено не корректное значение");
                        }
                        else break;
                    }
                    while (true) {
                        System.out.println("Укажите кол-во шагов: ");
                        steps =  scanner.nextInt();
                        if (steps < 0){
                            System.out.println("Введено не корректное значение");
                        }
                        else break;
                    }
                    stepTracker.saveStatistics(month, day, steps);
                    break;
                case 2 :
                    while (true){
                        System.out.println("За какой месяц статистику: ");
                        month = scanner.nextInt();
                        if (month < 0 || month > 11) {
                            System.out.println("Введено не корректное значение");
                        }
                        else break;
                    }
                    stepTracker.getInfo(month);
                    break;
                case 3:
                    System.out.println("Укажите цель: ");
                    int userGoal =  scanner.nextInt();
                    stepTracker.goalSteps(userGoal);
                default:
                    System.out.println("Введено не корректное значение");
                    break;
            }
            printMenu(); // печатаем меню ещё раз перед завершением предыдущего действия
            userInput = scanner.nextInt(); // повторное считывание данных от пользователя
        }
        System.out.println("Программа завершена");
    }

    public static void printMenu() {
        System.out.println("\n Выберете пункт из списка: \n");
        System.out.println("1 - Ввести количество шагов за определённый день");
        System.out.println("2 - Напечатать статистику за определённый месяц");
        System.out.println("3 - Изменить цель по количеству шагов в день");
        System.out.println("0 - Выйти из приложения");
    }
}

