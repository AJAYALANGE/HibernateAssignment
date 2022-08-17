package com.service;

import com.dao.MovieDAO;

public class Main {
	
	public static void main(String[] args) {
		
		MovieDAO dao = new MovieDAO();
		//dao.addMovie();
		//dao.updateMovie();
	//	dao.getMovieDetails();
		dao.deleteMovie();
		
		
		
	}

}
