package com.jbedu.ApiClass;

public class SystemClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long time= System.currentTimeMillis(); //현재시간을 밀리세턴드(1000/1 초) 단위로 반환
		
		System.out.println(time);
		
		long time2 = System.nanoTime();
		
		System.out.println("프로그램 시작");
		
		System.exit(0);//프로그램 강제 종료
		
		System.out.println("프로그램 종료");

	}

}
