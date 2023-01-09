package com.example.demo.initbinder.dto;

public class CreditCard {
	
	
	private String  Fnumber;
	private String  Snumber;
	private String  Tnumber;
	private String  fourthnumber;
	private String  fifthnumber;
	public String getFnumber() {
		return Fnumber;
	}
	public void setFnumber(String fnumber) {
		Fnumber = fnumber;
	}
	public String getSnumber() {
		return Snumber;
	}
	public void setSnumber(String snumber) {
		Snumber = snumber;
	}
	public String getTnumber() {
		return Tnumber;
	}
	public void setTnumber(String tnumber) {
		Tnumber = tnumber;
	}
	public String getFourthnumber() {
		return fourthnumber;
	}
	public void setFourthnumber(String fourthnumber) {
		this.fourthnumber = fourthnumber;
	}
	public String getFifthnumber() {
		return fifthnumber;
	}
	public void setFifthnumber(String fifthnumber) {
		this.fifthnumber = fifthnumber;
	}
	@Override
	public String toString() {
		return "CreditCard [Fnumber=" + Fnumber + ", Snumber=" + Snumber + ", Tnumber=" + Tnumber + ", fourthnumber="
				+ fourthnumber + ", fifthnumber=" + fifthnumber + ", getFnumber()=" + getFnumber() + ", getSnumber()="
				+ getSnumber() + ", getTnumber()=" + getTnumber() + ", getFourthnumber()=" + getFourthnumber()
				+ ", getFifthnumber()=" + getFifthnumber() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	

}
