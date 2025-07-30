package com.cdsb.Class.Mammals;

import com.cdsb.Class.Animals;
import com.cdsb.Enums.Behaviour;
import com.cdsb.Enums.Feed;
import com.cdsb.Enums.Habitats;
import com.cdsb.Enums.Mammal;
import com.cdsb.Enums.Species;


public class Zebra extends Animals {

    private int habitatSize;
    private Feed feed;
    private int frequency;
    private boolean cares;
    private Mammal specie;

    public Zebra(int habitatSize, Feed feed, int frequency, boolean cares, Mammal zebra){
        super(Behaviour.PREY,Habitats.TERRESTRIAL);
        this.cares=cares;
        this.feed=feed;
        this.frequency=frequency;
        this.habitatSize=habitatSize;
        this.specie=Mammal.ZEBRA;

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

     @Override
     public void makeSounds() {
       System.out.println("Holaaaa, soy una cebraaaaa");
     }
     @Override
     public void habitatExact() {
       System.out.println("Vivo en la sabana y corro mucho ");
     }
     @Override
     public void animaType() {
        System.out.println("Soy un mamífero");
     }
     @Override
    public String toString() {
        return "Zebra [behaviour=" + behaviour + ", habitat=" + habitat + ", habitatSize=" + habitatSize + ", feed="
                + feed + ", frequency=" + frequency + ", cares=" + cares + ", specie=" + specie + "]";
    }



}
