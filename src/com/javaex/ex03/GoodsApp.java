package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

	//고민헤보기: 이 상태에선 try catch 예외 상황 처리 코드를 어떻게 삽입해야할까?
    public static void main(String[] args){

    	List<Goods> gList = new ArrayList<Goods>();
    	
    	//반복문 밖에 총합 선언
    	int sum=0;
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("상품을 입력해주세요.(종료 q)");
       
    	while(true) {//반복문 시작
    		String product = sc.nextLine();
    		if(product.equals("q")) {//문자 q 입력시 반복문 탈출
    			break;
    		}else {
    			String[] pArray = product.split(",");
    			//int 타입 필드값을 String 타입 Goods 객체에 저장하기 위해 자료형 변경(String>Int)
    			Goods goods = new Goods(pArray[0],Integer.parseInt(pArray[1]),Integer.parseInt(pArray[2]));
    			gList.add(goods);
    			//객체에 저장된 count 필드값을 그때그때 총합에 더함
    			sum=sum+goods.getCount();
    		}
    		
    	}
     
    	System.out.println("[입력 완료]");
    	System.out.println("================");
    	
    	for(Goods g:gList) {
    		
    		g.showInfo();
    	}
    	
    	
    	System.out.println("모든 상품의 개수는 "+sum+"개입니다.");
       
       
    	sc.close();
    }


}
