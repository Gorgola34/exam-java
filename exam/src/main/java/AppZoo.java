import Class.Mammals.Elephant;
import Class.Mammals.Lion;
import Class.Mammals.Zebra;
import Enums.Habitats;

public class AppZoo {

    public static void main(String[] args) {

        Lion l = new Lion("Relax", Habitats.TERRESTRIAL, 28.3, "Carnivorous", 3, true);
        Elephant e= new Elephant("Angry", Habitats.TERRESTRIAL, 30, "Herbivorous", 1, true);
        Zebra z = new Zebra("Sad", Habitats.TERRESTRIAL, 12, "Herbivorous", 1, true);
        
    }

}
