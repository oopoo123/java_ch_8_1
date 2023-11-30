package com.jbedu.ApiClass;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "korea!";
		char strChar = str.charAt(3);
		System.out.println(strChar);
		
		String ssn = "881201-1234567";
		
		char ssnGender = ssn.charAt(7);
		
		if(ssnGender == '1') { //한글자라서 ''작은따옴표로 해야함
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
		
		int re1 = ssn.indexOf("88");
		//해당 문자열이 존재하면 그 문자열이 시작되는 인덱스 번호를 반환 -> 해당 문자열이 존재하지 않으면 -1을 반환
		System.out.println(re1);
		
		String str00 = "김길동";
		String str11 = str00.replace("김", "홍");
		System.out.println(str11);
		
		System.out.println(ssn.substring(0, 6));// 인덱스 0~5까지 슬라이싱(6은 포함 안됨)
		System.out.println(ssn.substring(6));// 인덱스 6부터 끝까지 슬라이싱
		
		
		String strnum = "1000000";
		
		int totalMoney = Integer.parseInt(strnum);//문자열 -> 정수로
		double totalMoney2 = Double.parseDouble(strnum);//문자열 -> 실수로
		
		Integer int1 = new Integer(strnum);
		
		double mok = totalMoney / 5;

	}

}
