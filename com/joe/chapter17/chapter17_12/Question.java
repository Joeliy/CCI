package com.joe.chapter17.chapter17_12;

import java.util.ArrayList;
import java.util.Arrays;

public class Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={2,1,3,4,5,6,9,8,7};
		for(Pair p:findPairBySum_(arr, 10)){
			System.out.println("["+p.getFirst()+","+p.getLast()+"]");
		}
	}
	
	public static ArrayList<Pair> findPairBySum(int[] arr,int sum){
		int[] tmp = arr.clone();
		Arrays.sort(tmp);
		
		ArrayList<Pair> list = new ArrayList<Pair>();
		
		for(int i=0;i<tmp.length-1;i++){
			int j = tmp.length-1;
			while(j>=0&&tmp[j]+tmp[i]>=sum){
				if(tmp[j]+tmp[i]==sum){
					list.add(new Pair(tmp[i],tmp[j]));
				}
				j--;
			}
		}
		
		return list;
	}
	
	public static ArrayList<Pair> findPairBySum_(int[] arr,int sum){
		int[] tmp = arr.clone();
		Arrays.sort(tmp);
		
		ArrayList<Pair> list = new ArrayList<Pair>();
		
		int first=0,last=tmp.length-1;
		while(first<last){
			int s=tmp[first]+tmp[last];
			if(s==sum){
				first++;
				last--;
				list.add(new Pair(tmp[first],tmp[last]));
			}else{
				if(s<sum) first++;
				else last--;
			}
		}
		
		return list;
	}
}
