package com.azad.Sprint2C2BE.service;

import com.azad.Sprint2C2BE.model.Movie;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IMovieService {

    Movie saveMovie(Movie movie);
    List<Movie> getAlMovie();
    List<Movie> getMovieByGenere(String genere );
    boolean deleteByMovieID(int id);
    Movie updateMovieByRelease(Movie release);
}
