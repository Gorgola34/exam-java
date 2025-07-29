package Class;

import Enums.Habitats;

public class Lion extends Animals {

    private double size;
    private String feed;
    private int frequency;
    private String cares;

    public Lion(String behaviourWild, Habitats habitat, double size, String feed, int frequency, String cares){
        super(behaviourWild, habitat);


    }
    public double getSize(){
        return size;
    }
    public String getfeed(){
        return feed;
    }
    public int getFrequency(){
        return frequency;
    }
    public String getCares(){
        return cares;
    }



}
