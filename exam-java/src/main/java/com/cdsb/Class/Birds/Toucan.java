package com.cdsb.Class.Birds;

import com.cdsb.Class.Animals;
import com.cdsb.Enums.Behaviour;
import com.cdsb.Enums.Birds;
import com.cdsb.Enums.Feed;
import com.cdsb.Enums.Habitats;
import com.cdsb.Interfaces.IAnimals;




public class Toucan extends Animals implements IAnimals {


    int habitatSize;
    Feed feed;
    int frequency;
    boolean cares;
    Birds specie;

    public Toucan (int habitatSize,Feed feed,int frequency,boolean cares, Birds toucan){
        super(Behaviour.PREY, Habitats.TERRESTRIAL);
        this.cares=cares;
        this.feed=feed;
        this.frequency=frequency;
        this.habitatSize=habitatSize;
        this.specie=Birds.TOUCAN;
    }
    @Override
    public String toString() {
        return "Toucan [behaviour=" + behaviour + ", habitat=" + habitat + ", habitatSize=" + habitatSize + ", feed="
                + feed + ", frequency=" + frequency + ", cares=" + cares + ", specie=" + specie + "]";
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
    public Birds getSpecie(){
        return specie;
    }

     @Override
     public void makeSounds() {
        System.out.println("Soy un señor Tucan");
     }
     @Override
     public void habitatExact() {
        System.out.println("Me gusta volar, vivo en sitios tropicales");
     }
     @Override
     public void animaType() {
      System.out.println("Soy un ave");
     }



}
