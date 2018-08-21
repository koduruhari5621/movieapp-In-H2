package com.stackroute.movieboot.services;

import java.util.List;

import com.stackroute.movieboot.domain.Movie;


public interface MovieService {
public Movie saveMovie(Movie movie);
public List<Movie> getallMovie() ;
public boolean deleteMovie(int movieId);
public boolean updateMovie(Movie movie);
public Movie getbyId(int movieId);
public Movie getbyTitle(String movieTitle);
public Movie getbyRating(int movieRating);

public Movie getbyYear(int releaseYear);
public List<Movie> getByMovieAlpha(String searchTerm);

}
