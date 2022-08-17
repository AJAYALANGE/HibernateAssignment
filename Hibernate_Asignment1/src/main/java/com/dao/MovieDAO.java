package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Movie;

public class MovieDAO {

	public String addMovie() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Movie movie = new Movie();
		movie.setMovieId("111");
		movie.setMovieName("PK");
		movie.setLanguage("Hindi");
		movie.setReleasedIn(2018);
		movie.setRevenueInDOllars(21100000);

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(movie);
		tx.commit();
		session.close();

		return addMovie();

	}

	public String updateMovie() {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Movie movie = session.get(Movie.class, "111");
		movie.setMovieName("YJHD");
		movie.setLanguage("English");
		movie.setRevenueInDOllars(10000000);

		System.out.println("Movie Details Updated Successfully.........!!!!");

		session.save(movie);
		tx.commit();
		session.close();

		return updateMovie();
	}

	public void getMovieDetails() {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Movie movie = session.get(Movie.class, "111");
		System.out.println("Movie Details Fetched Successfully");
		System.out.println(
				"Id=" + movie.getMovieId() + " Name=" + movie.getMovieName() + " Release=" + movie.getReleasedIn()
						+ " Language" + movie.getLanguage() + " Revenue=" + movie.getRevenueInDOllars());

		session.save(movie);
		tx.commit();
		session.close();

	}

	public void deleteMovie() {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Movie movie = session.get(Movie.class, "111");
		session.delete(movie);
		tx.commit();
		session.close();
	}

}
