package tests;

import base.BaseTest;
import pojo.PojoUsersBasic;

public class CreateUserTest extends BaseTest{
	
	
	PojoUsersBasic req = new PojoUsersBasic();
	
	
	PojoUsersBasic request = PojoUsersBasic.builder()
			.name("naveen kumar")
			.email("naveen@automationlabs.com")
			.course("api testing pro")
			.build();

}
