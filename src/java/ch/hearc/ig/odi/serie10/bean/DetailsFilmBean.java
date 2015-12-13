/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.serie10.bean;

import ch.hearc.ig.odi.serie10.business.Movie;
import ch.hearc.ig.odi.serie10.business.Person;
import ch.hearc.ig.odi.serie10.service.Services;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Simone Bissolotti
 */
@Named(value = "detailsFilmBean")
@SessionScoped
public class DetailsFilmBean implements Serializable {

    private Movie movie;

    @Inject
    Services services;

    public DetailsFilmBean() {
    }

    public List<Person> getPeople() {
        if (movie == null) {
            return new ArrayList();
        }
        return new ArrayList(movie.getPeople().values());
    }

    //permet de selectionner les règles de navigation faces-config
    public String showMovie(Movie mov) {
        if (mov != null) {
            movie = mov;
            return "show";
        } else {
            movie = null;
            return "error";
        }
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

}
