package base;

import org.testng.annotations.BeforeClass;

import io.restassured.RestAssured;
import utils.ConfigReader;

public class BaseTest {
	
	@BeforeClass
    public void setup() {
        RestAssured.baseURI = ConfigReader.getProperty("baseURI");
        RestAssured.basePath = ConfigReader.getProperty("basePath");
    }

}
