package com.ou.gilstad;

public class MainClass {
    public static int[] doubleValues(int[] myArray) {
        for (int i = 0; i < myArray.length; ++i)
            myArray[i] = myArray[i] * 2;

        return myArray;
    }
}
