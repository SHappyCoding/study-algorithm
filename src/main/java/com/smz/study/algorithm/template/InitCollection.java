package com.smz.study.algorithm.template;

/**
 * @Author: 司马钊
 * @Date: Created in 2022/3/20 3:52 下午
 * @Description: 功能: 集合的初始化
 */
public class InitCollection {
    public static void main(String[] args) {
        System.out.println("--------1、二维数组：int [][]--------------");
        // 1、动态初始化
        int[][] enter1 = new int[5][3];
        int enter4[][] = new int[5][3];
        printArray2(enter1);
        // 2、静态初始化
        int[][] enter2 = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] enter3 = new int[][]{{1, 3}, {2, 7, 6}, {8, 10}, {15, 18, 19, 20}};
        printArray2(enter2);
        printArray2(enter3);

    }


    public static void printArray2(int[][] enter) {
        if (enter == null || enter.length == 0) return;
        int length = enter.length;
        for (int i = 0; i < length; i++) {
            System.out.print("[");
            for (int j = 0; j < enter[i].length; j++) {
                System.out.print(enter[i][j]);
                if (j != enter[i].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println("]");
        }

//        for(int[] row :enter){
//            System.out.print("[");
//            for (int e :row){
//                System.out.print(e+" ");
//            }
//            System.out.println("]");
//        }
    }

    public static void printArray3(int[][] enter) {
        if (enter == null || enter.length == 0) return;
        int length = enter.length;
        for (int i = 0; i < length; i++) {
            System.out.print("[");
            for (int j = 0; j < enter[i].length; j++) {
                System.out.print(enter[i][j]);
                if (j != enter[i].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.print("]");
            if(i!=length-1)System.out.print(",");
        }

    }
}