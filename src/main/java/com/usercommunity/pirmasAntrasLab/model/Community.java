package com.usercommunity.pirmasAntrasLab.model;

import jdk.jfr.DataAmount;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Community")
public class Community {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Name")
    private String Name;

    @Column(name = "URL")
    private String URL;

    @OneToMany(mappedBy = "community")
    private List<User> users = new ArrayList<>();

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
