package basic;

import io.restassured.RestAssured;
import io.restassured.authentication.AuthenticationScheme;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static org.hamcrest.Matchers.*;

import java.io.File;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import static io.restassured.module.jsv.JsonSchemaValidator.*;

public class Sample {

	public static void main(String[] args) {
		
		RestAssured.baseURI="";	
		
		RestAssured.authentication=RestAssured.basic("ss118", "");
		
		
		
		
		Response response = RestAssured.get();
		
		System.out.println(response.getStatusCode());
		
		RestAssured
		.given()
		.contentType(ContentType.JSON);
		
		response.prettyPrint();
		 RestAssured
		.given()
		.queryParam("", "")
		.get()
		.getHeaders();
		 
		 Headers headers = RestAssured
			.given()
			.queryParam("", "")
			.get()
			.getHeaders();
		 for (Header header : headers) {
			//header.ge
			 
			
		}
		
		
		RestAssured.given().queryParam("", "").get();
		RequestSpecification queryParam = RestAssured.given().queryParam("", "");
		queryParam.get();
		
		JsonPath jsonPath = RestAssured.given().queryParam("", "").get().jsonPath();
		ObjectMapper obj=new ObjectMapper();
		ObjectNode cbj = obj.createObjectNode();
		Object object = jsonPath.get("result.createdBy");
		List<Object> list = RestAssured.given().header("","").queryParam("", "").get().jsonPath().getList("");
		
		
		
		
		
		RestAssured.given().queryParam("", "").get().then().assertThat();
		RestAssured.given().queryParam("", "").get().then().contentType(ContentType.JSON).statusCode(200);
				
		RestAssured.given().contentType(ContentType.JSON).body("");
		
		
		Response response2 = RestAssured.given().queryParam("", "").get().then().contentType(ContentType.JSON).statusCode(200).extract().response();
		
		
		 Response response3 = RestAssured.given()
				 .queryParam("", "")
				 .get()
				 .then()
				 .assertThat()
				 .body("", equalTo(""))
				 .extract()
				 .response();
		 
		
		RestAssured.given().contentType(ContentType.JSON).post().then()
		.assertThat().body(matchesJsonSchema(""));
		
		
		
		
		
		

	}

}
