public class Main {
    public static void main(String[] args) {

        Car bibikaCar = new Car("бибика");
        System.out.println(bibikaCar.getMaxSpeed());

        AmericanCar Mustang = new AmericanCar("Мустанг", 200);
        System.out.println(Mustang.getMaxSpeed());

        GermanCar BNW = new GermanCar("БНВ", 300);
        System.out.println(BNW.getMaxSpeed());     
        
        AmericanCarPlus Mustang2 = new AmericanCarPlus("Мустанг плюс", 200);
        System.out.println(Mustang2.getMaxSpeed());
        System.out.println(Mustang2.getMaxWeight());
    }
}
