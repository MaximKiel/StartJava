public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();

        jaegerOne.setModelName("Striker Eureka");
        jaegerOne.setOrigin("Australian");
        jaegerOne.setSpeed(10);

        System.out.println("The Jaeger " + jaegerOne.getModelName() + " produced in " + jaegerOne.getOrigin() +
                " can move at a speed of " + jaegerOne.getSpeed());
        jaegerOne.move();
        jaegerOne.shoot();

        Jaeger jaegerTwo = new Jaeger("Gipsy Danger", "USA", 7);

        System.out.println("The Jaeger " + jaegerTwo.getModelName() + " produced in " + jaegerTwo.getOrigin() +
                " can move at a speed of " + jaegerTwo.getSpeed());
        jaegerTwo.move();
        jaegerTwo.shoot();
    }
}