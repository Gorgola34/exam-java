package Class;

import Enums.Habitats;

public abstract class Animals {

    private String behaviourWild;
    private Habitats habitat;

    public Animals(String behaviourWild, Habitats habitat){
        this.behaviourWild=behaviourWild;
        this.habitat=habitat;

    }
    public String getBehaviour(){
        return behaviourWild;
    }
    public Habitats getHabitat(){
        return habitat;
    }


}
