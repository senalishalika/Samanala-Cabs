/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ts.dao.impl;

import com.ts.dao.AbstractDao;
import com.ts.dao.VehicleDao;
import com.ts.model.VehicleCategory;
import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author mas shalika
 */
@Repository("VehicleCategory")
public class VehicleDaoImpl extends AbstractDao<Serializable, VehicleCategory> implements VehicleDao{
    @Override
    public List<VehicleCategory> getCategory(){
         String hql = "SELECT Category FROM VehicleCategory";
         return getSession().createQuery(hql).list();
    }
}
