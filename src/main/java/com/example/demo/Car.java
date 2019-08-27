package com.example.demo;

import com.sun.istack.internal.NotNull;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class Car{

    @NotNull
    @Size(min=2, max=20)
    private String name;

    @NotNull
    @Size(min=2, max=10)
    private String type;

    @NotNull
    @Size(min=5, max=30)
    private String description;

    @NotNull
    private String price;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
