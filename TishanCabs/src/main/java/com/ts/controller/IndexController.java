/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ts.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 *
 * @author mas shalika
 */
@Controller
public class IndexController {

    /**
     *
     * @param request
     * @return
     */
    @RequestMapping(value = {"/index","/"})
    public String getIndex(HttpServletRequest request) {
      
        return "index";
    }

   

}
