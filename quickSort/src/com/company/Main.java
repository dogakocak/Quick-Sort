package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr= {3,15,20,2,1,8,12};
        for (int a : arr){
            System.out.print(a+",");
        }
        quickSort(arr,0,arr.length-1);
        System.out.println();
        for (int a : arr){
            System.out.print(a+",");
        }

    }

    public static int partition(int[]arr,int lo, int hi){
        int i= lo;
        int j= hi;
        int temp;
        int pivot = arr[lo];
        while (i<j){
            if (arr[i] > pivot){
                while (i<j){
                    if (arr[j]<pivot){
                        temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                        i++;
                        j--;
                        break;
                    }else {
                        j--;
                    }
                }
            }else {
                i++;
            }
        }
        return j;
    }
    public static void quickSort(int[] arr, int lo, int hi){
        if (lo>hi){
            return;
        }
        int pos = partition(arr,lo,hi);
        int temp = arr[pos];
        arr[pos]= arr[lo];
        arr[lo] = temp;
        quickSort(arr,lo,pos-1);
        quickSort(arr,pos+1,hi);



    }






}
