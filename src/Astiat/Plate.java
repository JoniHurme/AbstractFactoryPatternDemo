package Astiat;

//Concrete product
public class Plate implements DishInterface {
    @Override
    public void getDish() {
        System.out.printf("Plate\n");
    }
}
