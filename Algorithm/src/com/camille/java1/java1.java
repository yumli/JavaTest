package com.camille.java1;

import java.util.Arrays;

/**
 * @author Camille
 * @create 2020-12-26 15:25
 */
public class java1 {
    public static void main(String[] args) {
        int[] intrandom=new int[10];
        int sum = 0;
        int maxvalue=0;
        int minvalue=100;
        double average;
        for(int i=0;i<10;i++){
            intrandom[i]=(int)(Math.random()*90+10);
            sum +=intrandom[i];
        }
        average=(double)sum/10;
        for(int i=0;i<intrandom.length;i++){
            if(intrandom[i]>=maxvalue){
                maxvalue=intrandom[i];
            }
            if(intrandom[i]<=minvalue){
                minvalue=intrandom[i];
            }
        }
        System.out.println(Arrays.toString(intrandom));
        System.out.println("总和:"+sum);
        System.out.println("最大值:"+maxvalue);
        System.out.println("最小值:"+minvalue);
        System.out.println("平均值:"+average);
    }
}
