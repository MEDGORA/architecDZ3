public class GermanCar extends Car {

    private int speed;

    GermanCar(String modelName, int speed) {
        super(modelName);
        this.speed = speed; 
    }

    @Override
    public String getMaxSpeed() {
        return this.speed + " км/час";
    }
}