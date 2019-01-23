
package com.coderbd.collection;

import java.util.Enumeration;
import java.util.Vector;


public class TestVector {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();
     v.add("umesh");
     v.addElement("irfan");
     v.addElement("kumar");
     
     Enumeration e = v.elements();
     while(e.hasMoreElements()){
         System.out.println(e.nextElement());
     }
             
                
    }
}
