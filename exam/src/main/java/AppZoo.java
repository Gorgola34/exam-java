import Class.Birds.Parrot;
import Class.Birds.Toucan;
import Class.Mammals.Elephant;
import Class.Mammals.Lion;
import Class.Mammals.Zebra;
import Enums.Feed;
import Enums.Habitats;

public class AppZoo {

    public static void main(String[] args) {

        Lion l = new Lion("Relax", Habitats.TERRESTRIAL, 28.3,Feed.CARNIVOROUS, 3, true);
        Elephant e= new Elephant("Angry", Habitats.TERRESTRIAL, 30,Feed.HERBIVOROUS, 1, true);
        Zebra z = new Zebra("Sad", Habitats.TERRESTRIAL, 12,Feed.HERBIVOROUS, 1, true);
        Parrot p = new Parrot("Happy",Habitats.TERRESTRIAL,4.2,Feed.OMNIVOROUS,2,false);
        Toucan t = new ToucaN("Angry",Habitats.TERRESTRIAL, 1.2, Feed.OMNIVOROUS, 1, false);

    }

}
