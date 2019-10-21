package com.practice15strings.app;

import com.practice15strings.model.Tuneador;

public class Main
{
    public static void main(String[] args)
    {
        //Variables declaration
        String cad1 = "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        String cad2 = "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        double median  = 0;

        //Arrays declaration
        String myNewCads[];
        String myCads[] = {cad1,cad2};
        int vectorNumbers[] = {5,10,7,9,4,3,10,50,14,98};

        myNewCads = Tuneador.Tuena(myCads);

        for(int i = 0; i < myNewCads.length; i++)
        {
            System.out.println(myNewCads[i]);
        }

        median = Tuneador.Median(vectorNumbers);

        System.out.println("Median: "+median);

        //Return ascii code
        System.out.println(cad1.codePointAt(2));
        //Return ascii code before index
        System.out.println(cad1.codePointBefore(2));
        //
        System.out.println(cad1.codePointCount(1,7));
        //Compare cads
        System.out.println(cad1.compareTo(cad2));
        //
        System.out.println(cad1.equals(cad2));
        //
        System.out.println(cad1.concat(cad2));
        //
        System.out.println(cad1.contains("Lorem"));
        //
        System.out.println(String.valueOf(20));
        //
        System.out.println(cad1.endsWith("laborum."));
        //
        System.out.println(cad2.trim()+cad2.trim());
        //
        System.out.println(cad1.indexOf('s')); //Non greedy
        //
        System.out.println(cad1.lastIndexOf('s')); //Greedy
        //
        System.out.println(cad1.length());
    }
}
