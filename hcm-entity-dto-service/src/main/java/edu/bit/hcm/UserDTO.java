package edu.bit.hcm;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDTO {

	private Long userId;
	private String username;
	private String password;
	private Long timeStamp;
	private boolean active;
	private Integer userRoleId;

	public UserDTO() {
		// TODO Auto-generated constructor stub
	}

	public UserDTO(Long userId, String username, String password, Long timeStamp, boolean active, Integer userRoleId) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.timeStamp = timeStamp;
		this.active = active;
		this.userRoleId = userRoleId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Integer getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(Integer userRoleId) {
		this.userRoleId = userRoleId;
	}

}
