package structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/**
 * Created by h.elahi on 11/12/2018.
 */
public class TransactionProxy implements InvocationHandler {

    private DepartmentDao dao;

    public TransactionProxy(DepartmentDao dao) {
        this.dao = dao;
    }

    //create proxy of DepartmentDao by Proxy class
    public static DepartmentDao createTransactionProxy(DepartmentDao dao) {
        return (DepartmentDao) Proxy.newProxyInstance(dao.getClass().getClassLoader(),
                dao.getClass().getInterfaces()
                , new TransactionProxy(dao));
    }

    //Override invoke method for call getConnection method in DepartmentDao and commit commands
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(dao, args);
        dao.getDbConnection().getConnection().commit();
        return result;
    }
}
