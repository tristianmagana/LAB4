package com.company;

public class Main {

    public static void main(String[] args) {

        int monkeys = 5, bananas = 5;

        System.out.println("\nEach monkey gets at least one banana.");

        int bananasPerMonkey = (int)(bananas / monkeys);

        System.out.println("\nEach monkey gets " + bananasPerMonkey + " banana");

    }
}
