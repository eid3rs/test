package com.powernode.sg;

public class Sg1 {
    public static void main(String[] args) {
        Sg1 sg1 = new Sg1();
        int sum = sg1.add(2, 3);
        System.out.println("A购买水果共花费"+sum+"元");
    }

    private int add(int a, int b) {
        int p = 8*a+13*b;
        return p;
    }
}
