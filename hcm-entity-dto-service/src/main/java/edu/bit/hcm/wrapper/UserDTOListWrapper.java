package edu.bit.hcm.wrapper;

import java.util.List;

import edu.bit.hcm.UserDTO;

public class UserDTOListWrapper {

	private List<UserDTO> users;
	
	public UserDTOListWrapper() {
		// TODO Auto-generated constructor stub
	} 
	
	public UserDTOListWrapper(List<UserDTO> lst) {
		this.users = lst;
	}
	
	public void setUsers(List<UserDTO> users) {
		this.users = users;
	}
	
	public List<UserDTO> getUsers() {
		return users;
	}
}
