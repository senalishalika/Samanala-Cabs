/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ts.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author mas shalika
 */

@Entity
@Table(name = "user", catalog = "ts")
public class user implements Serializable{
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    
    
    private Integer ID;
    
    @Column(unique=true)
    private String fname;
    private String lname;
    private String telno;
    private String email;
    private String password;
    private String cnfirm;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getTelno() {
        return telno;
    }

    public void setTelno(String telno) {
        this.telno = telno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCnfirm() {
        return cnfirm;
    }

    public void setCnfirm(String cnfirm) {
        this.cnfirm = cnfirm;
    }
    
}
