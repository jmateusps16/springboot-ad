package com.aimvx.spring.requests;

public class AnimePutRequestBody {
    private Long id;
    private String name;

    public void setId (Long id){
        this.id = id;
    }

    public void setName (String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }

    public Long getId(){
        return id;
    }
}
