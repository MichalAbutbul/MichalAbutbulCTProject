package requsttypes;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;
public class GetTest {


    @Test
    public void getTest(){
		Response res= RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(res.toString());
		System.out.println(res.toString());
		System.out.println(res.getTime());


        baseURI = "https://reqres.in/";

        given().
                queryParam("page","2'")
                .when()
                .get("/api/users")
                .then()
                .statusCode(200)
                .log().all();


    }
}