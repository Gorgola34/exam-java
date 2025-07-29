package Class.Mammals;

import Class.Animals;
import Enums.Feed;
import Enums.Habitats;

public class Elephant extends Animals {

    private double habitatSize;
    private Feed feed;
    private int frequency;
    private boolean cares;

    public Elephant(String behaviourWild,Habitats habitat, double habitatSize, Feed feed, int frequency,boolean cares){
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
