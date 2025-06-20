package code;
import java.util.HashMap;
import java.util.Map;

public class Main {

    private static Map<Integer, Double> memo = new HashMap<>();

    public static double predictFutureValue(double initialValue, double growthRate, int years) {
        if (years == 0) return initialValue;

        if (memo.containsKey(years)) {
            return memo.get(years);
        }

        double result = predictFutureValue(initialValue, growthRate, years - 1) * (1 + growthRate);
        memo.put(years, result);
        return result;
    }

    public static void main(String[] args) {
        double initialValue = 10000;
        double growthRate = 0.08;
        int years = 5;

        double futureValue = predictFutureValue(initialValue, growthRate, years);
        System.out.printf("Predicted future value after %d years: %.2f\n", years, futureValue);
    }
}

