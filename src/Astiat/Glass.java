package Astiat;

//Concrete product
public class Glass implements DishInterface {
    @Override
    public void getDish(){
        System.out.printf("Glass\n");
    }
}
