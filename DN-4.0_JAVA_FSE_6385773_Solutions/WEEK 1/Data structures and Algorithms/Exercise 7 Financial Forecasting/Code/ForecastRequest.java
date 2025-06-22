public class ForecastRequest {
    private final double initialValue;
    private final double annualRate;
    private final int years;
    public ForecastRequest(double initialValue, double annualRate, int years) {
        if (initialValue <= 0) {
            throw new IllegalArgumentException("Initial value must be positive");
        }
        if (annualRate < -1 || annualRate > 1) {
            throw new IllegalArgumentException("Rate must be between -1 and 1");
        }
        if (years < 0) {
            throw new IllegalArgumentException("Years cannot be negative");
        }
        this.initialValue = initialValue;
        this.annualRate = annualRate;
        this.years = years;
    }
    public double getInitialValue() { return initialValue; }
    public double getAnnualRate() { return annualRate; }
    public int getYears() { return years; }
}
