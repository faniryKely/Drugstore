package org.drugstore.DbConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
    public Connection CreateConnection() {
        try {
            return DriverManager.getConnection(
            System.getenv("DB_URL"),
            System.getenv("DB_USERNAME"),
            System.getenv("DB_PASSWORD")
        );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
