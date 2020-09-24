package com.capgemini.onlinemovieticketsystem.service;

import com.capgemini.onlinemovieticketsystem.entity.Movie;
import com.capgemini.onlinemovieticketsystem.entity.Screen;
import com.capgemini.onlinemovieticketsystem.entity.Show;
import com.capgemini.onlinemovieticketsystem.entity.Theater;

public interface AdminService {
	
	public String addTheatre(Theater theatre);
	
	public Movie save(Movie m);
	
	public String delete(int movieid) ;
	
	public String addScreen(Screen screen);
	
	public boolean addShow(Show show);
	
	public void deleteById(int showId);
	
	

}
