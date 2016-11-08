package com.example.varsha.databasequeries;

/**
 * Created by Varsha on 08-11-2016.
 */

public class Person {
    String title;
    String description;

    public Person() {
      /*Blank default constructor essential for Firebase*/
    }
    //Getters and setters
    public String getTitle(){
        return  title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }
}
