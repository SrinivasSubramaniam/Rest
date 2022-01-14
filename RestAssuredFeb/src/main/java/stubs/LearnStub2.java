package stubs;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static com.github.tomakehurst.wiremock.client.WireMock.*;


public class LearnStub2 {
	
//	@BeforeMethod
//	public void postStub(){
//		stubFor(post("/api/now/table/incident")
//				.willReturn(aResponse()
//				.withStatus(201)
//				.withBody("{\"Name\" : \"Wire Mock\"}")
//				.withHeader("Content-Type", "application/json")));
//	}
	
	

	@Test
	public void mockPostWithBody(){
		RestAssured.baseURI="http://localhost:8080/api/now/table/incident";
		//RestAssured.authentication=RestAssured.basic("admin", "Srinisubu9006#");
		RestAssured.authentication=RestAssured.oauth2("2Obr4sQoqvKOMx15owwhao9KR5VEso26ub5Xvkc1OtgH6Yiw-jREdyYMH9AEHIV4dUKsb3bGId_qmh9QXkGWtw");
		Response response = RestAssured
		.given()
		.contentType(ContentType.JSON)
		.post()
		.then()
		.contentType(ContentType.JSON)
		.extract()
		.response();
		JsonPath jsonPath = response.jsonPath();
		
		System.out.println(response.body().asString());
		
	}

}
