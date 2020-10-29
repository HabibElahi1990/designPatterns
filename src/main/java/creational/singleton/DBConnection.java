package creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by habib.elahi1990 on 11/4/2018.
 */
public class DBConnection {

    //use to class Logger for logging in  DBConnection class
    private static final Logger LOGGER = Logger.getLogger(DBConnection.class.getName() );

    //user from DB h2 in create DataBase test in memory without userName and password
    public static final String DB_DRIVER="org.h2.Driver";
    public static final String DB_CONNECTION="jdbc:h2:mem:test";
    public static final String DB_USER="";
    public static final String DB_PASSWORD="";


    private static DBConnection dbConnection=null;
    private Connection connection;

    private DBConnection() {
        initialConnection();
    }

    public Connection getConnection() {
        return connection;
    }

    //get instance from DBConnection class as singleton
    public static DBConnection getInstance(){
        if(dbConnection==null){
            synchronized (DBConnection.class){
                if(dbConnection==null){
                    dbConnection=new DBConnection();
                }
            }
        }
        return dbConnection;
    }

    private void initialConnection() {

        try {
            //load Driver
            Class.forName(DB_DRIVER);

            //create connection
            connection= DriverManager.getConnection(DB_CONNECTION,DB_USER,DB_PASSWORD);
        } catch (ClassNotFoundException e) {
            LOGGER.log(Level.INFO,e.getMessage());
        } catch (SQLException e) {
            LOGGER.log(Level.INFO,e.getMessage());
        }
    }
}
