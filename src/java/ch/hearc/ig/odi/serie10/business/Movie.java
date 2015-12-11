package ch.hearc.ig.odi.serie10.business;

import java.util.*;

public class Movie {

	Map<Long, Person> people;
	private long id;
	private String name;
	private String producer;

    public Movie(long id, String name, String producer) {
        this.id = id;
        this.name = name;
        this.producer = producer;
        this.people = new HashMap();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Map<Long, Person> getPeople() {
        return people;
    }
    
    public int getcountPeople(){
        return getPeople().size();
    }              

}