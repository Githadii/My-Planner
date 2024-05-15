package com.Events;

public class Event {
	private int id;
	private String name;
	private String date;
	private String time;
	private String guestCount;
	private String hostName;
	private String category;
	private String budget;
	private String venue;
	private String photo;
	private String deco;
	private String lights;
	private String catering;
	private String des;
	private String email;
	private String number;
	private String username;
	private String planStatus;
	
	public Event(int id, String name, String date, String time, String guestCount, String hostName, String category,
			String budget, String venue, String photo, String deco, String lights, String catering, String des,
			String email, String number,String username) {
		
		this.id = id;
		this.name = name;
		this.date = date;
		this.time = time;
		this.guestCount = guestCount;
		this.hostName = hostName;
		this.category = category;
		this.budget = budget;
		this.venue = venue;
		this.photo = photo;
		this.deco = deco;
		this.lights = lights;
		this.catering = catering;
		this.des = des;
		this.email = email;
		this.number = number;
		this.username=username;
		
	}

	public int getId() {
		return id;
	}

	

	public String getName() {
		return name;
	}

	

	public String getDate() {
		return date;
	}

	
	public String getTime() {
		return time;
	}

	

	public String getGuestCount() {
		return guestCount;
	}

	

	public String getHostName() {
		return hostName;
	}

	

	public String getCategory() {
		return category;
	}

	

	public String getBudget() {
		return budget;
	}

	

	public String getVenue() {
		return venue;
	}

	

	public String getPhoto() {
		return photo;
	}

	

	public String getDeco() {
		return deco;
	}

	

	public String getLights() {
		return lights;
	}

	

	public String getCatering() {
		return catering;
	}

	

	public String getDes() {
		return des;
	}

	

	public String getEmail() {
		return email;
	}

	

	public String getNumber() {
		return number;
	}
	
	public String getUsername() {
		return username;
	}

	public String getPlanStatus() {
		return planStatus;
	}

	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}

	

	
	
	
	
	
}
