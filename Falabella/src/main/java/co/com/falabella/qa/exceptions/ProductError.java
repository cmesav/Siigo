package co.com.falabella.qa.exceptions;

public class ProductError extends AssertionError {
    public ProductError(String message, Throwable cause) {
        super(message, cause);
    }
}
