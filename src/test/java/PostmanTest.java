import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.withArgs;
import static org.hamcrest.core.IsEqual.equalTo;

public class PostmanTest {

    @Test
    void newTest() {
        // Given - When - Then
// Предусловия
        given()
                .log().all()
                .baseUri("https://postman-echo.com")
                .body("some data") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
                .prettyPeek()
// Проверки
                .then()
                .statusCode(100)
                .body("data", equalTo("some data"))
        ;
    }
}
