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
@Table(name = "Vehicle" , catalog = "ts")
public class Vehicle implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    
    
    private Integer ID;
    
    @Column(unique=true)
    private String vehicleNo;
    
    private String category;
    private String purpose;
    private String already="Not Booking";
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

   

    public String getAlready() {
        return already;
    }

    public void setAlready(String already) {
        this.already = already;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
   
    
}
