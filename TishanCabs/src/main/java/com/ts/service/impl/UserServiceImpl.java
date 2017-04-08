/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ts.service.impl;

import com.ts.dao.UserDao;
import com.ts.model.user;
import com.ts.service.UserService;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author mas shalika
 */
@Service
@Transactional
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userdao;
    
  @Override
    public void adduser(user user1){
        userdao.adduser(user1);
    }
}
