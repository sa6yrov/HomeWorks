package com.company;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.function.DoubleBinaryOperator;

public class TrainerDB {
    public void show() {
        String SQL = "select * from trainers t join sport_type st on t. type_sport = st.id";
        try (Connection conn = new DbConnection().connect()) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                System.out.println("Full name: " +
                        rs.getString("full_name") +
                        " | Salary: " + rs.getInt("salary"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public void showWithMolodec(){
        String SQL = "select full_name from trainers";
        try(Connection conn = new DbConnection().connect()) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            while(rs.next()){
                if(rs.getString("full_name").length() > 3){
                    System.out.println("Full name : " + rs.getString("full_name") + " molodec");
                }
                else System.out.println("Full name: " + rs.getString("full_name"));
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public int getTotalSalary(){
        String SQL = "select sum(st.salary) from trainers t join sport_type st on t.type_sport = st.id";
        int totalAmount = 0;
        try(Connection conn = new DbConnection().connect()){
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            rs.next();
            totalAmount = rs.getInt(1);
            }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return totalAmount;
    }
//    public List<Trainer> getTrainers() {
//        String SQL = "select * from trainers";
//        List<Trainer> trainers = new ArrayList<>();
//        try (Connection conn = new DbConnection().connect()) {
//            Statement stmt = conn.createStatement();
//            ResultSet rs = stmt.executeQuery(SQL);
//            while (rs.next()) {
//                Trainer trainer = new Trainer(
//                        rs.getInt("id"),
//                        rs.getString("full_name"),
//                        rs.getString("phone_number"),
//                        rs.getInt("type_sport"),
//                        rs.getString("inn")
//                );
//                trainers.add(trainer);
//            }
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//        return trainers;

//    }
//    public void show() {
//        for (Trainer t : getTrainers()) {
//            System.out.println(t);
//        }
//
//    }
}
