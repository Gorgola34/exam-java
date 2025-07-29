package com.cdsb.Class.Birds;

import com.cdsb.Class.Animals;
import com.cdsb.Enums.Behaviour;
import com.cdsb.Enums.Feed;
import com.cdsb.Enums.Habitats;
import com.cdsb.Enums.Species;



public class Toucan extends Animals {


    int habitatSize;
    Feed feed;
    int frequency;
    boolean cares;
    Species specie;

    public Toucan (Behaviour behaviour, Habitats habitat,int habitatSize,Feed feed,int frequency,boolean cares, Species specie){
        super(behaviour, habitat);
        this.cares=cares;
        this.feed=feed;
        this.frequency=frequency;
        this.habitatSize=habitatSize;
        this.specie=specie;
    }
    public double getSize(){
        return habitatSize;
    }
    public Feed getfeed(){
        return feed;
    }
    public int getFrequency(){
        return frequency;
    }
    public boolean getCares(){
        return cares;
    }
    public Behaviour getBehaviour(){
        return behaviour;
    }
    public Habitats getHabitat(){
        return habitat;
    }
    public Species getSpecie(){
        return specie;
    }
     public void showAnimal(){
        System.out.println("Behaviour:" + getBehaviour());
        System.out.println("Habitat:" + getHabitat());
        System.out.println("Habitat Size:" + getSize());
        System.out.println("Feed:" + getfeed());
        System.out.println("Frequency Feed:" + getFrequency());
        System.out.println("Need Cares?:" +getCares());
        System.out.println("Specie:" + getSpecie());
        makeSounds();
        habitatExact();
    }
     @Override
     public void makeSounds() {
        System.out.println("Soy un señor Tucan");
     }
     @Override
     public void habitatExact() {
        System.out.println("Me gusta volar, vivo en sitios tropicales");
     }

}
