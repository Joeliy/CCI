package com.joe.chapter17.chapter17_11;
/**
 * ����rand5(),ʵ��һ������rand7(),Ҳ��������һ������0��4(��)������ķ�������дһ������0��6(��)������ķ���
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
