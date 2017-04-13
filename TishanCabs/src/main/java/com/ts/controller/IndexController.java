/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ts.controller;

import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import com.ts.model.user;
import com.ts.service.UserService;
import static javassist.CtMethod.ConstParameter.string;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 *
 * @author mas shalika
 */
@Controller

public class IndexController {
    
    @Autowired
    private UserService userService;

    @RequestMapping(value = {"/index","/"})
    public String getIndex(HttpServletRequest request) {
       return "index";
    }

  @RequestMapping(value = {"/signup"}, method = RequestMethod.GET)
  public String signup(HttpServletRequest request,ModelMap model) {
      user user1=new user();
      model.addAttribute("user",user1);
       return "signup";
    }
  @RequestMapping(value={"/signup"},method=RequestMethod.POST)
  public String adduser(@Valid user user1,BindingResult result,ModelMap model){
      userService.adduser(user1);
      return "index";
  }
   @RequestMapping(value = {"/login"}, method = RequestMethod.GET)
  public String login(HttpServletRequest request,ModelMap model) {
      user user1=new user();
      model.addAttribute("user",user1);
       return "login";
    }
  /* @RequestMapping(value={"/login"},method=RequestMethod.POST)
    public String login(@PathVariable("email") String email,@PathVariable("password") String password,HttpSession session,ModelMap model){
   
        String pass=userService.search(email);
        if(pass==password){
            return "index";
        }
        return "signup";
    }*/

   @RequestMapping(value={"/login"},method=RequestMethod.POST)
  public String login(@Valid user user1,BindingResult result,ModelMap model,HttpSession session,HttpServletRequest request){
      String email = request.getParameter("email");
      session.setAttribute("email", email);
     // String k=session.getAttribute("username").toString();
      
     boolean userExists = userService.checkLogin(user1.getEmail(),
                user1.getPassword());
     String role=userService.getRole(user1.getEmail());
     // System.out.println(role);
     // System.out.println(role.length());
     if(userExists && ("admin".equals(role))){
         System.out.println(role);
         
         return "adminpage";
     }
         if (userExists && ("user".equals(role))){
         
         return "home";
     }else{
         return "login";
     }
  }
  
   @RequestMapping(value = {"/adminSetting"}, method = RequestMethod.GET)
    public String getadminSetting(HttpServletRequest request,HttpSession session,ModelMap model) {
          String email=session.getAttribute("email").toString(); 
          
          user user1=userService.getdetails(email);
                model.addAttribute("user",user1);

       return "adminSetting";
    }
  @RequestMapping(value={"/adminSetting"},method=RequestMethod.POST)
  public String changeSetting(@Valid user user1,BindingResult result,ModelMap model,HttpSession session){
      String email=session.getAttribute("email").toString(); 

      userService.changeSetting(user1,email);
      return "adminpage";
  }

}
