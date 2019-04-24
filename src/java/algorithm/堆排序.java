package algorithm;

import common.CommonUtils;

//堆排序是一种非常稳定的排序算法，以O(NlogN)最坏情形时间运行
public class 堆排序 {
    public static void main(String[] args) {
        int[] arr = {99, 22, 3, 6, 1, 33, 23, 55, 37, 0, 9, 10, 12, 21, 100, 43, 20};
//        arr = new int[]{1, 2, 3, 6, 7, 8, 23, 55, 77};
//        arr = new int[]{8,1,4,9,0,3,5,2,7,6,2};
//        arr = new int[]{1,13,24,26,2,15,27,38};
//        arr = new int[]{10,9,8,7,6,5,4,3,2,1};
//        arr = new int[]{2,1,3};
        int[] tmpArr = new int[arr.length];
        sort(arr);
        CommonUtils.printf(arr);
    }

    public static void sort(int[] arr) {
        for(int i= arr.length/2-1;i>=0;i--){
            percDown(arr,i,arr.length);
        }
        for (int i= arr.length-1;i>0;i--){
            CommonUtils.swap(arr,0,i);
            percDown(arr,0,i);
        }
    }


    public static void percDown(int[] arr,int i,int n){
        int child;
        int tmp;
        for(tmp=arr[i];leftChild(i)<n;i=child){
            child=leftChild(i);
            if(child!=n-1&&arr[child]<arr[child+1])
                child++;
            if(tmp<arr[child])
                arr[i]=arr[child];
            else
                break;
        }
        arr[i]=tmp;
    }

    private static int leftChild(int i) {
        return 2*i+1;
    }


}
