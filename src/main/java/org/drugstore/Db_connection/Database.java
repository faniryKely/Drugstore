package org.drugstore.Db_connection;

import java.sql.Connection;

public class Database {
    public Connection CreateConnection() {
        try {
            System.getenv("DB_URL");
            System.getenv("DB_USERNAME");
            System.getenv("DB_URL");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
