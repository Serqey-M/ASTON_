package org.example;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class TestAPI {
    @Test
    public void GETRequestTest(){
        given()
                .baseUri("https://postman-echo.com/get")
                .contentType(ContentType.JSON)
                .when()
                .get()
                .then()
                .assertThat()
                .statusCode(200)
                .and()
                .body("args", equalTo(new HashMap<>()))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.connection", equalTo("close"))
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.content-type", equalTo("application/json"))
                .body("headers.accept", equalTo("*/*"))
                .body("headers.user-agent", equalTo("Apache-HttpClient/4.5.13 (Java/17.0.12)"))
                .body("headers.accept-encoding", equalTo("gzip,deflate"))
                .body("url", equalTo("https://postman-echo.com/get"));
    }

    @Test
    public void GETRequestWoopsTest(){
        given()
                .baseUri("https://postman-echo.com/get?foo1=bar1&foo2=bar2")
                .contentType(ContentType.JSON)
                .queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")
                .when()
                .get()
                .then()
                .assertThat()
                .statusCode(200)
                .and()
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.connection", equalTo("close"))
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.content-type", equalTo("application/json"))
                .body("headers.accept", equalTo("*/*"))
                .body("headers.user-agent", equalTo("Apache-HttpClient/4.5.13 (Java/17.0.12)"))
                .body("headers.accept-encoding", equalTo("gzip,deflate"))
                .body("url", equalTo("https://postman-echo.com/get?foo1=bar1&foo2=bar2"));
    }

    @Test
    public void POSTRawTextTest(){
        HashMap<String, String> data = new HashMap<>();
        data.put("test", "value");
        given()
                .baseUri("https://postman-echo.com/post")
                .contentType(ContentType.JSON)
                .when()
                .body(data)
                .post()
                .then()
                .assertThat()
                .statusCode(200)
                .and()
                .body("args", equalTo(new HashMap<>()))
                .body("data.test", equalTo("value"))
                .body("files", equalTo(new HashMap<>()))
                .body("form", equalTo(new HashMap<>()))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.connection", equalTo("close"))
                .body("headers.content-length", equalTo("16"))
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.accept", equalTo("*/*"))
                .body("headers.content-type", equalTo("application/json"))
                .body("headers.user-agent", equalTo("Apache-HttpClient/4.5.13 (Java/17.0.12)"))
                .body("headers.accept-encoding", equalTo("gzip,deflate"))
                .body("json.test", equalTo("value"))
                .body("url", equalTo("https://postman-echo.com/post"));
    }

    @Test
    public void POSTFormDataTest(){
        given()
                .baseUri("https://postman-echo.com/post")
                .contentType(ContentType.MULTIPART)
                .multiPart("foo1", "bar1")
                .multiPart("foo2", "bar2")
                .when()
                .post()
                .then()
                .assertThat()
                .statusCode(200)
                .and()
                .body("args", equalTo(new HashMap<>()))
                .body("data", equalTo(new HashMap<>()))
                .body("files", equalTo(new HashMap<>()))
                .body("form.foo1", equalTo("bar1"))
                .body("form.foo2", equalTo("bar2"))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.connection", equalTo("close"))
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.accept", equalTo("*/*"))
                .body("headers.user-agent", equalTo("Apache-HttpClient/4.5.13 (Java/17.0.12)"))
                .body("headers.accept-encoding", equalTo("gzip,deflate"))
                .body("json.test", equalTo(null))
                .body("url", equalTo("https://postman-echo.com/post"));
    }

    @Test
    public void PUTRequestTest(){
        given()
                .baseUri("https://postman-echo.com/put")
                .contentType(ContentType.JSON)
                .when()
                .body("This is expected to be sent back as part of response body.")
                .put()
                .then()
                .assertThat()
                .statusCode(200)
                .and()
                .body("args", equalTo(new HashMap<>()))
                .body("data", equalTo("This is expected to be sent back as part of response body."))
                .body("files", equalTo(new HashMap<>()))
                .body("form", equalTo(new HashMap<>()))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.connection", equalTo("close"))
                .body("headers.content-length", equalTo("58"))
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.accept", equalTo("*/*"))
                .body("headers.content-type", equalTo("application/json"))
                .body("headers.user-agent", equalTo("Apache-HttpClient/4.5.13 (Java/17.0.12)"))
                .body("headers.accept-encoding", equalTo("gzip,deflate"))
                .body("json.test", equalTo(null))
                .body("url", equalTo("https://postman-echo.com/put"));
    }

    @Test
    public void PATCHRequestTest(){
        given()
                .baseUri("https://postman-echo.com/patch")
                .contentType(ContentType.JSON)
                .when()
                .body("This is expected to be sent back as part of response body.")
                .patch()
                .then()
                .assertThat()
                .statusCode(200)
                .and()
                .body("args", equalTo(new HashMap<>()))
                .body("data", equalTo("This is expected to be sent back as part of response body."))
                .body("files", equalTo(new HashMap<>()))
                .body("form", equalTo(new HashMap<>()))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.connection", equalTo("close"))
                .body("headers.content-length", equalTo("58"))
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.accept", equalTo("*/*"))
                .body("headers.content-type", equalTo("application/json"))
                .body("headers.user-agent", equalTo("Apache-HttpClient/4.5.13 (Java/17.0.12)"))
                .body("headers.accept-encoding", equalTo("gzip,deflate"))
                .body("json.test", equalTo(null))
                .body("url", equalTo("https://postman-echo.com/patch"));
    }

    @Test
    public void DELETERequestTest(){
        given()
                .baseUri("https://postman-echo.com/delete")
                .contentType(ContentType.JSON)
                .when()
                .body("This is expected to be sent back as part of response body.")
                .delete()
                .then()
                .assertThat()
                .statusCode(200)
                .and()
                .body("args", equalTo(new HashMap<>()))
                .body("data", equalTo("This is expected to be sent back as part of response body."))
                .body("files", equalTo(new HashMap<>()))
                .body("form", equalTo(new HashMap<>()))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.connection", equalTo("close"))
                .body("headers.content-length", equalTo("58"))
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.accept", equalTo("*/*"))
                .body("headers.content-type", equalTo("application/json"))
                .body("headers.user-agent", equalTo("Apache-HttpClient/4.5.13 (Java/17.0.12)"))
                .body("headers.accept-encoding", equalTo("gzip,deflate"))
                .body("json.test", equalTo(null))
                .body("url", equalTo("https://postman-echo.com/delete"));
    }
}


