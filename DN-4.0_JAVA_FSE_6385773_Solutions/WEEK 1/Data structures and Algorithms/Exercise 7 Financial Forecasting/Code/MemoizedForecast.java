// Recursive forecast with memoization optimization
public class MemoizedForecast implements ForecastStrategy {
    private double[] memo;

    @Override
    public double calculate(ForecastRequest request) {
        memo = new double[request.getYears() + 1];
        memo[0] = request.getInitialValue();
        return forecast(request.getAnnualRate(), request.getYears());
    }

    private double forecast(double rate, int years) {
        if (memo[years] != 0) {
            return memo[years];
        }
        
        double previous = forecast(rate, years - 1);
        memo[years] = previous * (1 + rate);
        return memo[years];
    }
}