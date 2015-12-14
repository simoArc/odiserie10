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
@Named(value = "createPerson")
@RequestScoped
public class CreatePersonBean implements Serializable {

    private long id;
    private String firstName;
    private String lastName;

    @Inject
    Services services;

    public CreatePersonBean() {
    }

    /**
     * Méthode qui permet de sauvegarder le client saisi dans la banque.
     *
     * @return "success" si l'enregistrement se passe bien, "errorDuplicate" si
     * le numéro du client est déjà utilisé.
     */
    public String addPerson() {
        services.newPerson(id, firstName, lastName);
        return "success";
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

}
