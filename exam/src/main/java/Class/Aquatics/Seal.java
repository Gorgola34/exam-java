package Class.Aquatics;

import Class.Animals;
import Enums.Feed;
import Enums.Habitats;
import Enums.Species;

public class Seal extends Animals {

    int habitatSize;
    Feed feed;
    int frequency;
    boolean cares;
    Species specie;

    public Seal(String behaviourWild, Habitats habitat, int habitatSize, Feed feed, int frequency,boolean cares, Species specie){
        super(behaviourWild, habitat);
        this.cares=cares;
        this.feed=feed;
        this.frequency=frequency;
        this.habitatSize=habitatSize;
        this.specie=specie;
    }


}
