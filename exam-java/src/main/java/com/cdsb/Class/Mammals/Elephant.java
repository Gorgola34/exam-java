package com.cdsb.Class.Mammals;

import com.cdsb.Class.Animals;
import com.cdsb.Enums.Behaviour;
import com.cdsb.Enums.Feed;
import com.cdsb.Enums.Habitats;
import com.cdsb.Enums.Mammal;
import com.cdsb.Enums.Species;


public class Elephant extends Animals {

    private int habitatSize;
    private Feed feed;
    private int frequency;
    private boolean cares;
    private Mammal specie;

    public Elephant(int habitatSize, Feed feed, int frequency,boolean cares, Mammal elephant){
        super(Behaviour.PREY, Habitats.TERRESTRIAL);
        this.habitatSize=habitatSize;
        this.frequency=frequency;
        this.feed=feed;
        this.cares=cares;
        this.specie=Mammal.ELEPHANT;

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
     public Mammal getSpecie(){
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
        animaType();
        makeSounds();
        habitatExact();
    }
    @Override
    public void makeSounds() {
        System.out.println("Soy un elefante");
    }
    @Override
    public void habitatExact() {
        System.out.println("Vivo en la sabana como buen elefante");
    }
    @Override
    public void animaType() {
        System.out.println("Soy un mamífero");
    }




}
