package com.azad.Sprint2C2BE.service;

import com.azad.Sprint2C2BE.model.Movie;
import com.azad.Sprint2C2BE.repo.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService implements IMovieService{
    private MovieRepo movieRepo;

    @Autowired
    public MovieService(MovieRepo movieRepo) {
        this.movieRepo = movieRepo;
    }


//    Business Logic

    @Override
    public Movie saveMovie(Movie movie) {
        return movieRepo.save(movie);
    }

    @Override
    public List<Movie> getAlMovie() {
        return movieRepo.findAll();
    }


//    Custom Made Function
    @Override
    public List<Movie> getMovieByGenere(String genere) {
        return (List<Movie>) movieRepo.getMovieByGenere(genere);
    }

    @Override
    public boolean deleteByMovieID(int id) {
        movieRepo.deleteById(id);
        return true;
    }

    @Override
    public Movie updateMovieByRelease(Movie release) {
        return movieRepo.save(release);
    }
}
