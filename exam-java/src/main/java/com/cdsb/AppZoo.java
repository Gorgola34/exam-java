package com.cdsb;

import com.cdsb.Class.Birds.Parrot;
import com.cdsb.Class.Birds.Toucan;
import com.cdsb.Class.Mammals.Elephant;
import com.cdsb.Class.Mammals.Lion;
import com.cdsb.Class.Mammals.Zebra;
import com.cdsb.Enums.Behaviour;
import com.cdsb.Enums.Feed;
import com.cdsb.Enums.Habitats;
import com.cdsb.Enums.Species;

public class AppZoo {

    public static void main(String[] args) {
        Lion l= new Lion(Behaviour.PREDATOR, Habitats.TERRESTRIAL, 20,Feed.CARNIVOROUS, 3, false, Species.MAMMAL);
        Elephant e= new Elephant(Behaviour.PREY, Habitats.TERRESTRIAL, 10, Feed.HERBIVOROUS, 1, false, Species.MAMMAL);
        Zebra z= new Zebra(Behaviour.PREY, Habitats.TERRESTRIAL, 40, Feed.HERBIVOROUS, 3, true,Species.MAMMAL);
        Parrot p = new Parrot(Behaviour.PREY, Habitats.TERRESTRIAL, 10,Feed.OMNIVOROUS, 5, false, Species.BIRDS);
        Toucan t = new Toucan(Behaviour.PREY, Habitats.TERRESTRIAL, 6, Feed.OMNIVOROUS, 2, false, Species.BIRDS);
        
    }

}
