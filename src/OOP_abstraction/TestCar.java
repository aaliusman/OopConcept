package OOP_abstraction;

public class TestCar {
    public static void main(String[] args){

        Car car=new Toyota();
        car.bodyShape();
        car.engineSize();
        car.fuelType();

        Toyota car2=new Toyota();
        car2.hydrolicBreak();

        Motor luxuryCar= new BMW();
        luxuryCar.carColor();
        luxuryCar.carSize();


        ModernCar mdCar=new Toyota();
        mdCar.electricCar();
        mdCar.solarCar();




    }
}
