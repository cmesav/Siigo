package in.reqres.test.setup;

import in.requrest.test.models.UserInfo;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class ModelDefinitions {

    @DataTableType
    public UserInfo employeeEntry(Map<String, String> entry) {
        return new UserInfo(
                entry.get("name"),
                entry.get("job")
        );

    }
}
