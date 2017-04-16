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
@Table(name = "VehicleCategory" , catalog = "ts")

public class VehicleCategory implements Serializable{
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    
    
    private Integer ID;
    @Column(unique=true)
    private String Category;
    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }
    
   
}
