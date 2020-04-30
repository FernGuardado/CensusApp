package com.Assignment1.FGCLCensusApp;


import com.Assignment1.FGCLCensusApp.data.repository.FGCLAgeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FGCLAgeQueryDemo {

    @Autowired
    FGCLAgeRepository fgclAgeRepository;

    @Test
    public void FGCLQueryByAltCode1(){
        System.out.println("FGCLQueryByAltCode1(): Find ages records with AltCode 1 (Canada) ");
        System.out.println("Number of elements to display: 254 ");
        fgclAgeRepository.findByGeographicAreaAltCode(1L).forEach(System.out::println);
    }
    @Test
    public void FGCLQueryByAltCode35541(){
        System.out.println("FGCLQueryByAltCode35541(): Find ages records with AltCode 35541 (KW-Cambridge) ");
        System.out.println("Number of elements to display: 1");
        fgclAgeRepository.findByGeographicAreaAltCode(35541L).forEach(System.out::println);
    }
}
