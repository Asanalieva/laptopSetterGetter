package com.company;

import java.util.Arrays;

public class PeakSoft {
    private String name;//Peaksoft house
    private String[] rooms;
    private Student[] students;


    public void showInfo(){
        System.out.println("Information about: " + name);
        System.out.println("name: " + name);
        System.out.println("rooms: " + Arrays.toString(rooms));
        for(Student student : students){
            student.showInfo();
        }
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String[] getRooms(){
        return rooms;
    }
    public void setRooms(String[] rooms){
        this.rooms = rooms;
    }
    public Student[] getStudents(){
        return students;
    }
    public void setStudents(Student[] students) {
        this.students = students;
    }


}
