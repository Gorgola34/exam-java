package com.cdsb.Class;

import com.cdsb.Enums.Behaviour;
import com.cdsb.Enums.Habitats;
import com.cdsb.Interfaces.IAnimals;

public abstract class Animals implements IAnimals {

    protected Behaviour behaviour;
    protected Habitats habitat;

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
    
    @Override
    public String toString() {
        return "Animals [behaviour=" + behaviour + ", habitat=" + habitat + "]";
    }


}
