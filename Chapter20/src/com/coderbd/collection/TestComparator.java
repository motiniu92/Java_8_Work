
package com.coderbd.collection;

import chapter13.GeometricObject;
import java.awt.Rectangle;
import javafx.scene.shape.Circle;
import java.util.Comparator;

public class TestComparator {
  public static void main(String[] args) {
    Rectangle g1 = new Rectangle(5, 5);
    Circle g2 = new Circle(5);

    GeometricObject g = 
      max(g1, g2, new GeometricObjectComparator());
    
    System.out.println("The area of the larger object is " + 
      g.getArea());
  }
  
  public static GeometricObject max(GeometricObject g1, 
      GeometricObject g2, Comparator<GeometricObject> c) {
    if (c.compare(g1, g2) > 0)
      return g1;
    else
      return g2;
  }

    private static GeometricObject max(Rectangle g1, Circle g2, GeometricObjectComparator geometricObjectComparator) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
