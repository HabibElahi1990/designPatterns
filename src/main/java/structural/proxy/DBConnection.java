package structural.proxy;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;
/**
 * Created by h.elahi on 11/12/2018.
 */
public class DBConnection {
    private static final Logger LOGGER = Logger.getLogger(DBConnection.class.getName());
    private Connection connection;


    public static final String DB_DRIVER="org.h2.Driver";
    public static final String DB_CONNECTION="jdbc:h2:mem:test";
    public static final String DB_USER="";
    public static final String DB_PASSWORD="";

    //get driver DB h2
    public DBConnection() {
        try {
            Class.forName(DB_DRIVER);
        } catch (ClassNotFoundException e) {
            LOGGER.severe(e.getMessage());
            throw new IllegalStateException("Please Load Database Driver", e);
        }

    }


    //user from DB h2 in create DataBase test in memory without userName and password
    //create DEPARTMENTS table
    public Connection openConnection() throws SQLException {
        this.connection = DriverManager.getConnection(DB_CONNECTION,
                DB_USER,DB_PASSWORD);
        connection.setAutoCommit(false);
        LOGGER.info("Connection established successfully.");
        try(Statement statement =  connection.createStatement()) {
            statement.execute("create  table IF NOT EXISTS  DEPARTMENTS (department_id integer not null, department_name varchar(255), primary key (department_id))");
        }
        return connection;
    }

    public Connection getConnection() {
        return connection;
    }

    //close connection that opens in openConnection method
    public void closeConnection() throws SQLException {
        if (connection != null) {
            connection.close();
            LOGGER.info("Connection Closed.");
        }
    }

}
