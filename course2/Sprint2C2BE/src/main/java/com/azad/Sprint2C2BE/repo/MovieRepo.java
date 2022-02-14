package com.azad.Sprint2C2BE.repo;

import com.azad.Sprint2C2BE.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepo extends JpaRepository<Movie, Integer> {
   List<Movie> getMovieByGenere(String genere);
}
