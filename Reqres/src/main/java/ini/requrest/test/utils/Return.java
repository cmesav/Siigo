package ini.requrest.test.utils;

import static ini.requrest.test.utils.Constants.*;

public class Return {

    private Return() {
    }

    public static String path(String verb){
        switch (verb) {
            case "Get":
                return PATH_GET_SCHEMA;
            case "Post":
                return PATH_CREATE_SCHEMA;
            case "Update":
                return PATH_UPDATE_SCHEMA;
            default:
                break;
        }
        return "";

    }
}
