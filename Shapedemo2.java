 

package com.mycompany.shapedemo2;


public class Shapedemo2 {

    public static void main(String[] args) {
        Rectangle r = new Rectangle ();
        Rectangle r1 = new Rectangle("yellow",true,5.0,4.8,7.3);
        Circle c = new Circle ();
        System.out.println("Area of Circle ");
        c.calculateArea();
        
        System.out.println("Rectangle  :"+r.getColor());
        System.out.println("Rectangle  :"+ r.getFilled());
        System.out.println("Rectangle  :"+r.getRadius() );
        System.out.println("Rectangle  :"+ r.getLength());
        System.out.println("Rectangle  :"+ r.getWidth());
        System.out.println("Area od Rectangle ");
        r.calculateArea();
         
        System.out.println("Rectangle 1 :"+r1.getColor());
         System.out.println("Rectangle 1 :"+r1.getFilled());
          System.out.println("Rectangle 1 :"+ r1.getRadius());
         System.out.println("Rectangle 1 :"+ r1.getLength());
          System.out.println("Rectangle 1 :"+ r1.getWidth());
          System.out.println("Area of Rectangle 1 ");
          r1.calculateArea();
         
    }
}
