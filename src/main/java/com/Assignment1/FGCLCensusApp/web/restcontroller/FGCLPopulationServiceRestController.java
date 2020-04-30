package com.Assignment1.FGCLCensusApp.web.restcontroller;

import com.Assignment1.FGCLCensusApp.business.domain.FGCLGeoAreaPopulation;
import com.Assignment1.FGCLCensusApp.business.domain.FGCLPopulationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/census/api")
public class FGCLPopulationServiceRestController {

    @Autowired
    public FGCLPopulationService fgclPopulationService;

    @RequestMapping(method= RequestMethod.GET, value="/population/level/{level}")
    public List<FGCLGeoAreaPopulation> findPopulationTotalsByLevel(@PathVariable(value="level")int level){
        return this.fgclPopulationService.getGeoAreaPopulationForLevel(level);
    }

    @RequestMapping(method= RequestMethod.GET, value="/population/altcode/{altCode}")
    public FGCLGeoAreaPopulation findPopulationTotalsByAltCode(@PathVariable(value="altCode")int altCode){
        return this.fgclPopulationService.getGeoAreaPopulationForAltCode(altCode);
    }
}
