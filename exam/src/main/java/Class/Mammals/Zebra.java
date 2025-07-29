package Class.Mammals;

import Class.Animals;
import Enums.Feed;
import Enums.Habitats;

public class Zebra extends Animals {

    private double habitatSize;
    private Feed feed;
    private int frequency;
    private boolean cares;

    public Zebra(String behaviourWild,Habitats habitat, double habitatSize, Feed feed, int frequency, boolean cares){
        super(behaviourWild, habitat);
        this.cares=cares;
        this.feed=feed;
        this.frequency=frequency;
        this.habitatSize=habitatSize;

    }

}
