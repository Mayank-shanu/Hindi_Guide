package com.example.mayankjain.mysecapp;

/**
 * Created by mayank jain on 6/15/2017.
 */

public class word {
    private String number;
    private String respWord;// respective word

    word(String n,String w) {
        number=n;
        respWord=w;
    }

    String getNumber()
    {
        return number;
    }
    String getWord()
    {
        return respWord;
    }

}
