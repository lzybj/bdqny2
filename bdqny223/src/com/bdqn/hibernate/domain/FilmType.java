package com.bdqn.hibernate.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * FilmType entity. @author MyEclipse Persistence Tools
 */

public class FilmType implements java.io.Serializable {

	// Fields

	private Integer typeid;
	private String typename;
	private Set filmInfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public FilmType() {
	}

	/** minimal constructor */
	public FilmType(String typename) {
		this.typename = typename;
	}

	/** full constructor */
	public FilmType(String typename, Set filmInfos) {
		this.typename = typename;
		this.filmInfos = filmInfos;
	}

	// Property accessors

	public Integer getTypeid() {
		return this.typeid;
	}

	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}

	public String getTypename() {
		return this.typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

	public Set getFilmInfos() {
		return this.filmInfos;
	}

	public void setFilmInfos(Set filmInfos) {
		this.filmInfos = filmInfos;
	}

}