package testing.Payloads;

public class PojoSimpleBody {
	
	public static PojoBodyData getBodyData() {
		//All the payloads will be maintained here
		
		PojoBodyData data = new PojoBodyData();
		data.setId("3");
		data.setName("LG");
		data.setPrice(35000);
		data.setCategory("Sound System");
		
		
		return data;
	}
	
	public static PojoBodyData getChaining() {
		PojoBodyData data = new PojoBodyData();
		
		data.setId("4");
		data.setName("Sony");
		data.setPrice(60000);
		data.setCategory("Telivision");
		
		return data;
		
		
	}
	
	
	public static PojoBodyData getUpdtaed() {
		
		PojoBodyData data = new PojoBodyData();
		
		data.setId("4");
		data.setName("Sony");
		data.setPrice(70000);
		data.setCategory("Teslivision");
		
		return data;
	}

}
