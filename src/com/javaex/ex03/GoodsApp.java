package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {

    	List<Goods> gList = new ArrayList<Goods>();
    	
       Scanner sc = new Scanner(System.in);
       System.out.println("상품을 입력해주세요.(종료 q)");
       
       for(Goods g:gList) {
    	 
    	   
       }
       
       
       
       
       
       sc.close();
    }

	public static void sum(int sum) {
		System.out.println("모든 상품의 개수는 "+sum+"개입니다.");
	}
}
