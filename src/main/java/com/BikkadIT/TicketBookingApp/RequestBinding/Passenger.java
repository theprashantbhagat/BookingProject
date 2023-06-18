package com.BikkadIT.TicketBookingApp.RequestBinding;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Passenger {

	private String Fname;
	private String Lname;
	private String f;
	private String t;
	private String doj;
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getF() {
		return f;
	}
	public void setF(String f) {
		this.f = f;
	}
	public String getT() {
		return t;
	}
	public void setT(String t) {
		this.t = t;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "Passenger [Fname=" + Fname + ", Lname=" + Lname + ", f=" + f + ", t=" + t + ", doj=" + doj + "]";
	}
	
	
}

