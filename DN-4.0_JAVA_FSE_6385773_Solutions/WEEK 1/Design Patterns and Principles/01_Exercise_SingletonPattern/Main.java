public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        logger1.log("First log message from logger1");
        logger2.log("Second log message from logger2");

        // Both "==" and hashCode Verification
        System.out.println("\n[Verification] Same instance? " + (logger1 == logger2));
        System.out.println("Hash codes - logger1: " + logger1.hashCode() + 
                         ", logger2: " + logger2.hashCode());

        System.out.println("\n[Practical Demo]");
        logDatabaseOperation();
        logNetworkRequest();
    }
    private static void logDatabaseOperation() {
        Logger dbLogger = Logger.getInstance();
        dbLogger.log("Database query executed");
    }
    private static void logNetworkRequest() {
        Logger netLogger = Logger.getInstance();
        netLogger.log("API call to /users completed");
    }
}