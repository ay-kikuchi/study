package com.example.jissen.practice.chap12;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class ItemsDAO {
    public ArrayList<Item> findByMinimumPrice(int price) {
        var itemList = new ArrayList<Item>();

        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (var con = DriverManager.getConnection("jdbc:h2:./dummy")) {
            var selectStmt = con.prepareStatement("SELECT * FROM ITEMSWHERE PRICE > ?");
            selectStmt.setInt(1, price);
            var rs = selectStmt.executeQuery();

            while(rs.next()) {
                var item = new Item();
                item.setName(rs.getString("NAME"));
                item.setPrice(rs.getInt("PRICE"));
                item.setWeight(rs.getInt("WEIGHT"));
                itemList.add(item);
            }
            return itemList;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
