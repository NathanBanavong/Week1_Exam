package com.hfad.encoding;

import java.util.HashMap;

public class Encoding {
//    see if can return string

    public static void convertValue(String word) {
        word.toLowerCase();
        char[] c_arr = word.toCharArray();
        int cVal;

        for(int x = 0; x < c_arr.length; x++) {
            //int[] temp_cArr = {};
            int newVal;
            cVal= (int)c_arr[x];    //convert char to ascii int

            if (cVal < 97 && cVal > 122) {
                System.out.println("ASCII is out of bounds");
            }
            else {
                //temp_cArr[x] = cVal - 97;
                newVal = 122 - (cVal - 97);     //find difference
                System.out.print((char)newVal);
                //(char)temp_cArr = ;
            }

        }
    }

    public static void countFrequency(String word){
        HashMap<Character, Integer> leAlphabet = new HashMap<Character, Integer>();

        word = word.toLowerCase(); //set the string to lowercase

        //populate Hashmap -> put in all ascii char with count of 0
        for(int y = 97; y <123; y++) {
            leAlphabet.put((char)y,0);
        }

        for(char c : word.toCharArray()) {
            if(leAlphabet.containsKey(c))
                leAlphabet.put(c, leAlphabet.get(c) + 1);
        }

        System.out.println(leAlphabet);

    }

}



