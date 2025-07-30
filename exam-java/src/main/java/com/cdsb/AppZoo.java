package com.cdsb;

import com.cdsb.Class.Animals;
import com.cdsb.Class.Zoo;

public class AppZoo {

    public static void main(String[] args) {

        Zoo z1= new Zoo();

        z1.addAcuatic();
        z1.addTerrarium();
        z1.addTerrestrialPreys();
        z1.addTerrestrialBirds();
        z1.addTerrestrialPredators();

        System.out.println("\nHABITAT TERRESTRE");
        System.out.println("ZONA LIBRE DE DEPREDADORES");
        for(Animals a:z1.getTerrestrialPreys()){
            System.out.println(a);
        }
        System.out.println("\nZONA DE DEPREDADORES");
        for(Animals a:z1.getTerrestrialPredators()){
            System.out.println(a);

        }

        System.out.println("\nZONA DE AVES TROPICALES");
        for(Animals a: z1.getTerrestrial2()){
            System.out.println(a);
        }
        System.out.println("\nTERRARIO (ZONA DE REPTILES)");
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

