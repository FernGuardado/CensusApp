package com.Assignment1.FGCLCensusApp.beans;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@Entity
@EntityScan(basePackageClasses=FGCLGeographicArea.class)
@Table(name = "GEOGRAPHICAREA")
public class FGCLGeographicArea {
    @Id
    @Column(name = "geographicAreaID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int geographicAreaID;
    @Column(name = "code")
    private int code;
    @Column(name = "level")
    private long level;
    @Column(name = "name")
    private String name;
    @Column(name = "alternativeCode")
    private long alternativeCode;

    private String TotalPopulation;

    public int getGeographicAreaID() {
        return geographicAreaID;
    }

    public void setGeographicAreaID(int geographicAreaID) {
        this.geographicAreaID = geographicAreaID;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public long getLevel() {
        return level;
    }

    public void setLevel(long level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAlternativeCode() {
        return alternativeCode;
    }

    public void setAlternativeCode(long alternativeCode) {
        this.alternativeCode = alternativeCode;
    }

    public String getTotalPopulation() {
        return TotalPopulation;
    }

    public void setTotalPopulation(String totalPopulation) {
        TotalPopulation = totalPopulation;
    }

    @Override
    public String toString() {
        return "Area name, alternative code: "+ name +","+ alternativeCode + " ( ID: " +geographicAreaID+ " )";
    }
}
