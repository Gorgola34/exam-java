package Class.Birds;

import Class.Animals;
import Enums.Behaviour;
import Enums.Feed;
import Enums.Habitats;
import Enums.Species;

public class Parrot extends Animals {

    int habitatSize;
    Feed feed;
    int frequency;
    boolean cares;
    Species specie;

    public Parrot(Behaviour behaviour, Habitats habitat, int habitatSize, Feed feed, int frequency,boolean cares, Species specie){
        super(behaviour, habitat);
        this.habitatSize=habitatSize;
        this.feed=feed;
        this.cares=cares;
        this.frequency=frequency;
        this.specie=specie;
    }

}
