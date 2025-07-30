package com.cdsb;

import com.cdsb.Class.Animals;
import com.cdsb.Class.Zoo;

public class AppZoo {

    public static void main(String[] args) {

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
        System.out.println("\nTERRARIO (ZONA 3)");
        for(Animals a: z1.getTerrarium()){
            System.out.println(a);
        }
        System.out.println("\nHABITAT ACUATICO");
        System.out.println("ZONA A");
        for(Animals a: z1.getAcuatic()){
            System.out.println(a);
        }





    }



        };

