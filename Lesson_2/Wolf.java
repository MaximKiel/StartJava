public class Wolf {

    String gender;
    String name;
    double weight;
    int age;
    String color;

    void go() {
        System.out.println("Волк " + name + " идет");
    }

    void sit() {
        System.out.println("Волк " + name + " сидит");
    }

    void run() {
        System.out.println("Волк " + name + " бежит");
    }

    void howl() {
        System.out.println("Волк " + name + " воет");
    }

    void hunt() {
        System.out.println("Волк " + name + " охотится");
    }
}