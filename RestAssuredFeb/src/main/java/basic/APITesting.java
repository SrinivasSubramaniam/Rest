package basic;

import java.util.List;

import cucumber.api.java.it.Data;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class APITesting {
	
	public static void main(String[] args) {
		RestAssured.baseURI="https://samples.openweathermap.org/data/2.5/";
		//RestAssured.authentication=RestAssured.basic("hari.radhakrishnan@testleaf.com","1tFDjllY3jwISCost2cZ8C09");
		 Response response = RestAssured
		.given()
		.accept(ContentType.JSON)
		//.log()
		//.all()
		.queryParam("q", "London,uk")
		.queryParam("appid", "2b1fd2d7f77ccf1b7de9b441571b39b8")
		.get("/weather");
		
		 System.out.println(response.jsonPath().getList("coord"));
		/*System.out.println(response.getStatusCode());
		System.out.println(response.getContentType());
		//System.out.println(response.getHeaders());
		List<Header> asList = response.getHeaders().asList();
		for (Header header : asList) {
			System.out.println(header.getName()+ " ----> "+header.getValue());
			//System.out.println(header.getValue());
		}*/
	}

}
