class App {
    // Declaring properties
    String type; // kotlin, java based, flutter based
    String os; // for apple, android

    // Declaring methods
    public void output() {
        System.out.println("This app is for Human benefit!");
    }

    public void greetings() {
        System.out.println("Welcome to the APP");
    }

    public void displayOS() { // Changed method name from system to displayOS
        System.out.println(this.os);
    }
}

public class ObjectDemo { // Changed class name to ObjectDemo
    public static void main(String[] args) {
        App app1 = new App(); // 1st object creation
        app1.type = "Kotlin";
        app1.os = "Android";

        App app2 = new App(); // 2nd Object creation
        app2.type = "Java";
        app2.os = "Apple";

        app1.output();
        app2.output();

        app1.greetings();
        app2.greetings();

        app1.displayOS();
        app2.displayOS();
    }
}
