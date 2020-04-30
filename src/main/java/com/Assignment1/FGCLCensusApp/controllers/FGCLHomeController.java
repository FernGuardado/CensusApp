package com.Assignment1.FGCLCensusApp.controllers;

import com.Assignment1.FGCLCensusApp.beans.FGCLAge;
import com.Assignment1.FGCLCensusApp.beans.FGCLLogin;
import com.Assignment1.FGCLCensusApp.data.repository.FGCLUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class FGCLHomeController {

    public List<FGCLAge> detailsList;
    public String errorGeoArea = "";

    @Autowired
    FGCLUserRepository FGCLUserRepository;

    @GetMapping( value = { "/","/FGCLHome" })
    public String getUserProfile(){
        return "FGCLHome";
    }

    @PostMapping("/userLogin")
    public String getUserProfile(@SessionAttribute("login") FGCLLogin login,Model model){
        String welcome = "Welcome, " + login.getUsername();
        model.addAttribute("welcome", welcome);
        return "FGCLHome";
    }

}

