package com.cdsb;

import com.cdsb.Class.Aquatics.Dolphin;
import com.cdsb.Class.Aquatics.Seal;
import com.cdsb.Class.Birds.Parrot;
import com.cdsb.Class.Birds.Toucan;
import com.cdsb.Class.Mammals.Elephant;
import com.cdsb.Class.Mammals.Lion;
import com.cdsb.Class.Mammals.Zebra;
import com.cdsb.Class.Reptiles.Iguana;
import com.cdsb.Class.Reptiles.Snake;
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
        Snake sn= new Snake(Behaviour.PREDATOR,Habitats.TERRARIUM,20,Feed.CARNIVOROUS,1,true,Species.REPTIL);
        Iguana i= new Iguana(Behaviour.PREDATOR,Habitats.TERRARIUM, 34, Feed.CARNIVOROUS, 2, false,Species.REPTIL);
        Dolphin d= new Dolphin(Behaviour.PREDATOR, Habitats.AQUATIC, 40, Feed.CARNIVOROUS, 3, false, Species.ACUATIC);
        Seal sl= new Seal(Behaviour.PREDATOR, Habitats.AQUATIC, 15, Feed.CARNIVOROUS, 2, true, Species.ACUATIC);
        l.showAnimal();
        System.out.println("--------");
        e.showAnimal();
        System.out.println("--------");
        z.showAnimal();
        System.out.println("--------");
        p.showAnimal();
        System.out.println("--------");
        t.showAnimal();
        System.out.println("--------");
        sn.showAnimal();
        System.out.println("--------");
        i.showAnimal();
        System.out.println("--------");
        d.showAnimal();
        System.out.println("--------");
        sl.showAnimal();

    }

}
