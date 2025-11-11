package pojo;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PojoMain {
	
	public static void main(String[] args) {
		
		
		PojoCommentsMain comments = new PojoCommentsMain();
		
		comments.setId("52");
		comments.setPostId("52");
		comments.setText("Pojo main class");
		
		PojoPostsAddress address = new PojoPostsAddress();
		address.setId("52");
		address.setLikes("52");
		address.setUserId("52");
		address.setTitle("Rest Assured 01");
		
		PojoProducts products = new PojoProducts();
		products.setAvailable(true);
		products.setCategory("Honda");
		products.setId("52");
		products.setName("CBR");
		products.setPrice(3500000);
		
		PojoUsersBasic user = new PojoUsersBasic();
		user.setDesignation("General Manager");
		user.setFirstName("Ratan");
		user.setId("52");
		user.setLastName("Tata");
		
		
		Response commentResp = given().contentType(ContentType.JSON)
				.body(user).when().post("http://localhost:3000/comments");
				System.out.println(commentResp.getStatusCode());
				System.out.println(commentResp.asString());
				
				
				Response addressResp = given().contentType(ContentType.JSON)
						.body(user).when().post("http://localhost:3000/posts");
						System.out.println(addressResp.getStatusCode());
						System.out.println(addressResp.asString());
						
						
						Response productsResp = given().contentType(ContentType.JSON)
								.body(user).when().post("http://localhost:3000/products");
								System.out.println(productsResp.getStatusCode());
								System.out.println(productsResp.asString());
								
		
		
		
		Response resp = given().contentType(ContentType.JSON)
		.body(user).when().post("http://localhost:3000/users");
		System.out.println(resp.getStatusCode());
		System.out.println(resp.asString());
		
		
	}
}
