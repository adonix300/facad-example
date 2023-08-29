package org.example;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println(bins.sum("001", "011"));
        System.out.println(bins.mult("011", "100"));
    }
}