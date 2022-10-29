package in.requrest.test.exceptions;

public class StatusCodeError extends AssertionError {
    public StatusCodeError(String message, Throwable cause) {
        super(message, cause);
    }
}
