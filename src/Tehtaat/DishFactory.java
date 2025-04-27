package Tehtaat;

import Astiat.*;
import Aterimet.SilverWares;

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

    @Override
    public SilverWares getType(String silverType){
        return null;
    }
}
