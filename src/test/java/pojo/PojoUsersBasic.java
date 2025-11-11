package pojo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PojoUsersBasic {
	
	/*
	 * Here, @Data provides getters/setters automatically.
	 * @Builder helps create the object using .builder() syntax you used.
	 */
	
	String FirstName;
	String LastName;
	String Designation;
	String Id;
	
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	
	
	

   


}
