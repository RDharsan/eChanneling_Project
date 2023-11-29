package com;

public class Doctor {

	private int id;
	private String name;
	private String email;
	private String phone;
	private String dOB;
	private String nic;
	private String branch;
	private String password;
	private String specialization;
	public Doctor(int id, String name, String email, String phone, String dOB, String nic, String branch,
			String password,String specialization) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.dOB = dOB;
		this.nic = nic;
		this.branch = branch;
		this.password = password;
		this.specialization=specialization;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getPhone() {
		return phone;
	}
	public String getdOB() {
		return dOB;
	}
	public String getNic() {
		return nic;
	}
	public String getBranch() {
		return branch;
	}
	public String getPassword() {
		return password;
	}
	public String getSpecialization() {
		return specialization;
	}

	
	
}
