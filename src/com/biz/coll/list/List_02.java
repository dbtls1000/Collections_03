package com.biz.coll.list;

import java.util.LinkedList;
import java.util.List;

public class List_02 {
	public static void main(String[] args) {
		
		/*
		 *  중간중간 데이터를 삭제, 추가가 자주 일어날것 같을때
		 *  ArrayList보다 LinkedList를 사용하는 것이 좋다.
		 * List 인터페이스를 사용해서 객체를 선언해주면 필요에따라서 클래스를 바꿀때
		 * 오류가 일어나지 않음  
		 */
		List<String> strList = new LinkedList<String>();
		
		//리스트에 데이터추가
		strList.add("홍길동"); // 0
		strList.add("성춘향"); // 1
		strList.add("이몽룡"); // 2
		strList.add("임꺽정"); // 3
		strList.add("장녹수"); // 4
		
		//list를 확인할때
		for(String s : strList) {
			System.out.println(s);
		}
		
		System.out.println("========");
		
		//중간에포함된 리스트를 변경하고자 할때
		//3번위치의 임꺽정을 장보고로 변경
		strList.set(3, "장보고");
		for(String s : strList) {
			System.out.println(s.toString());
		}
		
		System.out.println("========");
		
		//중간에 포함된 리스트를 삭제하고자 할때
		strList.remove(2); //2번위치의 리스를 제거
		
		for(String s : strList) {
			System.out.println(s);
		}
		//중간에 리스트를 삭제하면
		//자동으로 전체 크기가 1만큼 감소
		
		//리스트 중간의 한개의 값을 읽어서 변수에 담기
		String strName = strList.get(2);
		System.out.println(strName);
		
		System.out.println("========");
		
		//리스트 특정위치에 추가하기
		strList.add(2, "장영실");
		for(String s : strList) {
			System.out.println(s);
		}
		
	}
}
