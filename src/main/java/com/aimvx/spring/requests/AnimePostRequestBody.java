package com.aimvx.spring.requests;

public class AnimePostRequestBody {
    private String name;

    public void setName (String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
}
