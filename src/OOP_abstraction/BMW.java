package OOP_abstraction;

public class BMW implements Car, Motor {

    public void engineSize() {
        System.out.println("Has to be minium v6");
    }


    public void bodyShape() {
        System.out.println("four doors and 5 seats");
    }


    public void fuelType() {
        System.out.println("Either gasoline or Hybrid");
    }


    public void carColor() {
        System.out.println("White, Black, Blue or Grey");
    }


    public void carSize() {
        System.out.println("anything look like car");
    }
}
