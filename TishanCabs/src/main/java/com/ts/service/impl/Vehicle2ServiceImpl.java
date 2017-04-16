/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ts.service.impl;

import com.ts.dao.Vehicle2Dao;
import com.ts.model.Vehicle;
import com.ts.service.Vehicle2Service;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author mas shalika
 */
@Service
@Transactional
public class Vehicle2ServiceImpl implements Vehicle2Service{
    
     @Autowired
     private Vehicle2Dao vehicle2dao;
    @Override
    public void addVehicle(Vehicle vehicle){
        vehicle2dao.addVehicle(vehicle);
    }
}
