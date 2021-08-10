package com.company;

public class Acer extends Computer{
    private String cpu;
    private Color color2;


    public Acer(String name, String address, int ram, Character character, String cpu, Color color2) {
        super(name, address, ram, character);
        this.cpu = cpu;
        this.color2 = color2;
    }

    public String getCpu() {
        return cpu;
    }


    public Color getColor2() {
        return color2;
    }
    public void getInfo(String cpu) {
        System.out.println("Процессор: " + cpu);
    }

    public final void getInfo(Color color2 , String cpu ) {
        System.out.println("Процессор: " + cpu + " Цвет: " + color2);
    }
    public void  getInfo(){
        System.out.println("Имя: " + getName() + " Адресс:" + getAddress() + " Память:" + getRam() + " Подсветка клавиятуры:" +
                getCharacter().isKeyboardBacklight() + " Отпечатка пальца:" + getCharacter().isFingerprintScanner() + " Процессор:" + cpu
                  + " Цвет:" + color2);
    }
}
