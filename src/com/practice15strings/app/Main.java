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

    }
}
