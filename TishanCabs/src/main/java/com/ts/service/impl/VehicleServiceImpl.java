/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ts.service.impl;

import com.ts.dao.VehicleDao;
import com.ts.model.VehicleCategory;
import com.ts.service.VehicleService;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author mas shalika
 */
@Service
@Transactional
public class VehicleServiceImpl implements VehicleService{
    
    @Autowired
    private VehicleDao vehicleDao;
    @Override
    public List<VehicleCategory> getCategory(){
        return vehicleDao.getCategory();
    }
    
    
}
