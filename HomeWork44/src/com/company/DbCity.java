package com.company;

import java.sql.*;
import java.util.List;

public class DbCity {
    public void addCitiesToTable(List<City> cities) {
        for (int i = 0; i < cities.size(); i++) {
            String SQL = "insert into cities_3 (id, name, population) values (?, ?, ?)";
            try (Connection conn = new DbConnection().connect();
                 PreparedStatement pstmt = conn.prepareStatement(SQL)) {
                pstmt.setInt(1, cities.get(i).getId());
                pstmt.setString(2, cities.get(i).getName());
                pstmt.setInt(3, cities.get(i).getPopulation());
                pstmt.executeUpdate();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void updateCitiesInTable(List<City> cities) {
        String sql = "select id from cities_3";
        try (Connection conn = new DbConnection().connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            int i = 0;
            while (rs.next()) {
                if (cities.get(i).getId() == rs.getInt("id")) {
                    String SQL = "update cities_3 set name = ?, population = ? where id = ?";
                    try (PreparedStatement pstmt = conn.prepareStatement(SQL)) {
                        pstmt.setString(1, cities.get(i).getName());
                        pstmt.setInt(2, cities.get(i).getPopulation());
                        pstmt.setInt(3, rs.getInt("id"));
                        pstmt.executeUpdate();
                    } catch (SQLException e) {
                        System.out.println(e.getMessage());
                    }
                } else {
                    String SQL = "insert into cities_3 (id, name, population) values (?, ?, ?)";
                    try (PreparedStatement pstmt = conn.prepareStatement(SQL)) {
                        pstmt.setInt(1, cities.get(i).getId());
                        pstmt.setString(2, cities.get(i).getName());
                        pstmt.setInt(3, cities.get(i).getPopulation());
                        pstmt.executeUpdate();
                    } catch (SQLException e) {
                        System.out.println(e.getMessage());
                    }
                }
                i++;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

