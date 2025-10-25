 
package com.mycompany.shapedemo2;

 
public class Rectangle extends Circle {
    private double length;
    private double width;
    
    public Rectangle (){
        super();
        this.length=3.4;
        this.width=6.8;
    }
    public Rectangle(String color, boolean filled,double radius,double length, double width){
        super (color,filled,radius);
        this.length=length;
        this.width=width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length=length;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width) {
        this.width=width;
    }
             
    public void displayRectangle(Circle c){
        System.out.println("Color :"+c.getColor());
        System.out.println("Filled :" +c.getFilled());
        System.out.println("Radius :" +c.getRadius());
    }
    @Override
    public void calculateArea(){
       Area = length*width;
        System.out.println(Area);
    }
}
