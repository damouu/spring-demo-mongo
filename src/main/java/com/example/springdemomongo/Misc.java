package com.example.springdemomongo;

import lombok.Data;

import java.util.ArrayList;

// by adding the lombok annotation, we are exclude to write the Constructor and the getters/setters of the class.
@Data
public class Misc {

    private Object abilities;
    private int captureRate;
    private String classification;
    private String eggSteps;
    private String entreeForestLevel;
    private ArrayList<String> evPoints;
    private String expGrowth;
    private String fleeFlag;
    private String happiness;
    private String height;
    private Object sex;
    private String weight;
}
