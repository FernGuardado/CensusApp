package com.Assignment1.FGCLCensusApp.beans;

import javax.persistence.*;

@Entity
@Table(name = "USER")
public class FGCLUser {

    @Id
    @Column(name="userID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "lastGeographicArea")
    private int lastGeoArea;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getLastGeoArea() {
        return lastGeoArea;
    }

    public void setLastGeoArea(int lastGeoArea) {
        this.lastGeoArea = lastGeoArea;
    }
}
