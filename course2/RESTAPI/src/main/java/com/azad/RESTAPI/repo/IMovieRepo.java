package com.azad.RESTAPI.repo;

import com.azad.RESTAPI.model.Movie;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;



@Repository
public interface IMovieRepo extends CrudRepository<Movie, String> {

}
