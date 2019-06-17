package com.biz.coll.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class List_01 {
	public static void main(String[] args) {
		
		/*
		 * List
		 * 자바에서 사용되는 확장된 배열자료구조
		 * 자바에서 데이터와 관련해서 가장 많이 사용되는 구조
		 * 자바.util 패키지에 포함된 인터페이스\
		 * 
		 * List와 관련된 클래스
		 * ArrayList,LinkedList,Vector
		 * 
		 * List<클래스> 형식의 선언문
		 * 클래스는 어떠한 종류도 포함가능
		 */
		List<String> strList ;
		List<Integer> intList ;
		List<Float> flList ;
		List<Boolean> blList;
		List<Long> longList ; 
		List<Double> dbList;
		
		// int char float long double 과같은
		// 기본자료형은 포함X
		
		strList = new ArrayList<String>();
		intList = new ArrayList<Integer>();
		flList = new ArrayList<Float>();
		blList = new ArrayList<Boolean>();
		longList = new LinkedList<Long>();
		dbList = new Vector<Double>();
		
		// 자바 1.8이상에서는 ArrayList에 클래스를 명시하지 않아도
		// 문법상 오류가 나지는 않지만
		// 호환성을 위해서 클래스를 명시 하는것이 좋다.
		
		/*
		 * ArrayList는 List자료구조중 가장 많이 사용되고
		 * 내부적으로 가장 단순한 구조이며
		 * 기본 배열구조와 매우 유사하게 작동
		 * 
		 * LinkedList는 List자료구조중 가장 복잡한 구조이고
		 * List 중간중간에 추가, 삭제가 자주 일어나는 경우
		 * 매우 효율적으로 작동되는 형식
		 * 
		 * Vector는 쓰레드 프로젝트에서 항상
		 * 순차적으로 실행되어 안전성이 보장된다.
		 */
		
		
	}
}
