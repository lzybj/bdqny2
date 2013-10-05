package com.bdqn.hibernate.domain;

/**
 * FilmInfo entity. @author MyEclipse Persistence Tools
 */

public class FilmInfo implements java.io.Serializable {

	// Fields

	private Integer filmid;
	private FilmType filmType;
	private String filmname;
	private String actor;
	private String director;
	private Double ticketprice;

	// Constructors

	/** default constructor */
	public FilmInfo() {
	}

	/** full constructor */
	public FilmInfo(FilmType filmType, String filmname, String actor,
			String director, Double ticketprice) {
		this.filmType = filmType;
		this.filmname = filmname;
		this.actor = actor;
		this.director = director;
		this.ticketprice = ticketprice;
	}

	// Property accessors

	public Integer getFilmid() {
		return this.filmid;
	}

	public void setFilmid(Integer filmid) {
		this.filmid = filmid;
	}

	public FilmType getFilmType() {
		return this.filmType;
	}

	public void setFilmType(FilmType filmType) {
		this.filmType = filmType;
	}

	public String getFilmname() {
		return this.filmname;
	}

	public void setFilmname(String filmname) {
		this.filmname = filmname;
	}

	public String getActor() {
		return this.actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getDirector() {
		return this.director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public Double getTicketprice() {
		return this.ticketprice;
	}

	public void setTicketprice(Double ticketprice) {
		this.ticketprice = ticketprice;
	}

}