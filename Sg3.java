package com.powernode.sg;


public class Sg3 {

    public static void main(String[] args) {
        Sg3 sg3 = new Sg3();
        double sum = sg3.add(2, 3,1);
        System.out.println("B购买水果共花费"+sum+"元");
    }

    private double add(int a, int b,int c) {
        double p = 8*a+13*0.8*b+20*c;
        return p;
    }
}
