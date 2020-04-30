package com.Assignment1.FGCLCensusApp.data.repository;

import com.Assignment1.FGCLCensusApp.beans.FGCLUser;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FGCLUserRepository extends CrudRepository<FGCLUser, Integer> {

    @Query("SELECT u FROM FGCLUser u WHERE u.username= :username AND u.password= :password")
    public FGCLUser findByUsernameAndPassword(@Param("username") String username,
                                 @Param("password") String password);

}
