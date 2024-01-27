package com.luminahi.datarest;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Type {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    public Type() { }
    
    private String typeName;
    
    public String getName() {
        return typeName;
    }
        
    public void setName(String name) {
        this.typeName = name;
    }
    
}
