package Tehtaat;

import Astiat.DishInterface;
import Aterimet.SilverWares;

//Abstract factory that interacts with the interfaces of products.
public abstract class AbstractFactory {
    public abstract SilverWares getType(String silverType);
    public abstract DishInterface getDish(String dishType);
}
