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

}
