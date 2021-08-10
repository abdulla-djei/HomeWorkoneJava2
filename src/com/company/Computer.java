package com.company;

public class Computer {
    private String name;
    private String address;
    private int ram;
    private Character character;

    public Computer(String name, String address, int ram, Character character) {
        this.name = name;
        this.address = address;
        this.ram = ram;
        this.character = character;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getRam() {
        return ram;
    }

    public Character getCharacter() {
        return character;
    }
}

