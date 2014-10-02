package com.joe.chapter18.question18_1;

public class Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(1,2));
	}
	
	public static int add(int a,int b){
		if(b==0) return a;
		int sum = a^b;
		int carry = (a&b)<<1;
		return add(sum,carry);
	}

}
