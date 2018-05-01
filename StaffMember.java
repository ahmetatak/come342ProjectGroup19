
//Author: Onur Bayrak
//Date: 01/05/2018

import java.util.ArrayList;

public abstract  class  StaffMember {
	
	private int StaffNo;
	private String StaffName,StaffStartDate,StaffEmailAddress;
	
	
	public StaffMember(int staffNo, String staffName, String staffStartDate, String staffEmailAddress) {
		super();
		StaffNo = staffNo;
		StaffName = staffName;
		StaffStartDate = staffStartDate;
		StaffEmailAddress = staffEmailAddress;
	}
	
	
	public abstract void type();
	
	
	public void getStaffDetails() {
		
		System.out.println("Calisan Numarasi: " + StaffNo);

		System.out.println("Calisan Ismi: " +StaffName);

		System.out.println("Calisan Ise Baslama Tarihi: " +StaffStartDate);

		System.out.println("Calisan Email Adresi: " +StaffEmailAddress);
	}
	
	
	
	public int getStaffNo() {
		return StaffNo;
	}
	public void setStaffNo(int staffNo) {
		StaffNo = staffNo;
	}
	public String getStaffName() {
		return StaffName;
	}
	public void setStaffName(String staffName) {
		StaffName = staffName;
	}
	public String getStaffStartDate() {
		return StaffStartDate;
	}
	public void setStaffStartDate(String staffStartDate) {
		StaffStartDate = staffStartDate;
	}
	public String getStaffEmailAddress() {
		return StaffEmailAddress;
	}
	public void setStaffEmailAddress(String staffEmailAddress) {
		StaffEmailAddress = staffEmailAddress;
	}


	
		
}