package com.cdsb.Class.Aquatics;

import com.cdsb.Class.Animals;
import com.cdsb.Enums.Acuatic;
import com.cdsb.Enums.Behaviour;
import com.cdsb.Enums.Feed;
import com.cdsb.Enums.Habitats;



public class Seal extends Animals {

    int habitatSize;
    Feed feed;
    int frequency;
    boolean cares;
    Acuatic specie;

    public Seal( int habitatSize, Feed feed, int frequency,boolean cares, Acuatic seals){
        super(Behaviour.SOCIABLE, Habitats.AQUATIC);
        this.cares=cares;
        this.feed=feed;
        this.frequency=frequency;
        this.habitatSize=habitatSize;
        this.specie=Acuatic.SEAL;
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
     @Override
    public String toString() {
        return "Seal [behaviour=" + behaviour + ", habitat=" + habitat + ", habitatSize=" + habitatSize + ", feed="
                + feed + ", frequency=" + frequency + ", cares=" + cares + ", specie=" + specie + "]";
    }

}
