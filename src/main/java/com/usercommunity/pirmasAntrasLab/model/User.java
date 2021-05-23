package com.usercommunity.pirmasAntrasLab.model;

import javax.persistence.*;

@Entity
@Table(name = "User")
public class User {

    public User()
    {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;

    private String email;

    private int number;

    @ManyToOne
    @JoinColumn(name = "Community_Id")
    private Community community;

    @Version
    @Column(name = "OPT_LOCK_VERSION")
    private int version;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
