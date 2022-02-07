package com.company;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.setLaptopName("Lenovo");
        laptop.setMemory(256);
        laptop.setColor (Color.red);
        laptop.setCpu ("AMD");
//        System.out.println(laptop.getLaptopName() + " " + laptop.getMemory() );
//        System.out.println(laptop.getColor() + " " + laptop.cpu);

        Laptop laptop2 = new Laptop();
        laptop2.setLaptopName("Acer");
        laptop2.setMemory(512);
        laptop2.setColor (Color.black);
        laptop2.setCpu ("Intel core i7");
//        System.out.println(laptop2.getLaptopName() + " " + laptop2.getMemory() );
//        System.out.println(laptop2.getColor() + " " + laptop2.cpu);

//        laptop.shutDown();
//        laptop.turnOn();


        Student studentOne = new Student();
        Student studentTwo = new Student();

        studentOne.setName("Dilbara");
        studentOne.setSurname("Asanalieva");
        studentOne.setAge(19);
        studentOne.setGroup("Day group");
        studentOne.setStudentsLaptop(laptop);

        studentTwo.setName("Nurzhan");
        studentTwo.setSurname("Abdyraiova");
        studentTwo.setAge(25);
        studentTwo.setGroup("Night group");
        studentTwo.setStudentsLaptop(laptop2);

//        studentOne.showInfo();
//        studentTwo.showInfo();



        String[] rooms = {"Apple","Facebook","Google","Starlink","SpaceX"};
        Student[] students = {studentOne, studentTwo};

        PeakSoft peakSoft = new PeakSoft();
        peakSoft.setName("Peaksoft House");
        peakSoft.setRooms(rooms);
        peakSoft.setStudents(students);
        peakSoft.showInfo();

//        System.out.println(studentOne.getName() + " " + studentOne.getSurname() + " " + studentOne.getAge() + " years old  " + studentOne.getGroup());
//        System.out.println(studentTwo.getName() + " " + studentTwo.getSurname() + " " + studentTwo.getAge() + " years old  " + studentTwo.getGroup());
//        studentOne.play();
//        studentOne.study();
    }
}
