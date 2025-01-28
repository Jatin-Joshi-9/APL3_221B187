public class Application {
    public static void main(String[] args) {
        // Non-static method scenario
        Mother m1 = new Child();
        m1.show(); // Calls the Child's show() method due to runtime polymorphism

        // Uncomment the following scenarios one by one to test static behavior
        
        // Static in Mother only
        // class Mother {
        //     static void show() {
        //         System.out.println("Static show method in Mother class");
        //     }
        // }

        // Static in Child only
        // class Child {
        //     static void show() {
        //         System.out.println("Static show method in Child class");
        //     }
        // }

        // Static in both
        // Mother.show();
        // Child.show();
    }
}