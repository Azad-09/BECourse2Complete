package com.azad.RESTAPI.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

public class Movie {
    @Id
//    @Column(name = "Index")
    private int index;
//    @Column(name = "Movie")
    private String movieName;
//    @Column(name = "Director")
    private String director;
//    @Column(name = "Release Year")
    private int releaseyear;
//    @Column(name = "Language")
    private String language;

    public Movie() {
    }

    public Movie(int index, String movieName, String director, int releaseyear, String language) {
        this.index = index;
        this.movieName = movieName;
        this.director = director;
        this.releaseyear = releaseyear;
        this.language = language;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getReleaseyear() {
        return releaseyear;
    }

    public void setReleaseyear(int releaseyear) {
        this.releaseyear = releaseyear;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "index=" + index +
                ", movieName='" + movieName + '\'' +
                ", director='" + director + '\'' +
                ", releaseyear=" + releaseyear +
                ", language='" + language + '\'' +
                '}';
    }
}
