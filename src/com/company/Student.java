package com.company;

public class Student {

    private String name;
    private String surname;
    private int age;
    private String group;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.matches("[A-Za-z]*")){
            System.out.println("Error Name must contain only letters");
        }
        else{
            this.name = name;
        }

    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String  getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0){
            System.out.println("Age cannot be less than 0");
        }
        else{
            this.age = age;
        }
    }
    void study(){
        System.out.println("Study");
    }
    void play(){
        System.out.println("play");
    }

}
