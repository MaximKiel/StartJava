public class WolfTest {

    public static void main (String[] args){
        Wolf wolfAron = new Wolf();
        wolfAron.gender = "самец";
        wolfAron.name = "Арон";
        wolfAron.weight = 40.5;
        wolfAron.age = 7;
        wolfAron.color = "серый";

        System.out.println("Пол волка: " + wolfAron.gender);
        System.out.println("Имя волка: " + wolfAron.name);
        System.out.println("Вес волка: " + wolfAron.weight + " кг");
        System.out.println("Возраст волка: " + wolfAron.age + " лет");
        System.out.println("Окрас волка: " + wolfAron.color);

        wolfAron.go();
        wolfAron.sit();
        wolfAron.run();
        wolfAron.howl();
        wolfAron.hunt();
    }
}