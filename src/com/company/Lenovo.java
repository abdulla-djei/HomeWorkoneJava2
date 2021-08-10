package com.company;


public class Lenovo extends Acer {
    private boolean lan;

    public Lenovo(String name,
                  String address, int ram, Character character, String cpu,
                  Color color2, boolean lan) {
        super(name, address, ram, character, cpu, color2);
        this.lan = lan;

    }

    public boolean getLan() {
        return lan;
    }

    public void  getInfo(){
     super.getInfo();
        System.out.println(" Наличие разьема для кабелья:" + lan);
    }
    public void copyElements(Lenovo lenovo){
        this.lan = lenovo.getLan();
    }

}