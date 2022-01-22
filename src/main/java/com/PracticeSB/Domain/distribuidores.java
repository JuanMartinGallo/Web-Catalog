package com.PracticeSB.Domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity

public class distribuidores {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String webSite;

    public distribuidores(Integer id, String name, String webSite) {
        this.id = id;
        this.name = name;
        this.webSite = webSite;
    }

    public distribuidores() {
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

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String website) {
        this.webSite = website;
    }

    
}
