package com.capgemini.onlinemovieticketsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.capgemini.onlinemovieticketsystem.entity.Booking;
import com.capgemini.onlinemovieticketsystem.entity.Movie;
import com.capgemini.onlinemovieticketsystem.entity.Screen;
import com.capgemini.onlinemovieticketsystem.entity.Seat;
import com.capgemini.onlinemovieticketsystem.entity.Show;
import com.capgemini.onlinemovieticketsystem.entity.Theater;
import com.capgemini.onlinemovieticketsystem.entity.Ticket;

@Service
public interface CustomerService {
	
    public Movie searchMovie(int theatreId, String movieName );
	
	public Screen searchScreen(int theatreId, int screenId);
	
	public Theater selectByTheatre(String theatreName);
	
	public List<Theater> selectByCityName(String cityName);
	
	public List<Movie> findMoviesInTheatre(int theatreId);

	public List<Screen> findScreensInTheatre(int theatreId);

	public List<Show> findShowsInTheatre(int theatreId, int screenId);

	public Show selectShow(int theatreId, int screenId, int showId);

	public Screen selectScreen(int theatreId, int screenId);

	public List<String> showCities();

	public List<Seat> showSeats(int theatreId, int screenId, int showId);

	public List<Movie> selectMoviesByCityName(String cityName);

	

	public List<Theater> selectByMovieName(String movieName);

	public List<Show> selectByMovieAndTheatre(String movieName, String theatreName);

	public List<Theater> findAll();

	public Optional<Theater> findByScreenId(int screenId);
	
     public List<Movie> searchMovieByTheater(String theatreName);
	
	public List<Movie> searchTheaterByMovie(String theatreCity);
	
	public List<String> findAllCities();

	public List<String> findAllTheatres();
	
	public Booking addBooking(Booking booking);
	
	public Booking fetchBookingById(int bookingId);
	
	public List<Booking> fetchAllBookings();
	
	public String cancelBooking(int bookingId);
	
	public Ticket showTicket(int bookingId);
	
//	public BookingTransaction makePayment(String paymentMethod, double cost);
	
	public Booking createBooking(Booking booking, String paymentMethod,String screenName);
	
	public List<Movie> fetchAll() ;
	
	// public Movie fetchById(int movieId) ;
	
	public List<Show> fetchAllShows();
	
	public Seat getSeat(int seatId);
	 public Seat blockSeat(int seatId);
	 public Seat bookSeat(int seatId);
	 public Seat cancelSeat(int seatId);
	 
	 public Optional<Show> findById(int showId);



}
