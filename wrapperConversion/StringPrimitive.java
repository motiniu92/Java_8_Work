package com.coderbd.wrapperConversion;

public class StringPrimitive {

    public static void main(String[] args) {
        //primtive to string
        int i = 100;
        String s = Integer.toString(i);
        System.out.println("s =" + s);

        double d = 200.50;
        String m = Double.toString(d);
        System.out.println("m =" + m);

        boolean e = true;
        String p = Boolean.toString(e);
        System.out.println("p= " + p);

        
        
        //String to primitive
        String q = "456";
        int o = Integer.parseInt(q);
        System.out.println("o =" + o);

        double x = Double.parseDouble(q);
        System.out.println("x = "+ x);

        int n = Integer.valueOf(q);
        System.out.println("n = " + n);

    }
}
