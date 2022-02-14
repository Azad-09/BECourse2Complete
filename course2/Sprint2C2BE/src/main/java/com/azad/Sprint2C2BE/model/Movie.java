package com.azad.Sprint2C2BE.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Movie")
public class Movie {
    @Id
    private int id;
    private String movie;
    private String genere;
    private String release;
    private String language;
    private String director;

    public Movie() {
    }

    public Movie(int id, String movie, String genere, String release, String language, String director) {
        this.id = id;
        this.movie = movie;
        this.genere = genere;
        this.release = release;
        this.language = language;
        this.director = director;
    }

    //Setter
    public void setIndex(int id) {
        this.id = id;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    //Getter


    public int getIndex() {
        return id;
    }

    public String getMovie() {
        return movie;
    }

    public String getGenere() {
        return genere;
    }

    public String getRelease() {
        return release;
    }

    public String getLanguage() {
        return language;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "index='" + id + '\'' +
                ", movie='" + movie + '\'' +
                ", genere='" + genere + '\'' +
                ", release='" + release + '\'' +
                ", language='" + language + '\'' +
                ", director='" + director + '\'' +
                '}';
    }
}
