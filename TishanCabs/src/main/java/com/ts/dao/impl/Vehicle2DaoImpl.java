/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ts.dao.impl;

import com.ts.dao.AbstractDao;
import com.ts.dao.Vehicle2Dao;
import com.ts.model.Vehicle;
import java.io.Serializable;
import org.springframework.stereotype.Repository;

/**
 *
 * @author mas shalika
 */
@Repository("Vehicle2Dao")
public class Vehicle2DaoImpl extends AbstractDao<Serializable, Vehicle> implements Vehicle2Dao {
    @SuppressWarnings("unchecked")
    @Override
    public void addVehicle(Vehicle vehicle){
        persist(vehicle);
    }
}
