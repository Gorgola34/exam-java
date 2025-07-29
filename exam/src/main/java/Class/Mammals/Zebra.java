package Class.Mammals;

import Class.Animals;
import Enums.Behaviour;
import Enums.Feed;
import Enums.Habitats;
import Enums.Species;

public class Zebra extends Animals {

    private int habitatSize;
    private Feed feed;
    private int frequency;
    private boolean cares;
    private Species specie;

    public Zebra(Behaviour behaviour,Habitats habitat, int habitatSize, Feed feed, int frequency, boolean cares, Species specie){
        super(behaviour, habitat);
        this.cares=cares;
        this.feed=feed;
        this.frequency=frequency;
        this.habitatSize=habitatSize;
        this.specie=specie;

    }

}
