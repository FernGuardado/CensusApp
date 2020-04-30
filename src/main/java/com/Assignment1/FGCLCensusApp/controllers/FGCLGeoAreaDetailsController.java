package com.Assignment1.FGCLCensusApp.controllers;

import com.Assignment1.FGCLCensusApp.DAL.FGCLAgeDAL;
import com.Assignment1.FGCLCensusApp.beans.FGCLAge;
import com.Assignment1.FGCLCensusApp.beans.FGCLLogin;
import com.Assignment1.FGCLCensusApp.beans.FGCLUser;
import com.Assignment1.FGCLCensusApp.data.repository.FGCLAgeRepository;
import com.Assignment1.FGCLCensusApp.data.repository.FGCLUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import java.util.List;

@Controller
public class FGCLGeoAreaDetailsController {

    @Autowired
    FGCLAgeRepository fgclAgeRepository;
    @Autowired
    FGCLUserRepository fgclUserRepository;

    private List<FGCLAge> geoDetailsList;
    public String errorGeoArea = "";

    @GetMapping("/FGCLGeoAreaDetails")
    public String results(@RequestParam("alternativeCode")Integer geoID ,Model model){

        if(geoID == null){
            errorGeoArea = "Error: You cannot enter null values";
            model.addAttribute("errorGeoArea", errorGeoArea);
            return "FGCLGeoAreaDetails";
        }
        else{
            long altcode = geoID;
            geoDetailsList = fgclAgeRepository.findByGeographicAreaAltCode(geoID);
            model.addAttribute("geoDetailsList",geoDetailsList);
            return "FGCLGeoAreaDetails";
        }
    }

    @GetMapping("/getGeoArea")
    public String getGeoArea(@SessionAttribute("login") FGCLLogin login, Model model){

        FGCLUser user = fgclUserRepository.findByUsernameAndPassword(login.getUsername(),
                login.getPassword());
        geoDetailsList = fgclAgeRepository.findByGeographicAreaAltCode(user.getLastGeoArea());
        model.addAttribute("geoDetailsList",geoDetailsList);
        return "FGCLGeoAreaDetails";
    }
}
