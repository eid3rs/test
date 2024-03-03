package com.powernode.sg;

public class Sg2 {

    public static void main(String[] args) {
        Sg2 sg2 = new Sg2();
        int sum = sg2.add(2, 3,1);
        System.out.println("B购买水果共花费"+sum+"元");
    }

    private int add(int a, int b,int c) {
        int p = 8*a+13*b+20*c;
        return p;
    }
}
