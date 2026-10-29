package DifferentWaysToCreateReqBody;

import java.util.HashMap;

import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;


public class post {

    @Test
    public void testUsingHashMap() {
        HashMap data=new HashMap();
        data.put("name", "John");
        data.put("job", "tester");

        given()
            .contentType(ContentType.JSON)
            .body(data)
        .when()
            .post("https://reqres.in/api/users")
        .then()
            .statusCode(201)
            .log().all()
            .body("name", equalTo("John"))
            .body("job", equalTo("tester"));
    }
}