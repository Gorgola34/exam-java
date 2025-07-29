package Class.Mammals;

import Class.Animals;
import Enums.Habitats;

public class Elephant extends Animals {

    private double habitatSize;
    private String feed;
    private int frequency;
    private boolean cares;

    public Elephant(String behaviourWild,Habitats habitat, double habitatSize, String feed, int frequency,boolean cares){
        super(behaviourWild, habitat);
        this.habitatSize=habitatSize;
        this.frequency=frequency;
        this.feed=feed;
        this.cares=cares;

    }
    // public double getHabitatSize(){
    //     return habitatSize;
    // }
    // public String getFeed(){
    //     return feed;
    // }
    // public int getFrequency(){
    //     return frequency;
    // }
    // public String getCares(){
    //     return cares;
    // }



}
