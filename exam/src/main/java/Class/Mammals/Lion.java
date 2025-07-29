package Class.Mammals;

import Class.Animals;
import Enums.Habitats;

public class Lion extends Animals {

    private double habitatSize;
    private String feed;
    private int frequency;
    private boolean cares;

    public Lion(String behaviourWild, Habitats habitat, double size, String feed, int frequency, boolean cares){
        super(behaviourWild, habitat);


    }
    // public double getSize(){
    //     return habitatSize;
    // }
    // public String getfeed(){
    //     return feed;
    // }
    // public int getFrequency(){
    //     return frequency;
    // }
    // public String getCares(){
    //     return cares;
    // }



}
