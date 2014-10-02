package com.joe.chapter18.question18_3;

import java.util.Arrays;

public class Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8,9,10,11};
		System.out.println(Arrays.toString(pickMFromN(arr, 4)));
	}
	
	public static int[] pickMFromN(int[] original,int m){
		int[] result = new int[m];
		for(int i=0;i<m;i++){
			result[i] = original[i];
		}
		
		for(int i=m;i<original.length;i++){
			int randnum = (int) (Math.random()*(i+1));
			if(randnum<m){
				result[randnum] = original[i];
			}
		}
		
		return  result;
	}

}
