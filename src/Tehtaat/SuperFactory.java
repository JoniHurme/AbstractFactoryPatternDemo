package Tehtaat;

//Super Factory that creates factories based on "laite" string.
public class SuperFactory {
    public static AbstractFactory getFactory(String laite){
        if (laite.equals("hopeat")) {
            return new SilverFactory();
        }
        if (laite.equals("astiat")) {
            return new DishFactory();
        }
        return null;
    }
}
