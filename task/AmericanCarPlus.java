public class AmericanCarPlus extends AmericanCar implements iMaxWeight {
    
    AmericanCarPlus(String modelName, int speed) {
        super(modelName, speed);
    }

    @Override
    public String getMaxWeight() {
        return "500 фунтов";
    }
}
