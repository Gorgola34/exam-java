package com.cdsb.Class.Mammals;

import com.cdsb.Class.Animals;
import com.cdsb.Enums.Behaviour;
import com.cdsb.Enums.Feed;
import com.cdsb.Enums.Habitats;
import com.cdsb.Enums.Species;


public class Lion extends Animals {

    private int habitatSize;
    private Feed feed;
    private int frequency;
    private boolean cares;
    private Species specie;

    public Lion(Behaviour behaviour, Habitats habitat, int habitatSize, Feed feed, int frequency, boolean cares, Species specie){
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
    }



}
