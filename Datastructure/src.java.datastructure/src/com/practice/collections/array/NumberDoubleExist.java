package com.practice.collections.array;

import java.util.ArrayList;

public class NumberDoubleExist {
    public static void main(String[] args) {
        int[] A = {0, 0};
        checkIfExist(A);

    }

    public static boolean checkIfExist(int[] arr) {
        ArrayList list = new ArrayList();
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        for (int x = 0; x < arr.length; x++) {
            if (list.contains(arr[x] * 2) && (x != list.indexOf(arr[x] * 2))) {
                flag = true;
            }
        }
        System.out.println(flag);
        return flag;
    }
}
