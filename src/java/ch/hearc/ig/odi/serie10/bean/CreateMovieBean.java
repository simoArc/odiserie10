/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.serie10.bean;

import ch.hearc.ig.odi.serie10.service.Services;
import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Simone Bissolotti
 */
@Named(value = "createMovieBean")
@RequestScoped
public class CreateMovieBean implements Serializable {

    private long id;
    private String title;
    private String producer;

    @Inject
    Services services;

    public CreateMovieBean() {
    }

    /**
     * Méthode qui permet de sauvegarder le client saisi dans la banque.
     *
     * @return "success" si l'enregistrement se passe bien, "errorDuplicate" si
     * le numéro du client est déjà utilisé.
     */
    public String addMovie() {
        services.newMovie(id, title, producer);
        return "success";
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
    

}
