package ch.hearc.ig.odi.serie10.business;

import java.util.*;

public class Person {

    Map<Long, Movie> movies;
    private long id;
    private String firstName;
    private String lastName;

    public Person(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.movies = new HashMap();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Map<Long, Movie> getMovies() {
        return movies;
    }

    //ajout du film à la personne

    public void addMovie(Movie movie) {
        this.movies.put(id, movie);
    }

    //nombre de films par personne
    public int getcountFilms() {
        return getMovies().size();
    }

}
