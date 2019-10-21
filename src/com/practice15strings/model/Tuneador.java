package com.practice15strings.model;

public class Tuneador
{
    public static String[] Tuena(String[] cads){
        for(int i =0; i < cads.length; i++)
        {
            cads[i] = cads[i].trim();
            cads[i] = cads[i].toLowerCase();
            cads[i] = cads[i].replace('a','o');
            cads[i] = cads[i].replace('e','o');
            cads[i] = cads[i].replace('i','o');
            cads[i] = cads[i].replace('u','o');
        }
        return cads;
    }

    public static double Median(int[] vectorNumbers)
    {
        int sum = 0;
        for(int i = 0; i < vectorNumbers.length; i++ )
        {
            sum = sum + vectorNumbers[i];
        }

        return sum / vectorNumbers.length;
    }

}
