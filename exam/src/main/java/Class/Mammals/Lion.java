package Class.Mammals;

import Class.Animals;
import Enums.Feed;
import Enums.Habitats;
import Enums.Species;

public class Lion extends Animals {

    private int habitatSize;
    private Feed feed;
    private int frequency;
    private boolean cares;
    private Species specie;

    public Lion(String behaviourWild, Habitats habitat, int habitatSize, Feed feed, int frequency, boolean cares, Species specie){
        super(behaviourWild, habitat);
        this.cares=cares;
        this.feed=feed;
        this.frequency=frequency;
        this.habitatSize=habitatSize;
        this.specie=specie;


    }
    // public double getSize(){
    //     return habitatSize;
    // }
    // public String getfeed(){
    //     return feed;
    // }
    // public int getFrequency(){
    //     return frequency;
    // }
    // public String getCares(){
    //     return cares;
    // }



}
