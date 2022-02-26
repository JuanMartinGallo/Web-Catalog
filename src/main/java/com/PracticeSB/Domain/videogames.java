package com.PracticeSB.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Videogames{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    private String imgUrl;
    @ManyToOne
    private Distributors distributor;

    public Videogames(Integer id, String name, String description, String imgUrl, Distributors distributor) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imgUrl = imgUrl;
        this.distributor = distributor;
    }

    public Videogames() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Distributors getDistributor() {
        return distributor;
    }

    public void setDistributor(Distributors distributor) {
        this.distributor = distributor;
    }

    @Override
    public String toString() {
        return "videogames{" + "id=" + id + ", name=" + name + ", description=" + description + ", imgUrl=" + imgUrl + ", distributor=" + distributor + '}';
    } 
}
