package Class;

import Enums.Behaviour;
import Enums.Habitats;

public abstract class Animals {

    private Behaviour behaviour;
    private Habitats habitat;

    public Animals(Behaviour behaviour, Habitats habitat){
        this.behaviour=behaviour;
        this.habitat=habitat;

    }
    public Behaviour getBehaviour(){
        return behaviour;
    }
    public Habitats getHabitat(){
        return habitat;
    }


}
