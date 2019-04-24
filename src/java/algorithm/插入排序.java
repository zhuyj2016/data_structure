package algorithm;

import common.CommonUtils;

//插入排序是稳定排序,插入排序的平均情形为O(N*N),如果输入顺序已预先排序，那么运行时间为O(N)
public class 插入排序 {
    public static void main(String[] args) {
        int [] arr = {99,22,3,6,1,33,23,55,37,0,9,10,12,21,43,20};
        sort(arr);
        CommonUtils.printf(arr);
    }

    public static void sort(int [] arr){
        for (int i=1;i<arr.length;i++){
            for (int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    CommonUtils.swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }


    }


}
