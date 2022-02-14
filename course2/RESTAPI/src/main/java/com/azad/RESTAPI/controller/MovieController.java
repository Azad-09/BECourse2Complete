package com.azad.RESTAPI.controller;

import com.azad.RESTAPI.model.Movie;
import com.azad.RESTAPI.service.MovieSevices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("azad/movie")
public class MovieController {
    private MovieSevices movieSevices;

    @Autowired

    public MovieController(MovieSevices movieSevices) {
        this.movieSevices = movieSevices;
    }

    @PostMapping("/movie")
    public ResponseEntity<?> saveMovie(@RequestBody Movie movie){
        return new ResponseEntity<>(movieSevices.saveMovie(movie), HttpStatus.CREATED);
    }

    @GetMapping("/movies")
    public ResponseEntity<?> allMovies(@RequestBody Movie movie){
        return new ResponseEntity<>(movieSevices.getAllMovies(), HttpStatus.OK);
    }
}
