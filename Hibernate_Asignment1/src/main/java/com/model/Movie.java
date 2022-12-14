package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Movie {
	@Id
	
	
	private String movieId;
	private String movieName;
	private String language;
	private int releasedIn;
	private int revenueInDOllars;
	
	public Movie(String movieId, String movieName, String language, int releasedIn, int revenueInDOllars) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.language = language;
		this.releasedIn = releasedIn;
		this.revenueInDOllars = revenueInDOllars;
	}
	
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public int getReleasedIn() {
		return releasedIn;
	}
	public void setReleasedIn(int releasedIn) {
		this.releasedIn = releasedIn;
	}
	public int getRevenueInDOllars() {
		return revenueInDOllars;
	}
	public void setRevenueInDOllars(int revenueInDOllars) {
		this.revenueInDOllars = revenueInDOllars;
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", language=" + language + ", releasedIn="
				+ releasedIn + ", revenueInDOllars=" + revenueInDOllars + "]";
	}
	
	
}
