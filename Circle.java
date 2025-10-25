
package com.mycompany.shapedemo2;


public class Circle {
    private String color;
    private boolean filled;
    private double radius;
    public double Area;
    
    public Circle(){
        this.color="red";
        this.filled=true;
        this.radius=1.0;
    }
    public Circle(String color, boolean filled, double radius){
        this.color=color;
        this.filled=filled;
        this.radius=radius;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
    public void setFilled(boolean filled){
        this.filled=filled;
    }
    public boolean getFilled(){
        return filled;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public void calculateArea(){
        Area = Math.PI*radius*radius;
        System.out.println(Area);
         
    }
}
