package Data_Structure_and_Algorithm.financial_forcasting;

public class financialforcast {
    public static double futureValue(double currentValue,
            double growthRate,
            int years) {
        if (years == 0) {
            return currentValue;
        }
        return futureValue(
                currentValue * (1 + growthRate),
                growthRate,
                years - 1);
    }

    public static void main(String[] args) {
        double currentValue = 10000;
        double growthRate = 0.10;
        int years = 5;
        double result = futureValue(
                currentValue,
                growthRate,
                years);
        System.out.println(
                "Future Value after "
                        + years
                        + " years = "
                        + result);
    }
}