package com.example.jissen.practice.chap12;

import java.sql.DriverManager;
import java.sql.SQLException;

public class SimpleDBOperationTest {
    public static void main(String args[]) {
        // ドライバの有効化
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // DB接続
        try (var con = DriverManager.getConnection("jdbc:h2:./src/com/example/jissen/practice/chap12/test")) {
            // テーブル作成
            var createTableStmt = con.createStatement();
            createTableStmt.executeUpdate(
                    "CREATE TABLE CAT " +
                    "(CAT_ID INTEGER NOT NULL," +
                            "NAME VARCHAR(255)," +
                            "PRIMARY KEY (CAT_ID))");

            // 初期データ挿入
            var insertDataStmt = con.prepareStatement(
                    "INSERT INTO CAT VALUES (?,?)");
            insertDataStmt.setInt(1, 1);
            insertDataStmt.setString(2, "たま");
            insertDataStmt.executeUpdate();

            // 取得テスト
            var selectAllStmt = con.prepareStatement("SELECT * FROM CAT");
            var rs = selectAllStmt.executeQuery();
            while(rs.next()) {
                System.out.println(rs.getString("NAME"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
