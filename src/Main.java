import Astiat.DishInterface;
import Tehtaat.AbstractFactory;
import Tehtaat.SuperFactory;
import Aterimet.SilverWares;

public class Main {
    public static void main(String[] args) {

        AbstractFactory SilverFactory = SuperFactory.getFactory("hopeat");
        AbstractFactory DishFactory = SuperFactory.getFactory("astiat");


        SilverWares haarukka1 = SilverFactory.getType("Fork");
        haarukka1.getType();

        SilverWares veitsi1 = SilverFactory.getType("Knife");
        veitsi1.getType();


        DishInterface lautanen1 = DishFactory.getDish("Plate");
        lautanen1.getDish();

        DishInterface lasi1 = DishFactory.getDish("Glass");
        lasi1.getDish();
    }
}