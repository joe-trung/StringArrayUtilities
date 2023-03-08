package com.zipcodewilmington;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        int j=0;
        for (int i=0; i<array.length;i++) {
            if (array[i].equals(value)) {
                j=j+1;
        }}
            if (j!=0) {
                return true;
            } else {
                return false;
            }
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] revString = new String[array.length];
        for (int i=0; i<array.length;i++) {
            revString[i] = array[array.length-1-i];
        }
        return revString;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        int j=0;
        int i;
        for (i=0; i< (int) array.length/2;i++) {
            if (array[i].equals(array[array.length-1-i])) {j+=1;}
        }
        if (i==j) { return true;} else {return false;}
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        return false;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int j=0;
        for (int i=0; i<array.length;i++) {
            if (array[i].equals(value)) {j=j+1;
            }}
        return j;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String[] remArray = new String[array.length-1];
        for(int i=0, j=0; i< array.length; i++) {
            if (!(array[i].equals(valueToRemove))) {
                remArray[j] = array[i];
                j++;
            }
        }
        return remArray;

    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        List<String> list = Arrays.asList(array);
        int j = array.length;
        for (int i = 0; i < (array.length) - 1; i++) {
            if (!(array[i].equals(array[i + 1]))) {
                list.remove(array[i+1]);
                j = j -1;
            }
        }
        String[] packArray = new String[j];
        for (int i =0;i<j;i++) {
            packArray[i]=list.get(i);
        }
        return packArray;
    }


}
