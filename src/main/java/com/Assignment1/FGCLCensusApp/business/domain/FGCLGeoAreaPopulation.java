package com.Assignment1.FGCLCensusApp.business.domain;

import com.Assignment1.FGCLCensusApp.beans.FGCLGeographicArea;

public class FGCLGeoAreaPopulation {
    public int geoAreaId;
    public String geoAreaName;
    public int geoAreaCode;
    public long geoAreaLevel;
    public long geoAreaAltCode;
    public int geoAreaCombined;
    public int geoAreaMale;
    public int geoAreaFemale;


    public int getGeoAreaId() {
        return geoAreaId;
    }

    public void setGeoAreaId(int geoAreaId) {
        this.geoAreaId = geoAreaId;
    }

    public String getGeoAreaName() {
        return geoAreaName;
    }

    public void setGeoAreaName(String geoAreaName) {
        this.geoAreaName = geoAreaName;
    }

    public int getGeoAreaCode() {
        return geoAreaCode;
    }

    public void setGeoAreaCode(int geoAreaCode) {
        this.geoAreaCode = geoAreaCode;
    }

    public long getGeoAreaLevel() {
        return geoAreaLevel;
    }

    public void setGeoAreaLevel(long geoAreaLevel) {
        this.geoAreaLevel = geoAreaLevel;
    }

    public long getGeoAreaAltCode() {
        return geoAreaAltCode;
    }

    public void setGeoAreaAltCode(long geoAreaAltCode) {
        this.geoAreaAltCode = geoAreaAltCode;
    }

    public int getGeoAreaCombined() {
        return geoAreaCombined;
    }

    public void setGeoAreaCombined(int geoAreaCombined) {
        this.geoAreaCombined = geoAreaCombined;
    }

    public int getGeoAreaMale() {
        return geoAreaMale;
    }

    public void setGeoAreaMale(int geoAreaMale) {
        this.geoAreaMale = geoAreaMale;
    }

    public int getGeoAreaFemale() {
        return geoAreaFemale;
    }

    public void setGeoAreaFemale(int geoAreaFemale) {
        this.geoAreaFemale = geoAreaFemale;
    }

    @Override
    public String toString() {
        return "Geographic Area ID, Name, Alt code: "+ geoAreaId+", "+ geoAreaName +","+ geoAreaAltCode
                +" ( Population -- Total, Male, Female: " + geoAreaCombined + ", "+  geoAreaMale+", "+ geoAreaFemale + " )";
    }
}
