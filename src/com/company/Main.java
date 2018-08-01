package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int num [] = {1,2,10,11,15,25,2,3,5,7,12,100,17,50,65,85,81,55,3};
        bubbleSort(num);
        for(int i =0; i<num.length;i++){
            System.out.print(num[i] +" ");
        }
    }



    public static void bubbleSort(int [] num){

        int count = num.length;
        int temp =0;
        for(int i =0; i < count ;i ++){

            for(int j =1; j < count; j++){
                if(num[j-1] > num [j]){

                    swap(j-1,j,num);

                }
            }
        }
    }
    public static void swap(int a, int b,int [] num){
        int temp = num[a];
        num[a] = num[b];
       num[ b] = temp;
    }
}
