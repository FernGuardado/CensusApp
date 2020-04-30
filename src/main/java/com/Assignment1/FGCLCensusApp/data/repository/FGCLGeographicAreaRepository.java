package com.Assignment1.FGCLCensusApp.data.repository;

import com.Assignment1.FGCLCensusApp.beans.FGCLGeographicArea;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface FGCLGeographicAreaRepository extends CrudRepository <FGCLGeographicArea, Long> {
    List<FGCLGeographicArea> findByLevel (Long level);
    List<FGCLGeographicArea> findByName (String name);
    @Query("SELECT g FROM FGCLGeographicArea g WHERE g.name LIKE %:keyword%")
    List<FGCLGeographicArea> findByNameLike (@Param("keyword") String keyword);
    FGCLGeographicArea findByAlternativeCode(int altCode);


}
