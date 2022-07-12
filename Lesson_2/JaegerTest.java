public class JaegerTest {

    public static void main (String[] args) {
        Jaeger jaegerOne = new Jaeger();

        jaegerOne.setModelName("Striker Eureka");
        jaegerOne.setOrigin("Australian");
        jaegerOne.setSpeed(10);

        jaegerOne.showInfo();
        jaegerOne.move();
        jaegerOne.shoot();

        Jaeger jaegerTwo = new Jaeger("Gipsy Danger", "USA", 7);

        jaegerTwo.showInfo();
        jaegerTwo.move();
        jaegerTwo.shoot();
    }
}