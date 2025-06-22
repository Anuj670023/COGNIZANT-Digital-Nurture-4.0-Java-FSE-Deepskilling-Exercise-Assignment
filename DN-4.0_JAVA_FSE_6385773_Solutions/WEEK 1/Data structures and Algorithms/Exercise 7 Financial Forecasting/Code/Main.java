// Demo application for financial forecasting system
public class Main {
    public static void main(String[] args) {
        // Create a forecast request
        ForecastRequest request = new ForecastRequest(10000, 0.05, 5);
        // Test different strategies
        testStrategy(new RecursiveForecast(), "Recursive", request);
        testStrategy(new IterativeForecast(), "Iterative", request);
        testStrategy(new MemoizedForecast(), "Memoized", request);
    }
    private static void testStrategy(ForecastStrategy strategy, String name, ForecastRequest request) {
        ForecastService service = new ForecastService(strategy);
        long startTime = System.nanoTime();
        double result = service.predict(request);
        long duration = System.nanoTime() - startTime;
        System.out.printf("%s Forecast:\n", name);
        System.out.printf("  Future value after %d years: Rs. %,.2f\n", 
                         request.getYears(), result);
        System.out.printf("  Calculation time: %d ns\n\n", duration);
    }
}