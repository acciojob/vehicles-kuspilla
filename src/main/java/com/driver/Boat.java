package com.driver;

public  class Boat implements WaterVehicle{
   private String name ;
    private int Capacity;

    public Boat( String name, int Capacity){
        this.name= name;
        this.Capacity = Capacity;
    }



 @Override
    public String getVehicleName() {
        return this.name;
    }
@Override

    public int getVehicleCapacity() {
        return this.Capacity;
    }
}
