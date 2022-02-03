package com.company;

public class Laptop {
    public String laptopName;
    public int memory;
    public String color;
    public String cpu;//processor

    void turnOn(){
        System.out.println("Turned on!");
    }
    void shutDown(){
        System.out.println("Shut down!");
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
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public String  getCpu(){
        return cpu;
    }
    public void setCpu(String cpu){
        this.cpu = cpu;
    }




}
