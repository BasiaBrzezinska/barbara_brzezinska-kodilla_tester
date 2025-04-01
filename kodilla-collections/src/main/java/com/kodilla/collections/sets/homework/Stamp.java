package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private int stampSize;
    private boolean stampStepped;

    public Stamp(String stampName, int stampSize, boolean stampStepped){
        this.stampName = stampName;
        this.stampSize = stampSize;
        this.stampStepped = stampStepped;
    }

    public String getStampName() {
        return stampName;
    }

    public int getStampSize() {
        return stampSize;
    }

    public boolean isStampStepped() {
        return stampStepped;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return stampSize == stamp.stampSize && stampStepped == stamp.stampStepped && Objects.equals(stampName, stamp.stampName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampSize, stampStepped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampSize=" + stampSize +
                ", stampStepped=" + stampStepped +
                '}';
    }
}

