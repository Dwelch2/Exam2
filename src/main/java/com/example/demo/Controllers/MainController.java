package com.example.demo.Controllers;

import com.example.demo.Model.VirusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    @Autowired
    VirusRepo virusRepo;

    public MainController() {
    }

    @RequestMapping({"/"})
    public ModelAndView goHome() {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("viruslist", this.virusRepo.findAll());
        return mav;
    }
}
