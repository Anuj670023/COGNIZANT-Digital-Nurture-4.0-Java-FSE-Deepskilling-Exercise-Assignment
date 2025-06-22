// Iterative implementation of financial forecasting
public class IterativeForecast implements ForecastStrategy {
    @Override
    public double calculate(ForecastRequest request) {
        double result = request.getInitialValue();
        double rate = request.getAnnualRate();
        
        for (int i = 0; i < request.getYears(); i++) {
            result *= (1 + rate);
        }
        return result;
    }
}