public class StepTracker {
    Converter converter = new Converter();
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
        int[] steps = monthToData[month].monthDays;
        int sum = 0;
        int maxCountSteps = 0;
        double average = 0.0;
        int bestSeries = 0;
        int series = 0;
        for (int i = 0; i < steps.length; i++) {
            System.out.print(i+1 + " день: " + steps[i] + ", ");
            sum += steps[i];
            average = (double) sum / steps.length;
            if (steps[i] > maxCountSteps) {
                maxCountSteps = steps[i];
            }
            if (steps[i] >= goal) {
                ++series ;
                if (series  > bestSeries) {
                    bestSeries = series ;
                }
                else {
                    series = 0;
                }
            }
        }
        System.out.println("\nОбщее кол-во шагов: " + sum);
        System.out.println("Максимальное ко-во шагов за месяц: " + maxCountSteps);
        System.out.println("Среднее ко-во шагов за месяц: " + average);
        System.out.println("Пройденная дистанция (в км): " + converter.convertKm(sum));
        System.out.println("Количество сожжённых килокалорий: " + converter.convertKcal(sum));
        System.out.println("Лучшая серия: " + series);
    }


    static class MonthData { // 30 дней в месяце
        int[] monthDays = new int[30];
    }


    public void goalSteps(int userGoal) { // Замена цели
        StepTracker.goal = userGoal;
    }
}




