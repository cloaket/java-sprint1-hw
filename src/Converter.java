/*В этом классе осуществляется преобразование шагов в километры и калории.
  Для подсчёта дистанции можно считать, что один шаг равен 75 см.
  Для подсчёта количества сожжённых килокалорий можно считать, что 1 шаг = 50 калорий, 1 килокалория = 1 000 калорий.*/

public class Converter {
    double lengthStep = 0.00075;
    double kilocaloriesStep = 0.05;

    public double convertKm(int steps) {
        return steps * lengthStep;
    }

    public double convertKilocalories(int steps) {
        return steps * kilocaloriesStep;
    }
}

