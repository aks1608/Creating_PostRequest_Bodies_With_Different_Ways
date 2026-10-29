package DifferentWaysToCreateReqBody;

import static org.hamcrest.Matchers.equalTo;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;


public class JsonLibraryPost {
    
    @Test
    public void testUsingJsonLibrary() {
        JSONObject data=new JSONObject();
        data.put("name", "Ram");
        data.put("job", "QA");

        given()
        .contentType(ContentType.JSON)
        .body(data.toString())
        .when()
        .post("https://reqres.in/api/users")
        .then()
        .statusCode(201)
        .log().all()
        .body("name", equalTo("Ram"))
        .body("job", equalTo("QA"));
    }
}