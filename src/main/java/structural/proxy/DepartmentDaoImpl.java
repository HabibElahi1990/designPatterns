package structural.proxy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * Created by h.elahi on 11/12/2018.
 */
public class DepartmentDaoImpl implements DepartmentDao {

    private final DBConnection dbConnection;

    public DepartmentDaoImpl(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    @Override
    public void insertNewDepartment(int depId, String departmentName) throws SQLException {
        Connection connection = dbConnection.getConnection();
        try (PreparedStatement preparedStatement =
                     connection.prepareStatement("insert into DEPARTMENTS values (? , ?)")) {
            preparedStatement.setInt(1, depId);
            preparedStatement.setString(2, departmentName);
            preparedStatement.executeUpdate();
        }
    }

    @Override
    public String queryDepartmentName(int depId) throws SQLException {
        Connection connection = dbConnection.getConnection();
        String result = null;
        try (PreparedStatement preparedStatement =
                     connection.prepareStatement("Select department_name from Departments where department_id = ?")) {
            preparedStatement.setInt(1, depId);
            try (ResultSet resultSet = preparedStatement.executeQuery();) {
                if (resultSet.next()) {
                    result = resultSet.getString(1);
                }
            }
        }
        return result;
    }

    @Override
    public DBConnection getDbConnection() {
        return dbConnection;
    }
}
