package Class.Birds;

import Class.Animals;
import Enums.Feed;
import Enums.Habitats;

public class Toucan extends Animals {


    double habitatSize;
    Feed feed;
    int frequency;
    boolean cares;

    public Toucan (String behaviourWild, Habitats habitat,double habitatSize,Feed feed,int frequency,boolean cares){
        super(behaviourWild, habitat);
        this.cares=cares;
        this.feed=feed;
        this.frequency=frequency;
        this.habitatSize=habitatSize;
    }

}
