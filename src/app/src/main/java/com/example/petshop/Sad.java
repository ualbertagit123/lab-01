package com.example.petshop;

import java.util.Date;

public class Sad extends Mood{
    public Sad() {}

    public Sad(Date moodDate) {
        super(moodDate);
    }

    public String getMoodDesc() {
        return "Feeling of melancholy, sadness";
    }
}
