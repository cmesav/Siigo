package in.requrest.test.utils;

import com.github.javafaker.Faker;
import in.requrest.test.models.UserInfo;

import java.util.Locale;

public class Generate {

    private Generate() {
    }

    private static final Faker FAKER = new Faker(new Locale("es"));

    public static UserInfo theInfo() {
        return new UserInfo(
                FAKER.name().fullName(),
                FAKER.job().title()
        );
    }
}
