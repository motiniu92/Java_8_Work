package com.coderbd.collection;

import chapter13.GeometricObject;
import java.util.Comparator;

public class GeometricObjectComparator {

    public int compare(GeometricObject o1, GeometricObject o2) {
        double areal = o1.getArea();
        double area2 = o2.getArea();
        
        double area1 = 0;
        if (area1 < area2) {
            return - 1;
        } else if(area1 == area2){
            return 0;
        } else{
           return 1;
           
        }
    }

    }


