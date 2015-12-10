/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.serie10.bean;

import ch.hearc.ig.odi.serie10.business.Person;
import ch.hearc.ig.odi.serie10.service.Services;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Simone Bissolotti
 */
@Named(value = "listPeopleBean")
@RequestScoped
public class ListPeopleBean implements Serializable{
    
    @Inject Services services;
    public ListPeopleBean() {
    }
    
    public List<Person> getPeople(){
        return services.getPeopleList();
    }    
    
    
    
}
