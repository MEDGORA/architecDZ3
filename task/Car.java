public class Car implements iMaxSpeed {

    private String modelName;

    Car (String modelName) {
        this.modelName = modelName;
    }

    @Override
    public String getMaxSpeed() {
        return "Тут будет максимальная скорость";
    }
}