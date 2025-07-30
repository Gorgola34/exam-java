package com.cdsb.Class.Birds;

import com.cdsb.Class.Animals;
import com.cdsb.Enums.Behaviour;
import com.cdsb.Enums.Birds;
import com.cdsb.Enums.Feed;
import com.cdsb.Enums.Habitats;



public class Parrot extends Animals {

    int habitatSize;
    Feed feed;
    int frequency;
    boolean cares;
    Birds specie;

    public Parrot( int habitatSize, Feed feed, int frequency,boolean cares, Birds parrot){
        super(Behaviour.PREY,Habitats.TERRESTRIAL);
        this.habitatSize=habitatSize;
        this.feed=feed;
        this.cares=cares;
        this.frequency=frequency;
        this.specie=Birds.PARROT;
    }
    @Override
    public String toString() {
        return "Parrot [behaviour=" + behaviour + ", habitat=" + habitat + ", habitatSize=" + habitatSize + ", feed="
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
        System.out.println("Soy un LOOOOOOOROOOOO");
     }
     @Override
     public void habitatExact() {
        System.out.println("Vivo en zonas tropicales y no callo");
     }
     @Override
     public void animaType() {
       System.out.println("Soy un ave");
     }


}
