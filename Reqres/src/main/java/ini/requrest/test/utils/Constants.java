package ini.requrest.test.utils;

public class Constants {

    private Constants() {
    }

    public static final String PATH_USER = "users/{id}";
    public static final String PATH_CREATE = "users";
    public static final String PATH_GET_SCHEMA = "src/test/resources/schemas/get.json";
    public static final String PATH_CREATE_SCHEMA = "src/test/resources/schemas/create.json";
    public static final String PATH_UPDATE_SCHEMA = "src/test/resources/schemas/patch.json";

    public static final String STATUS_ERROR = "The status code is not equal to expected";
    public static final String ERROR_SCHEMA = "The response schema is not equal than expected";


}
