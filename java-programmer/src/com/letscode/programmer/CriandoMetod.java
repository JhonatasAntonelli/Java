package com.letscode.programmer;

public class CriandoMetod {

    public static void main(String[] args) {
        int w = 5;
        int h = 2;
        int a = computeArea(w,h);
        System.out.println("Area é " + a);
    }

    public static int computeArea(int width, int height) {
        int area;
        area = width * height;
        return area;

    }
}
