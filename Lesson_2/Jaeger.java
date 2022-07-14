public class Jaeger {

    private String modelName;
    private String origin;
    private int speed;

    public Jaeger() {
    }

    public Jaeger(String modelName, String origin, int speed) {
        this.modelName = modelName;
        this.origin = origin;
        this.speed = speed;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void move() {
        System.out.println(modelName + " is moving");
    }

    public void shoot() {
        System.out.println(modelName + " is shooting");
    }
}