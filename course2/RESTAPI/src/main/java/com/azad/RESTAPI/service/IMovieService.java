package com.azad.RESTAPI.service;

import com.azad.RESTAPI.model.Movie;

import java.util.List;

public interface IMovieService {
    Movie saveMovie(Movie movie);
    List<Movie> getAllMovies();
}
