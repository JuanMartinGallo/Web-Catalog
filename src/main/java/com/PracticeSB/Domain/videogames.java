package com.PracticeSB.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity

public class videogames{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    private String imgUrl;
    @ManyToOne
    private distribuidores distribuidor;

    public videogames(Integer id, String name, String description, String imgUrl, distribuidores distribuidor) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imgUrl = imgUrl;
        this.distribuidor = distribuidor;
    }

    public videogames() {
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

    public distribuidores getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(distribuidores distribuidor) {
        this.distribuidor = distribuidor;
    }

    @Override
    public String toString() {
        return "videogames{" + "id=" + id + ", name=" + name + ", description=" + description + ", imgUrl=" + imgUrl + ", distribuidor=" + distribuidor + '}';
    } 
}
