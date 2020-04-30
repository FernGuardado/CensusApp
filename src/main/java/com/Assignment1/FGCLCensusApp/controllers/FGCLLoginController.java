package com.Assignment1.FGCLCensusApp.controllers;


import com.Assignment1.FGCLCensusApp.beans.FGCLLogin;
import com.Assignment1.FGCLCensusApp.beans.FGCLUser;
import com.Assignment1.FGCLCensusApp.data.repository.FGCLUserRepository;
//import org.omg.CORBA.portable.ApplicationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("login")
public class FGCLLoginController {

    @Autowired
    private FGCLUserRepository FGCLUserRepository;

    @ModelAttribute("login")
    public FGCLLogin defaultLogin(){
        return new FGCLLogin();
    }

    @GetMapping("/FGCLLogin")
    public String loginPage(){
        return "FGCLLogin";
    }


    @PostMapping("/login")
    public String getLogin(@ModelAttribute("login")FGCLLogin login, Model model){

        FGCLUser user  = FGCLUserRepository.findByUsernameAndPassword(login.getUsername(),
                login.getPassword());
        if(user==null){
            String errorLogin = "Username or password are not correct";
            model.addAttribute("errorLogin",errorLogin);
            return "FGCLLogin";
        }
        else {
            String welcome = "Welcome " + login.getUsername();
            model.addAttribute("welcome", welcome);
            return "forward:/userLogin";
        }
    }
}
