/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ts.service;

import com.ts.model.user;

/**
 *
 * @author mas shalika
 */
public interface UserService {
    void adduser( user user1);
    //String search(String email);
    boolean checkLogin(String userName, String userPassword);
    String getRole(String userName);
    user getdetails(String email);
    void changeSetting(user user1,String email);
}
