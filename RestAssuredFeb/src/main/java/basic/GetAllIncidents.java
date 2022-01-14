package basic;



import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetAllIncidents {
	
	@Test
	public void createIncident(){
		RestAssured.baseURI="https://dev63278.service-now.com/api/now/table/change_request";
		RestAssured.authentication=RestAssured.basic("admin", "zQgZmL8dIM6p");
		//RestAssured.authentication=RestAssured.oauth2("2Obr4sQoqvKOMx15owwhao9KR5VEso26ub5Xvkc1OtgH6Yiw-jREdyYMH9AEHIV4dUKsb3bGId_qmh9QXkGWtw");
		Response response = RestAssured
		.given()
		.contentType(ContentType.JSON)
		.queryParam("number", "CHG0000079")
		.log().all()
		.get();
		String s = response.jsonPath().getString("result.number");
		if (s.equals("CHG0000079")){
			System.out.println("###It is true");
		}
		System.out.println(s);
		
		//System.out.println(response.body().asString());
		
	}

}
