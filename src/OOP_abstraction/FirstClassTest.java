package OOP_abstraction;

public class FirstClassTest {
    public static void main(String[] args){

        FirstClass car=new FirstClass();
        car.setCartype("Sports Car");
        System.out.println(car.getCartype());

        FirstClass sport=new FirstClass();
        sport.setSporttype("Cricket");
        System.out.println(sport.getSporttype());
    }
}
