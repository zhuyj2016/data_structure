package algorithm;

import common.CommonUtils;

//冒泡排序是稳定排序
public class 冒泡排序 {
    public static void main(String[] args) {
        int [] arr = {99,22,3,6,1,33,23,55,37,0,9,10,12,21,43,20};
        sort(arr);
        CommonUtils.printf(arr);
    }

    public static void sort(int [] arr){
        for (int i=0;i<arr.length-1;i++){
            boolean isSwap=false;
            for (int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    CommonUtils.swap(arr,j,j+1);
                    isSwap=true;
                }
            }
            if(!isSwap){
                break;
            }
        }
    }


}
