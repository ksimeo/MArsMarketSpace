package com.ksimeo.arsu.rest.dao;

import com.ksimeo.arsu.core.models.Basket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

//import java.sql.DriverManager;

/**
 * @author Ksimeo 01.11.2015.
 */
public class BasketDao {

    private static final String JDBC_URL = "jdbc:mysql://127.0.0.1:3306/marsmarket_db";
    private static final String USER_NAME = "root";
    private static final String USER_PASSWORD = "root";

    public void addBasket(Basket basket) {
        try {
            Connection conn = null;
            PreparedStatement ps = null;
            try {
                conn = DriverManager.getConnection(JDBC_URL, USER_NAME, USER_PASSWORD);
                ps = conn.prepareStatement("INSERT INTO marsmarket_db.baskets VALUES(?, ?, ?, ?, ?)");
                ps.setInt(1, basket.getId());
                ps.setString(2, basket.getName());
                ps.setString(3, basket.getSurname());
                ps.setString(4, basket.getEmail());
                ps.setString(5, basket.getNumber());
            } finally {
                if(conn != null){
                    conn.close();
                    conn = null;
                }
                if(ps != null) {
                    ps.close();
                    ps = null;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
//        java.sql.Driver driver = new com.mysql.jdbc.Driver();
    }

    public List<Basket> getBaskets() {
        try {
            Connection conn = null;
            PreparedStatement ps = null;
            ResultSet rs = null;
            try {
                conn = DriverManager.getConnection(JDBC_URL, USER_NAME, USER_PASSWORD);
                ps = conn.prepareStatement("SELECT * FROM marsmarket_db.baskets");
                rs = ps.executeQuery();
                List<Basket> result = new ArrayList<Basket>();
                Basket tmpBasket = null;
                while (rs.next()) {
                    tmpBasket = new Basket(rs.getInt("id"), rs.getString("name"), rs.getString("surname"),
                            rs.getString("email"), rs.getString("telnumber"));
                    result.add(tmpBasket);
                }

                return result;
            } finally {
                if(conn != null) {
                    conn = null;
                }
                if(ps != null) {
                    ps = null;
                }
                if(rs != null) {
                    rs = null;
                }
            }
        } catch (Exception e) {
            return null;
        }
    }

}
