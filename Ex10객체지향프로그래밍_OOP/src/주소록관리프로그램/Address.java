package 주소록관리프로그램;

import java.util.ArrayList;

public class Address {

	//설계도 : 실행 X
	
	private String name ; 
	private int age ; 
	private String phoneNumber ; 
	
	public Address(String name, int age, String phoneNumber) {
		
		this.name = name ;
		this.age = age; 
		this.phoneNumber = phoneNumber ;
		
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	

	

	

}
