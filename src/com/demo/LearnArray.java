package com.demo;

public class LearnArray {
	public static void main(String[] args){
		int i;
		System.out.println("Declaring array first and then allocating memory");
		int arr[];  //Declaring array
		arr=new int[2]; //Allocating memory to array
		arr[0]=0; arr[1]=0;
		for(i=0;i<2;i++){
			System.out.println(arr[i]);
		}
		System.out.println("Declaration and allocation on same line");
		int arr1[]=new int[2]; /*Declaration& allocation in sameline
	                                 int[] arr1=new int[2]; */
		arr1[0]=1;arr1[1]=1;
		for(i=0;i<2;i++)
		{
			System.out.println("In arr1= "+arr1[i]);
		}
		System.out.println("Declaration allocation,initialisation on same line");
		int arr2[]=new int[]{3,3,3}; //int[] arr2=new int[]{3,3,3};
		for(i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]);
		}
	}
}