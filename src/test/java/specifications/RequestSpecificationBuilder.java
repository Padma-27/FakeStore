package specifications;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import utils.ConfigReader;

public class RequestSpecificationBuilder {

    public static RequestSpecification getRequestSpec() {

        return new RequestSpecBuilder()
                .setBaseUri(
                        ConfigReader.getProperty("base.url"))
                .addHeader("Content-Type",
                        "application/json")
                .build();
    }
}