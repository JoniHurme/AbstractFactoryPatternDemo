package FactoryMethod;

public class FactoryMethod {

    public static void main(String[] args) {

    //    This is the interface of silverware.
    interface SilverWares {
        void getType();
    }

    //    Concrete Fork
    class Fork implements SilverWares{
        @Override
        public void getType(){
            System.out.println("Fork");
        }
    }

//    Concrete Knife
    class Knife implements SilverWares {
        @Override
        public void getType(){
            System.out.println("Knife");
        }
    }

    //    This is an interface of SilverWareFactory.
    interface SilverWareFactory {
        SilverWares createSilverware();
    }

//    Concrete Fork Factory
    class ForkFactory implements SilverWareFactory {
        @Override
        public SilverWares createSilverware() {
            return new Fork();
        }
    }

//    Concrete Knife Factory
    class KnifeFactory implements SilverWareFactory {
        @Override
        public SilverWares createSilverware() {
            return new Knife();
        }
    }

//    Client calls for new forks and knifes.
        SilverWareFactory HaarukkaTehdas = new ForkFactory();       // HaarukkaTehdas creates new Fork Factory
        SilverWares Haarukka = HaarukkaTehdas.createSilverware();   // Haarukka calls HaarukkaTehdas to create a new fork
        Haarukka.getType();                                         // Function of Fork class.

        SilverWareFactory VetisiTehdas = new KnifeFactory();        // Same stuff that was done with forks now with knifes.
        SilverWares Vetisi = VetisiTehdas.createSilverware();
        Vetisi.getType();

    }
}



