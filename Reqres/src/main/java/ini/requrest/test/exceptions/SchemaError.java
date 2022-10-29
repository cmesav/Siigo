package ini.requrest.test.exceptions;

public class SchemaError extends AssertionError {

    public SchemaError(String message, Throwable cause) {
        super(message, cause);
    }
}
