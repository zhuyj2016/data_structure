package algorithm;

import common.CommonUtils;

import java.awt.*;

//归并排序是一种稳定的排序算法，以O(NlogN)最坏情形时间运行
public class 归并排序 {
    public static void main(String[] args) {
        int[] arr = {99, 22, 3, 6, 1, 33, 23, 55, 37, 0, 9, 10, 12, 21, 100, 43, 20};
//        arr = new int[]{1, 2, 3, 6, 7, 8, 23, 55, 77};
//        arr = new int[]{8,1,4,9,0,3,5,2,7,6,2};
//        arr = new int[]{1,13,24,26,2,15,27,38};
//        arr = new int[]{10,9,8,7,6,5,4,3,2,1};
        arr = new int[]{2,1,3};
        int[] tmpArr = new int[arr.length];
        sort(arr, tmpArr,0, arr.length - 1);
        CommonUtils.printf(arr);
    }

    public static void sort(int[] arr, int[] tmpArr,int left, int right) {
        if(left<right){
            int center= (left+right)/2;

            sort(arr,tmpArr,left,center);
            sort(arr,tmpArr,center+1,right);
            meger(arr,tmpArr,left,center+1,right);
        }
    }


    public static void meger(int[] arr, int[] tmpArr,int leftpos,int rightpos, int rightEnd){
        int leftEnd = rightpos-1;
        int tmppos = leftpos;
        int numElements = rightEnd-leftpos+1;
        while (leftpos<=leftEnd&&rightpos<=rightEnd)
            if(arr[leftpos]<=arr[rightpos])
                 tmpArr[tmppos++]=arr[leftpos++];
            else
                 tmpArr[tmppos++]=arr[rightpos++];
        while (leftpos<=leftEnd)
            tmpArr[tmppos++]=arr[leftpos++];
        while (rightpos<=rightEnd)
            tmpArr[tmppos++]=arr[rightpos++];

        for (int i=0;i<numElements;i++,rightEnd--){
            arr[rightEnd]=tmpArr[rightEnd];
        }

    }


}
