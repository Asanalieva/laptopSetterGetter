package com.company;

public class Main {

    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.setLaptopName("Lenovo");
        laptop.setMemory(8);
        laptop.setColor ("red");
        laptop.setCpu ("AMD");

        System.out.println(laptop.getLaptopName() + " " + laptop.getMemory() );
        System.out.println(laptop.getColor() + " " + laptop.cpu);

        laptop.shutDown();
        laptop.turnOn();

    }
}
