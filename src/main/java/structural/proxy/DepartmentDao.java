package structural.proxy;

import java.sql.SQLException;
/**
 * Created by h.elahi on 11/12/2018.
 */
public interface DepartmentDao {
    DBConnection getDbConnection();
    void insertNewDepartment(int depId, String departmentName) throws SQLException;
    String queryDepartmentName(int depId) throws SQLException;
}
