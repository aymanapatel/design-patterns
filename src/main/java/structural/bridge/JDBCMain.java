package structural.bridge;

import java.sql.DriverManager;

public class JDBCMain {

    public static void main(String[] args) {
        DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
    }
}
