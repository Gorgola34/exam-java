package Class.Mammals;

import Class.Animals;
import Enums.Habitats;

public class Zebra extends Animals {

    double habitatSize;
    String feed;
    int frequency;
    boolean cares;

    public Zebra(String behaviourWild,Habitats habitat, double habitatSize, String feed, int frequency, boolean cares){
        super(behaviourWild, habitat);
        this.cares=cares;
        this.feed=feed;
        this.frequency=frequency;
        this.habitatSize=habitatSize;

    }

}
