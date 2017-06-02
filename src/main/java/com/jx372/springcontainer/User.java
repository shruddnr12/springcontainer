package com.jx372.springcontainer;

import java.util.List;

public class User {
	private String name;
	private Friend friend;
	private List<String> friends;
	

	public User(String name){
		this.name = name;
	}
	
	public Friend getFriend() {
		return friend;
	}

	public void setFriend(Friend friend) {
		this.friend = friend;
	}

	
	
	public List<String> getFreinds() {
		return friends;
	}

	public void setFreinds(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", friend=" + friend + ", friends=" + friends + "]";
	}
	
}
