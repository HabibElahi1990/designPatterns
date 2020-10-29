package creational.singleton;

import org.junit.Assert;
import org.junit.Test;

import java.sql.*;

/**
 * Created by habib.elahi1990 on 11/4/2018.
 */
public class DBConnectionTest {
    @Test
    public void getInstance() {

        DBConnection dbConnection = DBConnection.getInstance();
        Connection connection = dbConnection.getConnection();
        String createPerson = "CREATE TABLE PERSON (ID INT PRIMARY KEY, FIRSTNAME VARCHAR(50),LASTNAME VARCHAR(100))";
        try (Statement statement = connection.createStatement()) {
            statement.execute(createPerson);
            System.out.println("create successful");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String insertPerson = "INSERT INTO PERSON (ID,FIRSTNAME,LASTNAME) VALUES (?,?,?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertPerson)) {

            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, "Habib");
            preparedStatement.setString(3, "Elahi");
            preparedStatement.executeUpdate();

            preparedStatement.setInt(1, 2);
            preparedStatement.setString(2, "Hosein");
            preparedStatement.setString(3, "Elahi");
            preparedStatement.executeUpdate();

            System.out.println("insert successful");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String selectCount = "SELECT COUNT(*) FROM PERSON";
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(selectCount);
            if (resultSet.next()) {
                System.out.println("count person = " + resultSet.getInt(1));
                Assert.assertEquals(resultSet.getInt(1),2);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}