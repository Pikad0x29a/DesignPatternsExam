package utils;

public class TransactionLogger {
    private static TransactionLogger instance;

    private TransactionLogger() {
        // Initialisation du logger
    }

    public static synchronized TransactionLogger getInstance() {
        if (instance == null) {
            instance = new TransactionLogger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
