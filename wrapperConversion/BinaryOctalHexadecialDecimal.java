package com.coderbd.wrapperConversion;

public class BinaryOctalHexadecialDecimal {

    public static void main(String[] args) {

        String binary = "10100011";
        Integer decimal = Integer.parseInt(binary, 2);
        System.out.println(decimal);

    }
}
