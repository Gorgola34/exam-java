package Class.Mammals;

import Class.Animals;
import Enums.Behaviour;
import Enums.Feed;
import Enums.Habitats;
import Enums.Species;

public class Elephant extends Animals {

    private int habitatSize;
    private Feed feed;
    private int frequency;
    private boolean cares;
    private Species specie;

    public Elephant(Behaviour behaviour,Habitats habitat, int habitatSize, Feed feed, int frequency,boolean cares, Species specie){
        super(behaviour, habitat);
        this.habitatSize=habitatSize;
        this.frequency=frequency;
        this.feed=feed;
        this.cares=cares;
        this.specie=specie;

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
