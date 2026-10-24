public class Info {
    String name;
    int age;

    Info(String n, int a) {
        name = n;
        age = a;
    }


    void displayInfo() {
        System.out.println("NAME: " +name);
        System.out.println("AGE: " + age);


    }

    public static void main(String[] args) {

        Info Info1 = new Info("AYAAN", 20);

        Info1.displayInfo();

    }
}