package Class.Reptiles;

import Class.Animals;
import Enums.Feed;
import Enums.Habitats;
import Enums.Species;

public class Snake extends Animals {

    int habitatSize;
    Feed feed;
    int frequency;
    boolean cares;
    Species specie;

    public Snake(String behaviourWild, Habitats habitat, int habitatSize, Feed feed, int frequency, boolean cares, Species specie){
        super(behaviourWild,habitat);
        this.cares=cares;
        this.feed=feed;
        this.frequency=frequency;
        this.cares=cares;
        this.specie=specie;

    }


}
