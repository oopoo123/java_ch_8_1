package com.jbedu.interfacetest;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Car car = new Car(); 인터페이스는 생성자로 객체를 선언할 수 없다
		
		//인터페이스는 생성자로 객체를 선언할 수는 없지만 인터페이스를 구현하고 있는 (자식)클래스 객체를 대입 받아 객체를 생성할 수 있다.
		Car car = new Bus();
		Truck truck = new Truck();
		Car car2 = truck;
		
		Car car3;
		Bus bus2 = new Bus();
		car3 = car2;
		//car3.test(// 실행불가 -> 인터페이스  내에 추상 메소드만 호출 가능
		
		bus2 = (Bus) car3;// 강제형변환
		
		BusSub busSub = new BusSub();
		car3 = busSub;
		
		car3.breakPedal();

	}

}
