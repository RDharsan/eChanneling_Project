package com;

public class Prescription {

	private int id;
	private int pid;
	private String email;
	private String med1;
	private String med2;
	private String med3;
	private String oth;
	public Prescription(int id, int pid, String email, String med1, String med2, String med3, String oth) {
		super();
		this.id = id;
		this.pid = pid;
		this.email = email;
		this.med1 = med1;
		this.med2 = med2;
		this.med3 = med3;
		this.oth = oth;
	}
	public int getId() {
		return id;
	}
	public int getPid() {
		return pid;
	}
	public String getEmail() {
		return email;
	}
	public String getMed1() {
		return med1;
	}
	public String getMed2() {
		return med2;
	}
	public String getMed3() {
		return med3;
	}
	public String getOth() {
		return oth;
	}
	
	
}
