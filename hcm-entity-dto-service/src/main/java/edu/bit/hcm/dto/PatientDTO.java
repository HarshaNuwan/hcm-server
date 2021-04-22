package edu.bit.hcm.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PatientDTO {
	
	private Long pid;
	private String nic;
	private String first_name;
	private String last_name;
	
	public PatientDTO() {
		// TODO Auto-generated constructor stub
	}

	public PatientDTO(Long pid, String nic, String first_name, String last_name) {
		super();
		this.pid = pid;
		this.nic = nic;
		this.first_name = first_name;
		this.last_name = last_name;
	}

	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getNic() {
		return nic;
	}

	public void setNic(String nic) {
		this.nic = nic;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	

}
