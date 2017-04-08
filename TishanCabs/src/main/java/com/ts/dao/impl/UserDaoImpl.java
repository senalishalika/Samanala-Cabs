/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ts.dao.impl;

import com.ts.dao.AbstractDao;
import com.ts.dao.UserDao;
import com.ts.model.user;
import java.io.Serializable;
import org.springframework.stereotype.Repository;

/**
 *
 * @author mas shalika
 */
@Repository("UserDao")
public class UserDaoImpl extends AbstractDao<Serializable, user> implements UserDao{
     @SuppressWarnings("unchecked")
     @Override
    public void adduser(user user1){
        persist(user1);
    }
}
