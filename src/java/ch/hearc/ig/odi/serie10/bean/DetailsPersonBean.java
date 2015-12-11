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
@Named(value = "detailsPersonBean")
@SessionScoped
public class DetailsPersonBean implements Serializable {

    private Person person;

    @Inject
    Services services;

    public DetailsPersonBean() {
    }

    //permet de selectionner les règles de navigation faces-config
    public String showPerson(Person pers) {
        if (pers != null) {
            person = pers;
            return "show";
        } else {
            person = null;
            return "error";
        }
    }

    public List<Movie> getMovies() {
        if (person == null) {
            return new ArrayList();
        }
        return new ArrayList(person.getMovies().values());
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

}
