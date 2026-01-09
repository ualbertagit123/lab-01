package com.example.petshop;

import java.util.Date;

public class Cat extends Pet implements Pettable {

    public Cat(String name) {
        super(name);
    }

    public Cat(String name, Date birthDate) {
        super(name, birthDate);
    }

    // This overrides the super class
    @Override
    public String speak() {
        return "meovv";
    }

    @Override
    public void pet() {}
}
