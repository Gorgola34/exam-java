import Class.Aquatics.Dolphin;
import Class.Aquatics.Seal;
import Class.Birds.Parrot;
import Class.Birds.Toucan;
import Class.Mammals.Elephant;
import Class.Mammals.Lion;
import Class.Mammals.Zebra;
import Class.Reptiles.Iguana;
import Class.Reptiles.Snake;
import Enums.Behaviour;
import Enums.Feed;
import Enums.Habitats;
import Enums.Species;

public class AppZoo {


    public static void main(String[] args) {

        Lion l = new Lion(Behaviour.PREDATOR, Habitats.TERRESTRIAL, 28,Feed.CARNIVOROUS, 3, true,Species.MAMMAL);
        Elephant e= new Elephant(Behaviour.PREY, Habitats.TERRESTRIAL, 30,Feed.HERBIVOROUS, 1, true,Species.MAMMAL);
        Zebra z = new Zebra(Behaviour.PREY, Habitats.TERRESTRIAL, 12,Feed.HERBIVOROUS, 1, true,Species.MAMMAL);
        Parrot p = new Parrot(Behaviour.PREY,Habitats.TERRESTRIAL,4,Feed.OMNIVOROUS,2,false,Species.BIRDS);
        Toucan t = new Toucan(Behaviour.PREY,Habitats.TERRESTRIAL, 21, Feed.OMNIVOROUS, 1, false,Species.BIRDS);
        Snake sn= new Snake(Behaviour.PREDATOR,Habitats.TERRARIUM,10,Feed.CARNIVOROUS,2,true,Species.REPTIL);
        Iguana i = new Iguana(Behaviour.PREDATOR, Habitats.TERRARIUM, 20, Feed.OMNIVOROUS, 1, false,Species.REPTIL);
        Dolphin d = new Dolphin(Behaviour.PREDATOR,Habitats.AQUATIC,30,Feed.OMNIVOROUS,2,true,Species.ACUATIC);
        Seal sl = new Seal(Behaviour.PREDATOR,Habitats.AQUATIC,22,Feed.CARNIVOROUS,3,true,Species.ACUATIC);



    }

}
