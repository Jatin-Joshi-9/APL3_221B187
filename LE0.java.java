import java.util.Scanner;

class Std {
    private String Name;
    private int age;

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAge(int age) {
        if(age<=0 || age>30){
            System.out.println("Please insert a valid Age");
            System.exit(0);
        }
        this.age = age;
    }

    public String getName() {
        return this.Name;
    }

    public int getAge() {
        return this.age;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Name of the Student\t");
        String Name=scanner.nextLine();
        System.out.print("Enter the Age of the Student\t");
        int age=scanner.nextInt();
        Std std = new Std();
        std.setName(Name);
        std.setAge(age);
        System.out.println("Name of Student: " + std.getName());
        System.out.println("Age of Student: " + std.getAge());
    }
}
