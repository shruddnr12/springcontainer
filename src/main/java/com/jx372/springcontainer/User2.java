package com.jx372.springcontainer;

public class User2 {
	private String name;
	public User2( String name ){  //명시적으로 생성자를 만들경우 기본생성자가 없으므로 에러를 발생한다.
		this.name = name;
	}
	@Override
	public String toString() {
		return "User2 [name=" + name + "]";
	}
	
}
