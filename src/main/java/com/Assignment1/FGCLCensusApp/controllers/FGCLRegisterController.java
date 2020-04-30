package com.Assignment1.FGCLCensusApp.controllers;

import com.Assignment1.FGCLCensusApp.beans.FGCLLogin;
import com.Assignment1.FGCLCensusApp.beans.FGCLUser;
import com.Assignment1.FGCLCensusApp.data.repository.FGCLUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
public class FGCLRegisterController {

    public String error = "";
    public String success = "";

    @Autowired
    FGCLUserRepository fgclUserRepository;

    @ModelAttribute("user")
    public FGCLUser defaultNewUser(){
        return new FGCLUser();
    }

    @GetMapping("/FGCLRegister")
    public String registerPage(){
        return "FGCLRegister";
    }

    @PostMapping("/registered")
    public String registerUser(@Valid @ModelAttribute("user")FGCLUser newUser,
                               BindingResult result, Model model){
        if(result.hasErrors()){
            return "FGCLRegister";
        }

        fgclUserRepository.save(newUser);
        String success = newUser.getUsername()+" is registered";
        model.addAttribute("success", success);
        return "FGCLHome";
    }
}
