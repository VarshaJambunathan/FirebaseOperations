package com.example.varsha.databasequeries;

/**
 * Created by Varsha on 08-11-2016.
 */

public class Person {
    String name;
    double latitude,longitude;

    public Person() {
      /*Blank default constructor essential for Firebase*/
    }
    //Getters and setters
    public String getName(){
        return  name;
    }

    public void setName(String name){
        this.name= name;
    }

    public double getLatitude(){
        return latitude;
    }
    public double getLongitude(){
        return longitude;
    }

    public void setLongitude(double longitude){
        this.longitude=longitude;
    }
    public void setLatitude(double latitude){
        this.latitude = latitude;
    }

}
