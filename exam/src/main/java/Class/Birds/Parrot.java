package Class.Birds;

import Class.Animals;
import Enums.Feed;
import Enums.Habitats;

public class Parrot extends Animals {

    double habitatSize;
    Feed feed;
    int frequency;
    boolean cares;

    public Parrot(String behaviourWild, Habitats habitat, double habitatSize, Feed feed, int frequency,boolean cares){
        super(behaviourWild, habitat);
        this.habitatSize=habitatSize;
        this.feed=feed;
        this.cares=cares;
        this.frequency=frequency;
    }

}
