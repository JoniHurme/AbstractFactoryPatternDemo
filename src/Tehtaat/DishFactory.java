package Tehtaat;

import Astiat.*;
import Aterimet.SilverWares;

//Factory class for Dish products. Eats dishType and spits out correct Dish.
public class DishFactory extends AbstractFactory {
    @Override
    public DishInterface getDish(String dishType) {
        if (dishType == null) {
            return null;
        }
        if (dishType.equals("Plate")) {
            return new Plate();
        }
        if (dishType.equals("Glass")) {
            return new Glass();
        }
        return null;
    }

//    For some reason the other type of product has to be here as well returning null?
    @Override
    public SilverWares getType(String silverType){
        return null;
    }
}
