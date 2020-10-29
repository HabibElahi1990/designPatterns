package structural.proxy;

import org.junit.Test;

/**
 * Created by h.elahi on 11/12/2018.
 */
/*
*user by second object that called proxy call insert and select for department
* commit do by proxy not Automatic by JDBC
 */
public class DepartmentDaoImplTest {

    @Test
    public void insertNewDepartment() throws Exception {
        DBConnection dbConnection = new DBConnection();
        dbConnection.openConnection();
        DepartmentDaoImpl departmentDao = new DepartmentDaoImpl(dbConnection);
        DepartmentDao transactionProxy = TransactionProxy.createTransactionProxy(departmentDao);
        transactionProxy.insertNewDepartment(12, "department_1");
        transactionProxy.insertNewDepartment(13, "department_2");
        transactionProxy.insertNewDepartment(14, "department_3");

        System.out.println(transactionProxy.queryDepartmentName(12));//department_1
    }

}