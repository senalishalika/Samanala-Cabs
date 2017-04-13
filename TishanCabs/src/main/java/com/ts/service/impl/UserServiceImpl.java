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
    
     /*@Override
     public String search(String email){
         String pass=userdao.search(email);
         return pass;
     }*/
     @Override
      public boolean checkLogin(String userName, String userPassword){
              
              return userdao.checkLogin(userName, userPassword);
       }
       @Override
      public String getRole(String userName){
          return userdao.getRole(userName);
      }
      @Override
      public user getdetails(String email){
          return userdao.getdetails(email);
      }
       @Override
      public void changeSetting(user user1,String email){
          userdao.changeSetting(user1,email);
      } 
}
