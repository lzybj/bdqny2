package com.bdqn.hibernate.res;

public class ResObj {
	private String filmname = "";
	private String filmtype = "";
	private String actor = "";
	private String director = "";
	private Double ticketprice;
	public ResObj(String filmname, String filmtype, String actor,
			String director, Double ticketprice) {
		super();
		this.filmname = filmname;
		this.filmtype = filmtype;
		this.actor = actor;
		this.director = director;
		this.ticketprice = ticketprice;
	}
	public String getFilmname() {
		return filmname;
	}
	public void setFilmname(String filmname) {
		this.filmname = filmname;
	}
	public String getFilmtype() {
		return filmtype;
	}
	public void setFilmtype(String filmtype) {
		this.filmtype = filmtype;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public Double getTicketprice() {
		return ticketprice;
	}
	public void setTicketprice(Double ticketprice) {
		this.ticketprice = ticketprice;
	}
}
