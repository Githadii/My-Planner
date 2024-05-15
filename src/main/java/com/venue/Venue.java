package com.venue;

public class Venue {
	private int vid;
	private String vname;
	private String location;
	private String owner;
	private int seating;
	private String price;
	private String description;
	private String link;
	private String uname;
	
	public Venue(int vid, String vname, String location, String owner, int seating, String price, String description,String link,String uname){
		super();
		this.vid = vid;
		this.vname = vname;
		this.location = location;
		this.owner = owner;
		this.seating = seating;
		this.price = price;
		this.description = description;
		this.link = link;
		this.uname = uname;
	}

	public int getVid() {
		return vid;
	}

	public String getVname() {
		return vname;
	}

	public String getLocation() {
		return location;
	}

	public String getOwner() {
		return owner;
	}

	public int getSeating() {
		return seating;
	}

	public String getPrice() {
		return price;
	}

	public String getDescription() {
		return description;
	}

	public String getLink() {
		return link;
	}

	public String getUname() {
		return uname;
	}

	
}



