package com.Assignment1.FGCLCensusApp.business.domain;

import com.Assignment1.FGCLCensusApp.beans.FGCLAge;
import com.Assignment1.FGCLCensusApp.beans.FGCLGeographicArea;
import com.Assignment1.FGCLCensusApp.data.repository.FGCLAgeRepository;
import com.Assignment1.FGCLCensusApp.data.repository.FGCLGeographicAreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FGCLPopulationService {

    @Autowired
    FGCLGeographicAreaRepository fgclGeographicAreaRepository;

    @Autowired
    FGCLAgeRepository fgclAgeRepository;


    public FGCLGeoAreaPopulation getGeoAreaPopulationForAltCode(long altCode) {

        FGCLGeoAreaPopulation objGeoArea = new FGCLGeoAreaPopulation();
        List<FGCLAge>  aList = fgclAgeRepository.findByGeographicAreaAltCode(altCode);

        aList.forEach(a -> {
            objGeoArea.setGeoAreaLevel(a.getFgclGeographicArea().getLevel());
            objGeoArea.setGeoAreaId(a.getFgclGeographicArea().getGeographicAreaID());
            objGeoArea.setGeoAreaName(a.getFgclGeographicArea().getName());
            objGeoArea.setGeoAreaAltCode(a.getFgclGeographicArea().getAlternativeCode());
            objGeoArea.setGeoAreaCombined(a.getCombined());
            objGeoArea.setGeoAreaMale(a.getMale());
            objGeoArea.setGeoAreaFemale(a.getFemale());
        });

        return objGeoArea;
    }

    public List<FGCLGeoAreaPopulation> getGeoAreaPopulationForLevel(long level) {

        List<FGCLGeoAreaPopulation> gpList = new ArrayList<>();
        List<FGCLGeographicArea>  gList = fgclGeographicAreaRepository.findByLevel(level);

        gList.forEach(g -> {
            FGCLGeoAreaPopulation objGeoArea = new FGCLGeoAreaPopulation();
            FGCLAge age = new FGCLAge();
            objGeoArea.setGeoAreaLevel(g.getLevel());
            objGeoArea.setGeoAreaId(g.getGeographicAreaID());
            objGeoArea.setGeoAreaName(g.getName());
            objGeoArea.setGeoAreaAltCode(g.getAlternativeCode());

            List<FGCLAge>  ageList = fgclAgeRepository.findByGeographicAreaAltCode(g.getAlternativeCode());
            ageList.forEach(a ->{
                objGeoArea.setGeoAreaCombined(a.getCombined());
                objGeoArea.setGeoAreaMale(a.getMale());
                objGeoArea.setGeoAreaFemale(a.getFemale());
            });

            gpList.add(objGeoArea);

        });

        return gpList;
    }
}
