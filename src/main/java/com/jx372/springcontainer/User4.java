package com.jx372.springcontainer;

public class User4 {
	private Long no;
	private String name;
	private String email;
	
	public void setNo(Long no) {
		this.no = no;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "User4 [no=" + no + ", name=" + name + "]";
	}
	
	
}
