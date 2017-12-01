package com.example.mayankjain.mysecapp;

/**
 * Created by mayank jain on 6/17/2017.
 */

class common_one {
    String header;
    String footer;
    Integer imgName;


    public common_one(String h,String f,int I){
        header=h;
        footer=f;
        imgName=I;
    }

    public String getHeader()
    {return header;}

    public String getFooter(){
        return footer;
    }
    public Integer getImgName(){
        return imgName;
    }

}
