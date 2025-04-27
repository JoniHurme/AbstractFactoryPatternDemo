package Tehtaat;

import Astiat.DishInterface;
import Aterimet.*;

public class SilverFactory extends AbstractFactory {
    @Override
    public SilverWares getType(String silverType) {
        if (silverType == null) {
            return null;
        }
        if (silverType.equals("Fork")) {
            return new Fork();
        }
        if (silverType.equals("Knife")) {
            return new Knife();
        }
        return null;
    }
    @Override
    public DishInterface getDish(String dishType) {
        return null;
    }
}
