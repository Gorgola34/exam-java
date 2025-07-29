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

import com.cdsb.Enums.Feed;

import com.cdsb.Enums.Mammal;
import com.cdsb.Enums.Species;

public class AppZoo {

    public static void main(String[] args) {
        
        Lion l= new Lion( 20,Feed.CARNIVOROUS, 3, false, Mammal.LION );
        Elephant e= new Elephant(10, Feed.HERBIVOROUS, 1, false, Species.MAMMAL);
        Zebra z= new Zebra(40, Feed.HERBIVOROUS, 3, true,Species.MAMMAL);
        Parrot p = new Parrot(10,Feed.OMNIVOROUS, 5, false, Species.BIRDS);
        Toucan t = new Toucan( 6, Feed.OMNIVOROUS, 2, false, Species.BIRDS);
        Snake sn= new Snake(20,Feed.CARNIVOROUS,1,true,Species.REPTIL);
        Iguana i= new Iguana( 34, Feed.CARNIVOROUS, 2, false,Species.REPTIL);
        Dolphin d= new Dolphin(40, Feed.CARNIVOROUS, 3, false, Species.ACUATIC);
        Seal sl= new Seal( 15, Feed.CARNIVOROUS, 2, true, Species.ACUATIC);
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
