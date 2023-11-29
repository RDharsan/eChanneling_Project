package com;

public class patientSymtom {

	private int pid;
	private String name;
	private String appId;
	private String email;
	private String ps1;
	private String ps2;
	private String ps3;
	private String ps4;
	private String other;
	public patientSymtom(int pid, String name, String appId, String email, String ps1, String ps2, String ps3,
			String ps4, String other) {
		super();
		this.pid = pid;
		this.name = name;
		this.appId = appId;
		this.email = email;
		this.ps1 = ps1;
		this.ps2 = ps2;
		this.ps3 = ps3;
		this.ps4 = ps4;
		this.other = other;
	}
	public int getPid() {
		return pid;
	}
	public String getName() {
		return name;
	}
	public String getAppId() {
		return appId;
	}
	public String getEmail() {
		return email;
	}
	public String getPs1() {
		return ps1;
	}
	public String getPs2() {
		return ps2;
	}
	public String getPs3() {
		return ps3;
	}
	public String getPs4() {
		return ps4;
	}
	public String getOther() {
		return other;
	}
	
}
