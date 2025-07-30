package com.cdsb.Class;

import java.util.ArrayList;
import java.util.List;

import com.cdsb.Class.Aquatics.Dolphin;
import com.cdsb.Class.Aquatics.Seal;
import com.cdsb.Class.Birds.Parrot;
import com.cdsb.Class.Birds.Toucan;
import com.cdsb.Class.Mammals.Elephant;
import com.cdsb.Class.Mammals.Lion;
import com.cdsb.Class.Mammals.Zebra;
import com.cdsb.Class.Reptiles.Iguana;
import com.cdsb.Class.Reptiles.Snake;
import com.cdsb.Enums.Acuatic;
import com.cdsb.Enums.Birds;
import com.cdsb.Enums.Feed;
import com.cdsb.Enums.Mammal;
import com.cdsb.Enums.Reptiles;
import com.cdsb.Interfaces.IAnimals;

public class Zoo {


    public static List<Animals> terrestrialPrey= new ArrayList<>();
    public static List<Animals> terrestrialPredators= new ArrayList<>();
    public static List<Animals> acuatic= new ArrayList<>();
    public static List<Animals> terrarium= new ArrayList<>();
    public static List<Animals> terrestrialBirds= new ArrayList<>();

    public void addTerrestrialPreys(){

        terrestrialPrey.add(new Zebra(30, Feed.HERBIVOROUS, 3, true,Mammal.ZEBRA));
        terrestrialPrey.add(new Elephant(10, Feed.HERBIVOROUS, 1, false, Mammal.ELEPHANT));

        }

    public void addTerrestrialPredators(){
      terrestrialPredators.add(new Lion(20,Feed.CARNIVOROUS, 3, false, Mammal.LION));
    }

    public void addTerrestrialBirds(){
        terrestrialBirds.add(new Toucan(6,Feed.OMNIVOROUS, 2, false, Birds.TOUCAN));
        terrestrialBirds.add(new Parrot(10, Feed.OMNIVOROUS, 5, false, Birds.PARROT));

        }

    public void addAcuatic(){
        acuatic.add(new Seal(15, Feed.CARNIVOROUS, 2, true, Acuatic.SEAL));
        acuatic.add(new Dolphin(40, Feed.CARNIVOROUS, 2, true,Acuatic.DOLPHIN));

        }

    public void addTerrarium(){
        terrarium.add(new Snake(20,Feed.CARNIVOROUS,1,true,Reptiles.SNAKE));
        terrarium.add(new Iguana(34, Feed.CARNIVOROUS, 2, false, Reptiles.IGUANA));
       
        }
    public List<Animals> getTerrarium(){
        return terrarium;
    }
     public List<Animals> getTerrestrialPreys(){
        return terrestrialPrey;
    }
    public List<Animals> getTerrestrialPredators(){
        return terrestrialPredators;
    }
     public List<Animals> getTerrestrial2(){
        return terrestrialBirds;
    }
     public List<Animals> getAcuatic(){
        return acuatic;
    }




}
