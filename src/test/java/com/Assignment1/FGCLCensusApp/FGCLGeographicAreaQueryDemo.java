package com.Assignment1.FGCLCensusApp;

import com.Assignment1.FGCLCensusApp.data.repository.FGCLGeographicAreaRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FGCLGeographicAreaQueryDemo {

    @Autowired
    FGCLGeographicAreaRepository fgclGeographicAreaRepository;

    @Test
    public void FGCLQueryByLevelZero(){
        System.out.println("************************************************************************************* ");
        System.out.println("FGCLQueryByLevelZero(): Find areas with level 0 ");
        fgclGeographicAreaRepository.findByLevel(0L).forEach(geoArea ->
                System.out.println(geoArea.toString()));
        System.out.println("************************************************************************************* ");
        System.out.println("************************************************************************************* ");

    }
    @Test
    public void FGCLQueryByLevelOne(){
        System.out.println("************************************************************************************* ");
        System.out.println("FGCLQueryByLevelOne(): Find areas with level 1 ");
        fgclGeographicAreaRepository.findByLevel(1L).forEach(geoArea ->
                System.out.println(geoArea.toString()));
        System.out.println("************************************************************************************* ");
        System.out.println("************************************************************************************* ");
    }
    @Test
    public void FGCLQueryByNameOntario(){
        System.out.println("************************************************************************************* ");
        System.out.println("FGCLQueryByNameOntario: Find areas with name: Ontario");
        fgclGeographicAreaRepository.findByName("Ontario").forEach(geoArea ->
                System.out.println(geoArea.toString()));
        System.out.println("************************************************************************************* ");
        System.out.println("************************************************************************************* ");
        fgclGeographicAreaRepository.findByNameLike("%Loo%").forEach(geoArea ->
                System.out.println(geoArea.toString()));
        System.out.println("************************************************************************************* ");
    }


}
