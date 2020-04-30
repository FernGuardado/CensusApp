package com.Assignment1.FGCLCensusApp.controllers;

import com.Assignment1.FGCLCensusApp.DAL.FGCLGeoAreaDAL;
import com.Assignment1.FGCLCensusApp.beans.*;
import com.Assignment1.FGCLCensusApp.data.repository.FGCLGeographicAreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class FGCLFindGeoAreaByKeywordController {

    public List<FGCLGeographicArea> list;
    public String errorKey = "";

    @Autowired
    public FGCLGeographicAreaRepository fgclGeographicAreaRepository;

    @GetMapping("/FGCLFindGeoAreaByKeyword")
    public String FindGeoLevelByKeyword(){
        return "FGCLFindGeoAreaByKeyword";
    }

    @GetMapping("/resultsKeyword")
    public String search(@RequestParam("keyword") String keyword, Model model){

        if(keyword == "" || keyword.isEmpty() || keyword == null){
            errorKey = "You must enter a key word";
            model.addAttribute("errorKey", errorKey);
            return "FGCLFindGeoAreaByKeyword";
        }
        else {
            String word = keyword;
            list = fgclGeographicAreaRepository.findByNameLike(word);
            model.addAttribute("list",list);
            return "FGCLFindGeoAreaByKeyword";
        }
    }

}
