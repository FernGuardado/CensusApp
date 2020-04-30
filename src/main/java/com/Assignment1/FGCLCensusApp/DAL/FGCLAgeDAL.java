package com.Assignment1.FGCLCensusApp.DAL;

import com.Assignment1.FGCLCensusApp.beans.FGCLAge;
import com.Assignment1.FGCLCensusApp.beans.FGCLGeographicArea;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FGCLAgeDAL {

    public static List<FGCLAge> getGeoDetails(int alternativeCode){
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println(e);
            return null;
        }

        String dbURL = "jdbc:mysql://localhost:3306/censusdb?serverTimezone=UTC";
        String username = "root";
        String password = "";

        String query = "SELECT geoa.name,geoa.geographicAreaID, geoa.code, geoa.alternativeCode, geoa.level,\n" +
                "(SELECT FORMAT(SUM(a.combined), 0)  \n" +
                "FROM AGE a\n" +
                "JOIN GEOGRAPHICAREA geoa\n" +
                "ON a.geographicArea = geoa.geographicAreaID\n" +
                "WHERE a.censusYear = 1\n" +
                "AND a.ageGroup = 1\n" +
                "AND geoa.alternativeCode = "+alternativeCode+") AS \"Total Population\",\n" +
                "ag.male AS \"Male\", ag.female AS \"Female\" \n"+
                "FROM GEOGRAPHICAREA geoa,AGE ag\n" +
                "WHERE geoa.alternativeCode = "+alternativeCode +"\n"+
                "LIMIT 1";

        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            connection = DriverManager.getConnection(
                    dbURL, username, password);

            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();

            ArrayList<FGCLAge> geolist = new ArrayList<>();
            while (rs.next()) {
                FGCLAge a = new FGCLAge();
                FGCLGeographicArea ga = new FGCLGeographicArea();
                a.setFgclGeographicArea(ga);
                a.getFgclGeographicArea().setGeographicAreaID(rs.getInt("geographicAreaID"));
                a.getFgclGeographicArea().setName(rs.getString("name"));
                a.getFgclGeographicArea().setCode(rs.getInt("code"));
                a.getFgclGeographicArea().setAlternativeCode(rs.getInt("alternativeCode"));
                a.getFgclGeographicArea().setLevel(rs.getInt("level"));
                a.getFgclGeographicArea().setTotalPopulation(rs.getString("Total Population"));
                a.setMale(rs.getInt("male"));
                a.setFemale(rs.getInt("female"));
                geolist.add(a);
            }
            rs.close();
            connection.close();
            return geolist;
        } catch (SQLException e) {
            System.err.println(e);
            return null;
        }


    }
}
