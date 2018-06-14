package com.muqui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mq12
 */
@Controller
public class HomeController {
    @RequestMapping("home.html")
    public ModelAndView home(){
     ModelAndView model = new ModelAndView();
     model.setViewName("home");
     return model;
    }
}
