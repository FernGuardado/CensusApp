package com.Assignment1.FGCLCensusApp.beans;

import javax.persistence.*;

@Entity
@Table(name = "AGE")
public class FGCLAge {
    @Id
    @Column(name = "ageID")
    private int ageID;
    @Column(name = "ageGroup")
    private int ageGroup;
    @Column(name = "censusYear")
    private int censusYear;
    @Column(name = "geographicArea")
    private int geographicArea;
    @Column(name = "combined")
    private int combined;
    @Column(name = "male")
    private int male;
    @Column(name = "female")
    private int female;

    @OneToOne
    @JoinColumn(name = "geographicArea", insertable = false, updatable = false)
    private FGCLGeographicArea fgclGeographicArea;

    public int getAgeID() {
        return ageID;
    }

    public void setAgeID(int ageID) {
        this.ageID = ageID;
    }

    public int getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(int ageGroup) {
        this.ageGroup = ageGroup;
    }

    public int getCensusYear() {
        return censusYear;
    }

    public void setCensusYear(int censusYear) {
        this.censusYear = censusYear;
    }

    public int getGeographicArea() {
        return geographicArea;
    }

    public void setGeographicArea(int geographicArea) {
        this.geographicArea = geographicArea;
    }

    public int getCombined() {
        return combined;
    }

    public void setCombined(int combined) {
        this.combined = combined;
    }

    public int getMale() {
        return male;
    }

    public void setMale(int male) {
        this.male = male;
    }

    public int getFemale() {
        return female;
    }

    public void setFemale(int female) {
        this.female = female;
    }

    public FGCLGeographicArea getFgclGeographicArea() {
        return fgclGeographicArea;
    }

    public void setFgclGeographicArea(FGCLGeographicArea fgclGeographicArea) {
        this.fgclGeographicArea = fgclGeographicArea;
    }

    @Override
    public String toString() {
        return "Age group, year, Geographic Area ID: "+ ageGroup +","+censusYear+ ","+geographicArea+ " ( Age ID: " +ageID+ " ) \n" +
                "> Population: combined, male, female: " + combined + "," + male + ","+ female;
    }
}
