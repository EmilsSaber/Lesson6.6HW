package com.company;

public class Skeleton extends Boss{
    private int strely;

    public String printInfo(){
        return "Кол.Стрел" + getStrely();
    }

    public int getStrely() {
        return strely;
    }

    public void setStrely(int strely) {
        this.strely = strely;
    }
}
