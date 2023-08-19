public class AmericanCar extends Car {

    private int speed;

    AmericanCar(String modelName, int speed) {
        super(modelName);
        this.speed = speed; 
    }

    @Override
    public String getMaxSpeed() {
        return this.speed + " миль/час";
    }
}
