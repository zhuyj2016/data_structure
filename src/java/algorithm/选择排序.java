package algorithm;

import common.CommonUtils;

//不稳定排序
public class 选择排序 {
    public static void main(String[] args) {
        int [] arr = {99,22,3,6,1,33,23,55,37,0,9,10,12,21,43,20};
        sort(arr);
        //CommonUtils.printf(arr);
    }

    public static void sort(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            int minIndex = arr[i];
            for (int j=i+1;j<arr.length;j++){
                if(arr[minIndex]>arr[j]){
                    minIndex=j;
                }
            }
            //将最小元素放到本次循环的前端
            CommonUtils.swap(arr,i,minIndex);
        }

    }
}
