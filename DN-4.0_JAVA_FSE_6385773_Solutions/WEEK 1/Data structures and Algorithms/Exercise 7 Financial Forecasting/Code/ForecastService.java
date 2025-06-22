import java.util.Objects;
// Service that executes financial forecasts using different strategies
public class ForecastService {
    private final ForecastStrategy strategy;

    public ForecastService(ForecastStrategy strategy) {
        this.strategy = Objects.requireNonNull(strategy, "Strategy cannot be null");
    }

    public double predict(ForecastRequest request) {
        Objects.requireNonNull(request, "Request cannot be null");
        return strategy.calculate(request);
    }
}