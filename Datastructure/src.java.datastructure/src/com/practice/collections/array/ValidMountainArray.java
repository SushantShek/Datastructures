package com.practice.collections.array;

public class ValidMountainArray {
    public static void main(String[] args) {
        int[] A = {9,8,7,6,5,4,3,2,1,0};
        System.out.println(findIfValidMountain(A));
    }

    private static boolean findIfValidMountain(int[] arr) {
        if(arr.length < 3){
            return false;
        }
        int max=0;
        int index=0;
        for(int i=0; i< arr.length -1; i++){
            int tmpMax = Math.max(arr[i],arr[i+1]);
            if (tmpMax > max){
                max = tmpMax;
            }else{
                if(arr[i]> arr[index]) {
                    index = i;
                }else{
                    index = i-1;
                }
                break;
            }
        }
        if (index == arr.length-1 || index == 0) {
            return false;
        }

        return (checkAssending(arr, index) && checkDesending(arr, index));
    }

    private static boolean checkAssending(int[] arr, int index) {
        for(int x=0; x<index -1;x++){
            if (arr[x] < arr[x+1]) {
                continue;
            }else
                return false;
        }
        return true;
    }
    private static boolean checkDesending(int[] arr, int index) {
        for(int x=index; x<arr.length-1;x++){
            if(arr[x] > arr[x+1]){
                continue;
            }else
                return false;
        }
        return true;
    }
}
