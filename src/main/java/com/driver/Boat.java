package com.driver;

public class Boat {
    String name ;
    int Capacity;

    public Boat( String name, int Capacity){
        this.name= name;
        this.Capacity = Capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int capacity) {
        Capacity = capacity;
    }
}
