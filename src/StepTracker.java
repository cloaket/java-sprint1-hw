public class StepTracker {
    MonthData[] monthToData;

    static int goal = 10000;

    public StepTracker() {
        monthToData = new MonthData[12]; // 12 месяцев
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();

        }
    }

    public void saveStatistics(int month, int day, int steps) {
        monthToData[month].monthDays[day-1] = steps;
    }

    public void getInfo(int month) {
        int[] monthDays = monthToData[month].monthDays;
        for (int i = 0; i < monthDays.length; i++) {
            System.out.print(i+1 + " день: " + monthDays[i] + ", ");
        }
    }

    static class MonthData { // 30 дней в месяце
        int[] monthDays = new int[30];

         // Всего шагов
        int maxCountSteps = 0; // Максимальное колличество шагов в месяц
        double averageCountSteps = 0.0; // Среднее колличество шагов в месяц
        int countDayBestSteps = 0; // Лучшая серия колличества шагов в месяц
        int series = 0; // Серия

        }


    public void goalSteps(int userGoal) { // Замена цели
        StepTracker.goal = userGoal;
    }
}




