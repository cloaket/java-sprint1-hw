public class StepTracker {

    MonthData[] monthToData;

    static int goal = 10000;

    public StepTracker() {
        monthToData = new MonthData[12]; // 12 месяцев
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();

        }
    }

    class MonthData { // 30 дней в месяце
        int[] stepsOnMonth = new int[30];
        int steps = 0; // Всего шагов
        int maxCountSteps = 0; // Максимальное колличество шагов в месяц
        double averageCountSteps = 0.0; // Среднее колличество шагов в месяц
        int countDayBestSteps= 0; // Лучшая серия колличества шагов в месяц
        int series = 0; // Серия
        public int[] getStepsOnMonth() { // шаги в месяц
            return stepsOnMonth;
        }
    }

        void saveStatistics(int month, int day, int steps) {

        }

        int goalSteps(int userGoal){ // Замена цели
        StepTracker.goal = userGoal;
        return userGoal;
        }
    }



