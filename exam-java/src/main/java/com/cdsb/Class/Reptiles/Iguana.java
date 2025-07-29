package com.cdsb.Class.Reptiles;

import com.cdsb.Class.Animals;
import com.cdsb.Enums.Behaviour;
import com.cdsb.Enums.Feed;
import com.cdsb.Enums.Habitats;
import com.cdsb.Enums.Reptiles;
import com.cdsb.Enums.Species;
import com.cdsb.Interfaces.Live;

public class Iguana extends Animals implements Live {

    int habitatSize;
    Feed feed;
    int frequency;
    boolean cares;
    Reptiles specie;

    public Iguana( int habitatSize,Feed feed, int frequency,boolean cares, Species reptil){
        super(Behaviour.TERRITORIAL, Habitats.TERRARIUM);
        this.cares=cares;
        this.feed=feed;
        this.frequency=frequency;
        this.habitatSize=habitatSize;
        this.specie=Reptiles.IGUANA;

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
    public Reptiles getSpecie(){
        return specie;
    }

     public void showAnimal(){
        System.out.println("Specie: " + getSpecie());
        System.out.println("Behaviour:" + getBehaviour());
        System.out.println("Habitat:" + getHabitat());
        System.out.println("Habitat Size:" + getSize());
        System.out.println("Feed:" + getfeed());
        System.out.println("Frequency Feed:" + getFrequency());
        System.out.println("Need Cares?:" +getCares());
        System.out.println("Aislarlo? :" + liveWith());
        animaType();
        makeSounds();
        habitatExact();
    }
     @Override
     public void makeSounds() {
        System.out.println("Soy una Iguanaaa");
     }
     @Override
     public void habitatExact() {
       System.out.println("Me gusta la selva y vivo en ella");
     }
     @Override
     public void animaType() {
       System.out.println("Soy un reptil");
     }
     @Override
     public boolean liveWith() {
        return true;

     }


}
