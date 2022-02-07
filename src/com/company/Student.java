package com.company;

public class Student {

    private String name;
    private String surname;
    private int age;
    private String group;
    private Laptop studentsLaptop;

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    private Laptop laptop; //студентке лаптоп берип жатабыз

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
    public Laptop getStudentsLaptop(){
        return studentsLaptop;
    }
    public void setStudentsLaptop(Laptop studentsLaptop){
        this.studentsLaptop = studentsLaptop;
    }


    void study(){
        System.out.println(getName()+  "Study");
    }
    void play(){
        System.out.println(getName()+"play");
    }
    void showInfo(){
        System.out.println("--------------------");
        System.out.println("About student");
        System.out.println("name - " + name);
        System.out.println("surname -" + surname);
        System.out.println("age - " + age);
        System.out.println("group - " + group);
        studentsLaptop.showInfo();
        System.out.println("-------------------- ");
    }


}
