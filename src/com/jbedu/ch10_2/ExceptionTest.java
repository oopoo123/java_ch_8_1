package com.jbedu.ch10_2;

public class ExceptionTest {
	
	public static void main(String[] args) {
		
		int a = 10;
		
		int[] arr = {1,2,3};
		
		//예외처리
		try {
			int result = a / 0;
		} catch (Exception e) {
			System.out.println("모든 수는 0으로 나눌 수 없습니다");
			System.out.println(e); //내가 에러의 내용을 보겠다
		}
		
		try {
			System.out.println(arr[7]);
			int result2 = a / 0;
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); // 에러베시지 출력
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace(); // 에러베시지 출력
		} catch (Exception e) { //모든 에러 catch
			e.printStackTrace(); // 에러베시지 출력
		} finally {
			System.out.println("에러의 발생여부와 상관없이 반드시 실행됨");
		}
		
		ThrowsTest throwsTest = new ThrowsTest();
		// test 메소드에 throws 에러 떠넘기기
		throwsTest.test(10);
		
	}
	
	

}
