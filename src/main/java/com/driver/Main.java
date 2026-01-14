package com.driver;

public class Main {
    public static class Profuct{
        public int product(int x, int y) {
            return x*y;
        }
        public int product(int x, int y, int z) {
            return x*y*z;
        }
        public double product(double x, double y) {
            return x*y;
        }
    }

    public static void main(String[] args) {
        Profuct p = new Profuct();
        System.out.println(p.product(13,13));
        System.out.println(p.product(13,2,2));
        System.out.println(p.product(4.2,4.2));
    }

}