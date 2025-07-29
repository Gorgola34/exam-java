package Class.Birds;

import Class.Animals;
import Enums.Behaviour;
import Enums.Feed;
import Enums.Habitats;
import Enums.Species;

public class Toucan extends Animals {


    int habitatSize;
    Feed feed;
    int frequency;
    boolean cares;
    Species specie;

    public Toucan (Behaviour behaviour, Habitats habitat,int habitatSize,Feed feed,int frequency,boolean cares, Species specie){
        super(behaviour, habitat);
        this.cares=cares;
        this.feed=feed;
        this.frequency=frequency;
        this.habitatSize=habitatSize;
    }

}
