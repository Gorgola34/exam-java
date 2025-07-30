package com.cdsb.Class;

import java.util.ArrayList;

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
import com.cdsb.Enums.Behaviour;
import com.cdsb.Enums.Birds;
import com.cdsb.Enums.Feed;

import com.cdsb.Enums.Mammal;
import com.cdsb.Enums.Reptiles;
import com.cdsb.Enums.Species;
import com.cdsb.Interfaces.IAnimals;

import java.util.*;

public class AppZoo {

    public static void main(String[] args) {

        //ANIMALES AGRUPADOS POR HABITATS
        // AppZoo.addTerrestrial();
        // AppZoo.addTerrestrial2();
        // AppZoo.addAcuatic();
        // AppZoo.addTerrarium();

        Zoo z1= new Zoo();
        z1.addAcuatic();
        z1.addTerrarium();
        z1.addTerrestrial();
        z1.addTerrestrial2();

        System.out.println("\nHABITAT TERRESTRE");
        System.out.println("ZONA 1");
        for(Animals a:z1.getTerrestrial()){
            System.out.println(a);
        }
        System.out.println("\nZONA 2");
        for(Animals a: z1.getTerrestrial2()){
            System.out.println(a);
        }
        System.out.println("\nTERRARIO");
        for(Animals a: z1.getTerrarium()){
            System.out.println(a);
        }
        System.out.println("\nHABITAT ACUATICO");

        for(Animals a: z1.getAcuatic()){
            System.out.println(a);
        }





    }




        };

