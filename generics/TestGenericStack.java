package com.coderbd.generics;

public class TestGenericStack {

    public static void main(String[] args) {
        GenericStack<Bosta> bostaLit = new GenericStack<>();

        System.out.println("Now Size: " + bostaLit.getSize());
        bostaLit.push(new Bosta(100, "50 KG"));
        bostaLit.push(new Bosta(110, "60 KG"));
        bostaLit.push(new Bosta(120, "70 KG"));

        System.out.println("Size : " + bostaLit.getSize());
        System.out.println("peek : " + bostaLit.peek());
        System.out.println("Size : " + bostaLit.getSize());
        System.out.println("pop : " + bostaLit.pop());
        System.out.println("Size : " + bostaLit.getSize());
    }
}
