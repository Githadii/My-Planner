package com.Events;

public class UserEvent {
	
	private int id;
	private String name;
	private String date;
	private String venue;
	private String username;
	
	public UserEvent(int id, String name,String username,String date,String venue) {
	
		this.id = id;
		this.name = name;
		this.date = date;
		this.venue = venue;
		this.username=username;
	}

	public int getId() {
		return id;
	}

	public String getDate() {
		return date;
	}

	public String getName() {
		return name;
	}
	
	public String getVenue() {
		return venue;
	}

	
	public String getUsername() {
		return username;
	}
}
