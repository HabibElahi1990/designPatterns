package creational.singleton;

/**
 * Created by habib.elahi1990 on 11/4/2018.
 */
public class SingletonClass {

    //create instance of Class as static
    private static SingletonClass singletonClass = null;

    //private constructor because in design pattern Singleton should constructor define private
    private SingletonClass() {

    }

    //get instance of class
    public static SingletonClass getInstance() {

        //if singletonClass == null synchronized running as a result reducing cost
        if (singletonClass == null) {

            //use to synchronized because prevention from concurrency like used Threads
            synchronized (SingletonClass.class) {

                //if singletonClass == null get instance of SingletonClass
                if (singletonClass == null) {
                    singletonClass = new SingletonClass();
                }
            }
        }
        return singletonClass;
    }
}
