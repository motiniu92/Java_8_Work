package com.coderbd.wrapperConversion;

public class AutoboxingUnboxing {

    public static void main(String[] args) {
        //primitive to object
        int x = 30;
        Integer y = Integer.valueOf(x);
        System.out.println("y = " + y);

        Integer z = x;
        System.out.println("z = " + z);

        Double d = new Double(10.25);
        System.out.println("d =" + d);

        double e = d;
        System.out.println("e =" + e);

    }
}
