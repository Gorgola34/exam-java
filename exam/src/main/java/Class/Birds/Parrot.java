package Class.Birds;

import Class.Animals;
import Enums.Feed;
import Enums.Habitats;
import Enums.Species;

public class Parrot extends Animals {

    int habitatSize;
    Feed feed;
    int frequency;
    boolean cares;
    Species specie;

    public Parrot(String behaviourWild, Habitats habitat, int habitatSize, Feed feed, int frequency,boolean cares, Species specie){
        super(behaviourWild, habitat);
        this.habitatSize=habitatSize;
        this.feed=feed;
        this.cares=cares;
        this.frequency=frequency;
        this.specie=specie;
    }

}
