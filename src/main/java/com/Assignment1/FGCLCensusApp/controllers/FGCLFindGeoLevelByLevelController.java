package com.Assignment1.FGCLCensusApp.controllers;

import com.Assignment1.FGCLCensusApp.DAL.FGCLGeoAreaDAL;
import com.Assignment1.FGCLCensusApp.beans.FGCLGeographicArea;
import com.Assignment1.FGCLCensusApp.data.repository.FGCLGeographicAreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class FGCLFindGeoLevelByLevelController {

    private List<FGCLGeographicArea> list;
    public String error = "";

    @Autowired
    public FGCLGeographicAreaRepository fgclGeographicAreaRepository;

    @GetMapping("/FGCLFindGeoLevelByLevel")
    public String FindGeoLevelByLevel(){

        return "FGCLFindGeoLevelByLevel";
    }

    @GetMapping("/results")
    public String search(@RequestParam("level") Integer level, Model model){

        if(level > 2){
            error = "There are only levels 0, 1 and 2";
            model.addAttribute("error", error);
            return "FGCLFindGeoLevelByLevel";
        }
        else if (level == null){
            error = "You cannot enter null values";
            model.addAttribute("error", error);
            return "FGCLFindGeoLevelByLevel";
        }
        else {
            //list = FGCLGeoAreaDAL.selectAreaByLevel(level);
            long listLong = level;
            list = fgclGeographicAreaRepository.findByLevel(listLong);
            model.addAttribute("list", list);
            return "FGCLFindGeoLevelByLevel";
        }
    }
}
