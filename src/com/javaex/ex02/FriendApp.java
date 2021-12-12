package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

    	List<Friend> fList = new ArrayList<Friend>();
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("친구를 3명 등록해 주세요.");
    	
    	for(int i=0;i<3;i++) {
    		//1. Scanner로 받은 한 줄을 공백으로 끊어 문자열 배열 friend에 저장한다.
    		String[] friend = sc.nextLine().split(" ");
    		//2. Friend 객체를 생성해 friend 배열 안에 저장된 값을 생성자를 사용해 f 필드값에 넣어준다.
    		Friend f = new Friend(friend[0],friend[1],friend[2]);
    		//3. fList 필드에 add 메소드를 사용하여 객체 f의 주소를 저장한다.
    		fList.add(f);
    	}

    	
    	for(Friend f:fList) {
    		f.print();
    	}
    	
    	
    	sc.close();
    	
    	
    }

}
