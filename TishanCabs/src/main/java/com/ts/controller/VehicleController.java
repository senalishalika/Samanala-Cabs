/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ts.controller;

import com.ts.model.Vehicle;
import com.ts.model.VehicleCategory;
import com.ts.service.Vehicle2Service;

import com.ts.service.VehicleService;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author mas shalika
 */

@Controller
public class VehicleController {
    
    @Autowired
    private VehicleService vehicleService;
    
     @Autowired
     private Vehicle2Service vehicle2Service;
    
    @RequestMapping(value = {"/addVehicle"}, method = RequestMethod.GET)
    public String getaddVehicle(HttpServletRequest request,ModelMap model) {
        Vehicle vehicle=new Vehicle();
        model.addAttribute("Vehicle",vehicle);
        List<VehicleCategory> category=vehicleService.getCategory();
        model.addAttribute("value", category);
       return "addVehicle";
    }
    
    
    @RequestMapping(value = {"/addVehicle"}, method = RequestMethod.POST)
    public String addVehicle(@Valid Vehicle vehicle,BindingResult result,ModelMap model,@RequestParam("file") MultipartFile file,HttpServletRequest request) {
             String filename=file.getOriginalFilename();
              
                vehicle.setImage(filename);
             
                vehicle2Service.addVehicle(vehicle);   
                return "addVehicle";
    }

}
