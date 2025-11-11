package pojo;

public class PojoProducts {
	
	/*
	 * "id": "1",
        "name": "MacBook Air",
        "category": "Laptop",
        "price": 110000,
        "available": true
	 */
	
	String id;
	String name;
	String category;
	int price;
	boolean available;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}

}
