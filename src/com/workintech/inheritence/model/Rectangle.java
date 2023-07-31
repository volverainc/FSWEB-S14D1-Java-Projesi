package com.workintech.inheritence.model;

public class Rectangle {
    private int width;
    private int length;

    public Rectangle(int width, int length) {
    checkLength(length);
    checkWidth(width);
    }

    public void checkWidth(int width){
        if(width < 0){
            this.width = 0;
        }else {
            this.width = width;
        }
    }

    public void checkLength(int length){
        if(length <0){
            this.length = 0;
        } else {
            this.length = length;
        }
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getArea(){
        return width*length;
    }
}
