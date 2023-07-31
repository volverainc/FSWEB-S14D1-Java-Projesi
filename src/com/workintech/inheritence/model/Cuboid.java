package com.workintech.inheritence.model;

public class Cuboid extends Rectangle{
    private int height;

    public Cuboid(int width, int length, int height) {
        super(width, length);
        checkHeight(height);
    }

    public void checkHeight(int height){
        if(height<0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public int getHeight() {
        return height;
    }

    public int getVolume() {
        return getArea() * height;
    }
}
