package restfulBooker;

import java.io.File;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import net.minidev.json.parser.JSONParser;

public class RestFulBook {
	
	@Test
	public void oauth() throws JsonProcessingException{
		RestAssured.baseURI="https://restful-booker.herokuapp.com";
		Response auth = RestAssured
		.given()//.log().all()
		.contentType(ContentType.JSON)
		.body(tokenBodyPojo())
		//.body(new File("./data/Oauth.json"))
		.post("auth");
		
		
		JsonPath jsonPath = auth.jsonPath();
		String token = jsonPath.get("token");
		System.out.println("token is " + token);
	}
	
	public ObjectNode tokenBody() throws JsonProcessingException{
		ObjectMapper obj = new ObjectMapper();
		ObjectNode objNode = obj.createObjectNode();
		objNode.put("username", "admin");
		objNode.put("password", "password123");
		String writeValueAsString = obj.writerWithDefaultPrettyPrinter().writeValueAsString(objNode);
		System.out.println(writeValueAsString);
		return objNode;
		
	}
	public Oauth tokenBodyPojo() throws JsonProcessingException {
		Oauth oauth=new Oauth();
		oauth.setUsername("admin");
		oauth.setPassword("password123");
		
		/*String writeValueAsString = new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(oauth);
		System.out.println("String value is"+writeValueAsString);*/
		
		return oauth;
		
		
	}

}
