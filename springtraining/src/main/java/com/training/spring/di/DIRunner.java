package com.training.spring.di;


public class DIRunner {

    public static void main(final String[] args) {
        MyFirstObject firstObjectLoc = new MyFirstObject();
        firstObjectLoc.setName("osman");
        MySecondObject mySecondObjectLoc = new MySecondObject();
        mySecondObjectLoc.setInfo("info");
        firstObjectLoc.setSecond(mySecondObjectLoc);


        String infoLoc = firstObjectLoc.getSecond()
                                       .getInfo();
        System.out.println(infoLoc);

    }

}
