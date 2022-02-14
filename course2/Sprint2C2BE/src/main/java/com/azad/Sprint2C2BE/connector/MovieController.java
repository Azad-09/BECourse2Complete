package com.azad.Sprint2C2BE.connector;

import com.azad.Sprint2C2BE.model.Movie;
import com.azad.Sprint2C2BE.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/mov")
public class MovieController {

    private MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping("/movie")
    public ResponseEntity<?> saveMovie(@RequestBody Movie movie){
        return new ResponseEntity<>(movieService.saveMovie(movie), HttpStatus.CREATED);
    }

    @GetMapping("/movielist")
    public ResponseEntity<?> getAllMovie(){
        return new ResponseEntity<>(movieService.getAlMovie(), HttpStatus.OK);
    }

    @GetMapping("/moviegenere/{genere}")
    public  ResponseEntity<?> getMovieByGenere(@PathVariable String genere){
        return new ResponseEntity<>(movieService.getMovieByGenere(genere), HttpStatus.OK);
    }

    @DeleteMapping("/deletedata/{index}")
    public ResponseEntity<?> deleteByMovieID(@PathVariable int index){
        return new ResponseEntity<>(movieService.deleteByMovieID(index), HttpStatus.OK);
    }

    @PutMapping("/updatedate")
    public  ResponseEntity<?> updateMovieByRelease(@RequestBody Movie movie){
        return new ResponseEntity<>(movieService.updateMovieByRelease(movie), HttpStatus.OK);
    }

}
