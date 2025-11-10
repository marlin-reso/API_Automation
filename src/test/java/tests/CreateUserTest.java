package tests;

import base.BaseTest;
import pojo.CreateUserRequest;

public class CreateUserTest extends BaseTest{
	
	
	CreateUserRequest req = new CreateUserRequest();
	
	
	CreateUserRequest request = CreateUserRequest.builder()
			.name("naveen kumar")
			.email("naveen@automationlabs.com")
			.course("api testing pro")
			.build();

}
