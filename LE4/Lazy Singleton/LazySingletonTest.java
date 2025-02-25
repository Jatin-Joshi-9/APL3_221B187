class Singleton {
    private static Singleton instance;  
    public static int counter = 0;    

    private Singleton() {
        counter++;  
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            System.out.println("Instance created");
            instance = new Singleton(); 
        }
        return instance;
    }
}

public class LazySingletonTest {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();  
        Singleton singleton2 = Singleton.getInstance();  
        System.out.println("Counter: " + Singleton.counter);      }
}
