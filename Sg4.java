package com.powernode.sg;


public class Sg4 {
    public static void main(String[] args) {
        Sg4 sg4 = new Sg4();
        double sum = sg4.add(2, 3,3);
        System.out.println("B购买水果共花费"+sum+"元");
    }

    private double add(int a, int b,int c) {
        double p = 8*a+13*0.8*b+20*c;
        if (p>100){
            double t = p-10;
            System.out.println("优惠了10");
        }else{
            double t=p;
            System.out.println("没优惠");
        }
        return p;
    }

}
