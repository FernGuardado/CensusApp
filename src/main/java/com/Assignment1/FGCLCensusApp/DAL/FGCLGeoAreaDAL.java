package com.Assignment1.FGCLCensusApp.DAL;


import com.Assignment1.FGCLCensusApp.beans.FGCLGeographicArea;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FGCLGeoAreaDAL {
    public static List<FGCLGeographicArea> selectAreaByLevel(int level) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println(e);
            return null;
        }

        String dbURL = "jdbc:mysql://localhost:3306/censusdb?serverTimezone=UTC";
        String username = "root";
        String password = "";

        String query = "SELECT * FROM GEOGRAPHICAREA" +
                " WHERE level=" + level;


        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection = DriverManager.getConnection(
                    dbURL, username, password);

            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            ArrayList<FGCLGeographicArea> arealevels = new ArrayList<>();
            while (rs.next()) {

                FGCLGeographicArea ga = new FGCLGeographicArea();
                ga.setGeographicAreaID(rs.getInt("geographicAreaID"));
                ga.setCode(rs.getInt("code"));
                ga.setLevel(rs.getInt("level"));
                ga.setName(rs.getString("name"));
                ga.setAlternativeCode(rs.getInt("alternativeCode"));
                arealevels.add(ga);
            }
            rs.close();
            connection.close();
            return arealevels;
        } catch (SQLException e) {
            System.err.println(e);
            return null;
        }
    }
    public static List<FGCLGeographicArea> selectAreaByKeyWord(String keyword){
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println(e);
        }

        String dbURL = "jdbc:mysql://localhost:3306/censusdb?serverTimezone=UTC";
        String username = "root";
        String password = "";

        String query = "SELECT * FROM GEOGRAPHICAREA " +
                "WHERE name LIKE '%" + keyword + "%'";

        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection = DriverManager.getConnection(
                    dbURL, username, password);

            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            ArrayList<FGCLGeographicArea> arealevels = new ArrayList<>();
            while (rs.next()) {
                FGCLGeographicArea ga = new FGCLGeographicArea();
                ga.setGeographicAreaID(rs.getInt("geographicAreaID"));
                ga.setCode(rs.getInt("code"));
                ga.setLevel(rs.getInt("level"));
                ga.setName(rs.getString("name"));
                ga.setAlternativeCode(rs.getInt("alternativeCode"));
                arealevels.add(ga);
            }
            rs.close();
            connection.close();
            return arealevels;
        } catch (SQLException e) {
            System.err.println(e);
            return null;
        }
    }
}
