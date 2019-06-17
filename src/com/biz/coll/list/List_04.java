package com.biz.coll.list;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class List_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = new LinkedList<Integer>();
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		
		for ( int i = 0 ; i < 50 ; i++) {
			int intR = rnd.nextInt(50);
			intList.add(intR);
		}
	
			
		// 키보드에서 임의 숫자를 입력받고
		// 그 숫자가 intList에 몇번에 포함되어있는지 찾아보기
		System.out.print("숫자입력(0~49)");
		String strNum = scan.nextLine();
		int intNum = Integer.valueOf(strNum);
		
		int listSize = intList.size();
		for(int i = 0 ; i < listSize ; i++) {
			if (intList.get(i) == intNum){
				System.out.println(i+"번째에 있음");
			}
		}
		
		int index =0;
		listSize = intList.size();
		for(Integer in : intList) {
			if(in == intNum) {
				index++;
				System.out.println(index+"번째에 있음");
				break; //찾앗으면 중단
			}
		}
		//못찾았으면 index값은 listsize보다 큼
		if(index >= listSize) {
			System.out.println("값을 찾지못함");
		}
		
	}

}
