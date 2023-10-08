package com.example.pokemonapp;

public class Model {

    String t1;
    String t2;
    int Im;

    public Model(String t1, String t2, int im) {
        this.t1 = t1;
        this.t2 = t2;
        Im = im;
    }

    public String getT1() {
        return t1;

    }

    public void setT1(String t1) {
        this.t1 = t1;

    }

    public String getT2() {
        return t2;

    }

    public void setT2(String t2) {
        this.t2 = t2;
    }

    public int getIm() {
        return Im;
    }

    public void setIm(int im) {
        Im = im;
    }
}
