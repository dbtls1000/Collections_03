package com.biz.coll.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strList = new ArrayList<String>();
		Random rnd = new Random();
		
		String _st = "";
		for(int i = 0 ; i < 50 ; i++) {
			//영문자 소문자 ASCII코드중 1개를 추출
			int intNum = rnd.nextInt(26)+65; // 대문자 / 소문자는 26 + 97 
			//추출한ASCII코드를 문자로 변경
			char charNum = (char)intNum;
			
			//문자를 문자열로 변경
			String strAlpha = String.valueOf(charNum);
			
			//생성된 문자열을 5개씩 묶어서
			//임의ㅢ 단어로 만들고 리스트에 추가해라
			_st += strAlpha;
			if((i+1) % 5 == 0) {
				strList.add(_st);
				_st = "";
			}
			
			
		}
		
		for(String s : strList) {
			System.out.println(s);
		}
		
		
	}

}
