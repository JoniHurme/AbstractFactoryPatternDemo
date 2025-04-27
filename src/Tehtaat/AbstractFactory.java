package Tehtaat;

import Astiat.DishInterface;
import Aterimet.SilverWares;

public abstract class AbstractFactory {
    public abstract SilverWares getType(String silverType);
    public abstract DishInterface getDish(String dishType);
}
