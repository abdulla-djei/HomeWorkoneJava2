package com.company;

public class Main {

    public static void main(String[] args) {
        Acer objectA = new Acer("Acer","Bishkek",8, new Character(false, true),"Intel",Color.BLACK);
        objectA.getInfo();
        objectA.getInfo(objectA.getCpu());
        objectA.getInfo(objectA.getColor2(), objectA.getCpu());
        Lenovo objectB = new Lenovo("Lenovo","Naryn",4,new Character(true,false),"Ryzeon",Color.WHITE, true);
        objectB.getInfo();
        objectB.getInfo(objectB.getCpu());
        objectB.getInfo(objectB.getColor2(), objectB.getCpu());
        Lenovo objectC = new Lenovo("Honor","Talas", 8,new Character(false,false),"Intel",Color.GREY,false);
        objectC.getInfo();
        objectC.getInfo(objectC.getCpu());
        objectC.getInfo(objectC.getColor2(), objectC.getCpu());
        objectC.copyElements(objectB);
        System.out.println("+++++++++++++++++++++++++");
        objectC.getInfo();



    }



}
