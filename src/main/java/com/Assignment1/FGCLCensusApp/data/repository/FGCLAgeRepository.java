package com.Assignment1.FGCLCensusApp.data.repository;

import com.Assignment1.FGCLCensusApp.beans.FGCLAge;
import com.Assignment1.FGCLCensusApp.beans.FGCLGeographicArea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface FGCLAgeRepository extends CrudRepository<FGCLAge, Long> {
    @Query("SELECT a FROM FGCLAge a" +
            " WHERE a.fgclGeographicArea.alternativeCode = :altCode AND a.ageGroup = 1 AND a.censusYear = 1")
    List<FGCLAge> findByGeographicAreaAltCode(long altCode);

}
