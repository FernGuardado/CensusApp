package com.Assignment1.FGCLCensusApp;

import com.Assignment1.FGCLCensusApp.beans.FGCLAge;
import com.Assignment1.FGCLCensusApp.beans.FGCLGeographicArea;
import com.Assignment1.FGCLCensusApp.business.domain.FGCLGeoAreaPopulation;
import com.Assignment1.FGCLCensusApp.business.domain.FGCLPopulationService;
import com.Assignment1.FGCLCensusApp.data.repository.FGCLAgeRepository;
import com.Assignment1.FGCLCensusApp.data.repository.FGCLGeographicAreaRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FGCLPopulationServiceDemo {

    @Autowired
    FGCLPopulationService fgclPopulationService = new FGCLPopulationService();

    public List<FGCLGeoAreaPopulation> fgclPopulationServiceList = new ArrayList<>();
    public FGCLGeoAreaPopulation fgclGeoAreaPopulation = new FGCLGeoAreaPopulation();

    @Test
    public void FGCLGetGeoAreaPopulationForAltCode1(){
        System.out.println("GetGeoAreaPopulationForAltCode1: Alt Code 1 (Canada)");
        fgclGeoAreaPopulation = fgclPopulationService.getGeoAreaPopulationForAltCode(1L);
        System.out.println(fgclGeoAreaPopulation.toString());
    }

    @Test
    public void FGCLGetGeoAreaPopulationForAltCode35(){
        System.out.println("GetGeoAreaPopulationForAltCode1: Alt Code 35 (Canada)");
        fgclGeoAreaPopulation = fgclPopulationService.getGeoAreaPopulationForAltCode(35L);
        System.out.println(fgclGeoAreaPopulation.toString());
    }

    @Test
    public void FGCLGetGeoAreaPopulationForAltCode35541(){
        System.out.println("GetGeoAreaPopulationForAltCode1: Alt Code 35541 (Canada)");
        fgclGeoAreaPopulation = fgclPopulationService.getGeoAreaPopulationForAltCode(35541L);
        System.out.println(fgclGeoAreaPopulation.toString());
    }

    @Test
    public void FGCLGetGeoAreaPopulationForLevelZero(){
        System.out.println("GetGeoAreaPopulationForLevelZero: Level 0 (Canada)");
        fgclPopulationServiceList = fgclPopulationService.getGeoAreaPopulationForLevel(0L);
        fgclPopulationServiceList.forEach(ga ->
                System.out.println(ga.toString()));
    }

    @Test
    public void FGCLGetGeoAreaPopulationForLevelOne(){
        System.out.println("GetGeoAreaPopulationForLevelZero: Level One (expected result: 13)");
        fgclPopulationServiceList = fgclPopulationService.getGeoAreaPopulationForLevel(1L);
        fgclPopulationServiceList.forEach(ga ->
                System.out.println(ga.toString()));
    }

    @Test
    public void FGCLGetGeoAreaPopulationForLevelTwo(){
        System.out.println("GetGeoAreaPopulationForLevelZero: Level Two (expected result: 152)");
        fgclPopulationServiceList = fgclPopulationService.getGeoAreaPopulationForLevel(2L);
        fgclPopulationServiceList.forEach(ga ->
                System.out.println(ga.toString()));
    }

    @Test
    public void FGCLGetGeoAreaPopulationForLevelThree(){
        System.out.println("GetGeoAreaPopulationForLevelZero: Level Three (expected result: 8)");
        fgclPopulationServiceList = fgclPopulationService.getGeoAreaPopulationForLevel(3L);
        fgclPopulationServiceList.forEach(ga ->
                System.out.println(ga.toString()));
    }



}
