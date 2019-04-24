package algorithm;

import common.CommonUtils;

import java.util.MissingFormatArgumentException;

//快速排序是不稳定排序  平均运行时间是O(NlogN),最坏情形性能为O(N*N)
public class 快速排序 {
    public static void main(String[] args) {
        int[] arr = {99, 22, 3, 6, 1, 33, 23, 55, 37, 0, 9, 10, 12, 21, 100, 43, 20};
        arr = new int[]{1, 2, 3, 6, 7, 8, 23, 55, 77};
        arr = new int[]{8,1,4,9,0,3,5,2,7,6,2};
        arr = new int[]{1,13,24,26,2,15,27,38};
        arr = new int[]{10,9,8,7,6,5,4,3,2,1};
        arr = new int[]{2,1,3};
        sort_1(arr, 0, arr.length - 1);
        CommonUtils.printf(arr);
    }

    public static void sort_1(int[] arr, int light, int right) {

        if (light >= right) {
            return;
        }
        int l = light;
        int r = right;
        int key = arr[l];

        while (l < r) {
            while (l < r && arr[r] > key) r--;
            if(l<r){
                System.out.println(1);
                arr[l++]=arr[r];//
            }
            while (l < r && arr[l] < key) l++;
            if(l<r){
                System.out.println(0);
               arr[r--]=arr[l];
            }
        }
        arr[l]=key;
        System.out.println("============================sort_1==================================");
        sort_1(arr, light, l-1);
        sort_1(arr, l+1, right);
    }


    public static void sort(int[] arr, int light, int right) {

        if (light >= right) {
            return;
        }
        int l = light;
        int r = right;
        int key = arr[l];

        boolean isSwap = false;
        while (l < r) {
            while (l < r && arr[l] <= key) l++;
            while (l < r && arr[r] > key) r--;
            if (l < r) {
                isSwap=true;
                CommonUtils.swap(arr, l, r);
                r--;
                l++;
            }
        }
        if(!isSwap){
            return ;
        }
        //StringBuffer sb ;sb.length();
        //System.out.println(l+"==="+r);
        CommonUtils.printf(arr);
        System.out.println("============================sort==================================");
        sort(arr, light, l);
        sort(arr, l+1, right);
    }


    public static void sort1(int arr[], int low, int high) {
        int l = low;
        int h = high;
        int povit = arr[low];

        while (l < h) {
            while (l < h && arr[h] >= povit)
                h--;
            if (l < h) {
                arr[l] = arr[h];
                l++;
            }

            while (l < h && arr[l] <= povit)
                l++;

            if (l < h) {
                arr[h] = arr[l];
                h--;
            }
        }
        //num[l]=povit;
        //print(arr);
        //System.out.print("l="+(l+1)+"h="+(h+1)+"povit="+povit+"\n");
        if (l - 1 > low) sort(arr, low, l - 1);
        if (h + 1 < high) sort(arr, h + 1, high);
    }
}
