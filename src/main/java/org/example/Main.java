package org.example;

public class Main {
    private static int x;

    public static void main(String[] args) {
        l();
        r2();
    }

    public static void l() {
        x = 0; // L
    }

    public static void r() {
        x = 1; // R
    }

    public static void r2() {
        r();
    }

}