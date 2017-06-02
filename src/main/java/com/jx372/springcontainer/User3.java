package com.jx372.springcontainer;

public class User3 {
	private Long no;
	private String name;

	public User3(Long no, String name){
		this.no = no;
		this.name = name;
	}

	@Override
	public String toString() {
		return "User3 [no=" + no + ", name=" + name + "]";
	}
	
}
