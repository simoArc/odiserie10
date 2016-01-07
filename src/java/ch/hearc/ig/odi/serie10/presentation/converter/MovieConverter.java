/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.serie10.presentation.converter;

import ch.hearc.ig.odi.serie10.business.Movie;
import ch.hearc.ig.odi.serie10.service.Services;
import javax.enterprise.context.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Named;

/**
 *
 * @author Simone Bissolotti
 */
@Named(value = "movieConverter")
@RequestScoped
public class MovieConverter implements Converter {

    Services services = new Services();

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
        if (value == null) {
            return null;
        } else {
            Movie movie = services.getMovieById(Integer.parseInt(value));
            return movie;
        }
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object value) {
        if(value==null){
            return "";
        }else if(value instanceof Movie){
            return (String.valueOf(((Movie)value).getId()));
        }else{
            return "";
        }
    }
}
