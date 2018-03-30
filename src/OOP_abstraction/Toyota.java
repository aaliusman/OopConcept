package OOP_abstraction;

public class Toyota extends ModernCar implements Car {

    public void engineSize() {
        System.out.println("3.5 litter");

    }


    public void bodyShape() {
        System.out.println("5 door Sports utility vehicle");

    }


    public void fuelType() {
        System.out.println("Gasoline");

    }
    public void hydrolicBreak(){
        System.out.println("this car will introduce hydroli break in the market");
    }


    public void electricCar() {
        System.out.println("this car doesn't need gasoline");

    }
}
