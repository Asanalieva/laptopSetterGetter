package com.company;

import java.awt.*;

public class Laptop {
    public String laptopName;
    public int memory;
    public Color color;
    public String cpu;//processor

    public void showInfo(){
        System.out.println(".......................................");
        System.out.println("INFO ABOUT LAPTOP");
        System.out.println("LaptopName - " + laptopName);
        System.out.println("Laptop memory - " + memory);
        System.out.println("Laptop color - " + color);
        System.out.println("Laptop CPU - " + cpu);
        System.out.println("........................................");
    }


    void turnOn(){
        System.out.println(getLaptopName()+"Turned on!");
    }
    void shutDown(){
        System.out.println(getLaptopName() + "Shut down!");
    }

    public String getLaptopName(){
        return laptopName;
    }
    public void setLaptopName(String name){
        this.laptopName = name;
    }

    public int getMemory(){
        return memory;
    }
    public void setMemory(int memory){
        this.memory = memory;
    }
    public Color getColor(){
        return color;
    }
    public void setColor(Color color){
        this.color = color;
    }

    public String  getCpu(){
        return cpu;
    }
    public void setCpu(String cpu){
        this.cpu = cpu;
    }




}
