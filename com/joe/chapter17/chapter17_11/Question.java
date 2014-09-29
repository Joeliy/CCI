package com.joe.chapter17.chapter17_11;
/**
 * 给定rand5(),实现一个方法rand7(),也即，给定一个产生0到4(含)随机数的方法，编写一个产生0到6(含)随机数的方法
 **/
public class Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true)
		System.out.println(rand7());
	}
	
	public static int rand5(){
		return (int) (Math.random()*5);
	}
	
	public static int rand7(){
		
		while(true){
			int result = rand5()*5+rand5();
			if(result<21){
				return result%7;
			}
		}
	}

}
