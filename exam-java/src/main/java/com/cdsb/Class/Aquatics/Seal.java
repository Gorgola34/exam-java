package com.cdsb.Class.Aquatics;

import com.cdsb.Class.Animals;
import com.cdsb.Enums.Acuatic;
import com.cdsb.Enums.Behaviour;
import com.cdsb.Enums.Feed;
import com.cdsb.Enums.Habitats;
import com.cdsb.Enums.Species;



public class Seal extends Animals {

    int habitatSize;
    Feed feed;
    int frequency;
    boolean cares;
    Acuatic specie;

    public Seal( int habitatSize, Feed feed, int frequency,boolean cares, Species specie){
        super(Behaviour.SOCIABLE, Habitats.AQUATIC);
        this.cares=cares;
        this.feed=feed;
        this.frequency=frequency;
        this.habitatSize=habitatSize;
        this.specie=Acuatic.SEALS;
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
    public Acuatic getSpecie(){
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
       System.out.println("Soy una foca que se divierte");
     }
     @Override
     public void habitatExact() {
        System.out.println("Vivo en el mar");
     }
     @Override
     public void animaType() {
        System.out.println("Soy un animal acuático");


}

}
