package com.azad.RESTAPI.service;

import com.azad.RESTAPI.model.Movie;
import com.azad.RESTAPI.repo.IMovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieSevices implements IMovieService{
    private IMovieRepo movieRepo;

    @Autowired
    public MovieSevices(IMovieRepo movieRepo) {
        this.movieRepo = movieRepo;
    }



    @Override
    public Movie saveMovie(Movie movie) {
        return  movieRepo.save(movie);
    }

    @Override
    public List<Movie> getAllMovies() {
        return (List<Movie>) movieRepo.findAll();
    }
}
