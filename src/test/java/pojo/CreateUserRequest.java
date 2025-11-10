package pojo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateUserRequest {
	
	/*
	 * Here, @Data provides getters/setters automatically.
	 * @Builder helps create the object using .builder() syntax you used.
	 */
	
	 String name;
	 String email;
	 String course;
	
	

   


}
