package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.setLaptopName("Lenovo");
        laptop.setMemory(8);
        laptop.setColor (Color.red);
        laptop.setCpu ("AMD");
        System.out.println(laptop.getLaptopName() + " " + laptop.getMemory() );
        System.out.println(laptop.getColor() + " " + laptop.cpu);
        laptop.shutDown();
        laptop.turnOn();


        Student studentOne = new Student();
        Student studentTwo = new Student();

        studentOne.setName("Dilbara");
        studentOne.setSurname("Asanalieva");
        studentOne.setAge(19);
        studentOne.setGroup("Day group");

        studentTwo.setName("Nurzhan");
        studentTwo.setSurname("Abdyraiova");
        studentTwo.setAge(25);
        studentTwo.setGroup("Day group");


        System.out.println(studentOne.getName() + " " + studentOne.getSurname() + " " + studentOne.getAge() + " years old  " + studentOne.getGroup());
        System.out.println(studentTwo.getName() + " " + studentTwo.getSurname() + " " + studentTwo.getAge() + " years old  " + studentTwo.getGroup());
        studentOne.play();
        studentOne.study();
    }
}
