package com.driver;

public  class Boat implements WaterVehicle{
   private String name ;
    private int Capacity;

    public Boat( String name, int Capacity){
        this.name= name;
        this.Capacity = Capacity;
    }
        public  Boat(String naame){
        this.name =name;
        }
        public Boat(int Capacity){
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
        this.Capacity = capacity;
    }

    @Override
    public String getVehicleName() {
        return name;
    }

    @Override
    public int getVehicleCapacity() {
        return Capacity;
    }
}
