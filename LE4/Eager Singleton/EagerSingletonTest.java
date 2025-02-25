class Singleton {
    private static Singleton instance = new Singleton(); 
    public static int counter = 0;

    private Singleton() {
        counter++; 
    }

    public static Singleton getInstance() {
        System.out.println("Instance created");
        return instance;
    }
}

public class EagerSingletonTest {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(Singleton.counter);
    }
}
